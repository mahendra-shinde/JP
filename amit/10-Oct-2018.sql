select * from tab;

---joining multiple table
select first_name ,
department_name ,
country_id,
city from employees 
join departments using (DEPARTMENT_ID) 
join locations using (location_id) 
join countries using (country_id);

--join without using "using clause"
select first_name ,department_name from employees join departments ON (employees.department_id = departments.department_id);

--cross join
select country_name, region_name from countries cross join regions;

--Natural join
select country_name, region_name from countries natural join regions;

select * from employees;
select * from departments;

select * from locations;

select * from countries;
select * from jobs;

--publish employee details, job id, min salary and max salary
select first_name, last_name,salary, job_id,min_salary, max_salary from employees join jobs using (job_id) order by salary asc;

select first_name, 
last_name,
salary, 
job_id,
min_salary, 
max_salary, 
(min_salary+max_salary)/2 as "Average Salary" 
from employees join jobs 
using (job_id) order by salary asc;


select * from employees;
select * from departments;

select * from locations;

select * from countries;
select * from jobs;

--group by
select department_id,job_id, to_char(avg(salary),'$9,999,999,99') from employees group by department_id,job_id order by department_id asc;

select department_id, min(hire_date), max(hire_date) from employees group by department_id order by department_id asc;

-- list of department_id with number of employees
select department_id, count(last_name) as "Employees" from employees group by department_id order by department_id asc;

--list manager_id with number of subordinates
select manager_id, count(last_name) as "Employees" from employees group by manager_id order by manager_id asc;

--having clause
select manager_id, avg(salary) as "Employees" from employees where manager_id < 120 group by manager_id  having avg(salary) > 5000 order by manager_id asc;


--subquery
select last_name from employees where salary > (select salary from employees where last_name ='Abel');

select * from employees;
select * from departments;
select * from jobs;


select last_name, salary from employees where salary > (select avg(salary) from employees where department_id =(select department_id  from departments where department_name='IT'));

select employee_id, last_name, salary from employees where salary < any (select salary from employees where job_id='IT_PROG');





Create table books (

    bookid number(4) primary key,
    title varchar2(30) not null,
    author varchar(20) default 'Anonymous'
    
    );

Insert into books(bookid, title) values (101, 'Head First java');

Insert into books(bookid, title) values (102, 'Head First python');

select * from books;

update books set author = 'Amit' where bookid =102;
commit;

delete from books where author = 'Mahendra';



