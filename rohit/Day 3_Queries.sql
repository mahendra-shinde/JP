Select * from tab

-- multiple table join
-- (A+B) +C
Select first_name, department_name, city from employees JOIN departments using (department_id) Join locations using (location_id)

Select first_name, department_name, city, country_id from employees JOIN departments using (department_id) Join locations using (location_id) JOIN Countries using (Country_ID)

--Below query is using ON  - should be used when the same column is having a different name in 2 tables., USING should be used when column name is same in all tables
Select first_name, department_name, city from employees e JOIN departments d ON (e.department_id = d.department_id) JOIN locations using (location_id)

Select country_name, region_name from Countries Cross JOIN Regions --Cross Join

Select country_name, region_name from Countries Natural JOIN Regions --Natural Join

---Display First_name of employee along with Job title and Current Salary and min sal and max sal at his title
Select first_name, Salary, job_title, min_salary, max_salary from Employees Join Jobs using (job_id)

---Display First_name of employee along with Job title and Current Salary and min sal and max sal at his title and AVERAGE SALARY
Select first_name, Salary, job_title, min_salary, max_salary, (min_salary + max_salary) /2 as "Average Salary" from Employees Join Jobs using (job_id)

--- Group By
Select department_id, to_char(Avg(Salary), '$99,999,999')from Employees Group BY department_id;

Select to_char(Avg(Salary), '$99,999,999')from employees Group By department_id

Select department_id, MIN(hire_date), MAX(HIRE_DATE) FROM EMPLOYEES Group By department_id order by department_id ASC

Select MIN(hire_date), MAX(HIRE_DATE) FROM EMPLOYEES 

-- List department_id with no of employees
Select department_id, COUNT(first_name)as "Employees" from Employees group by department_id

-- List manager_id with number of subordinates

Select manager_id, COUNT(first_name) as "Employees" from Employees group by manager_id

Select manager_id, AVG(Salary) from employees
where manager_id <120 --- filter before grouping
group by manager_id
having AVG(Salary) > 5000 --- filter after grouping

-- List all employees earning more salary than average salary of IT department
Select first_name from employees as "Employees" where Salary > 
(Select AVG(Salary) from employees where department_id = (
Select department_id from departments where department_name = 'IT'))

Select last_name, salary from employees 
where salary > ANY (3999, 5000)--- Any Operator - x> ANY(y,z)

Select last_name, salary from employees 
where salary > ALL (3999, 5000)

Select employee_id, last_name, job_id, salary from employees
where Salary < ANY (
Select salary from employees
where job_id = 'IT_PROG')