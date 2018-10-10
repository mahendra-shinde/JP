select * from tab;
COUNTRIES	TABLE	
DEPARTMENTS	TABLE	
EMPLOYEES	TABLE	
EMP_DETAILS_VIEW	VIEW	
JOBS	TABLE	
JOB_HISTORY	TABLE	
LOCATIONS	TABLE	
REGIONS	TABLE	
select * from DEPARTMENTS
job_id

SELECT FIRST_NAME, Last_NAME, JOB_TITLE, MIN_SALARY, MAX_SALARY , (MAX_SALARY+MIN_SALARY)/2 as avgSalary from EMPLOYEES  join JOBS using(JOB_ID)


select First_Name, Department_Name from EMPLOYEES inner join DEPARTMENTS using(Department_id)

select First_Name, Department_Name from EMPLOYEES inner join DEPARTMENTS on EMPLOYEES.Department_id = DEPARTMENTS.Department_id


select First_Name, Department_Name from EMPLOYEES Natural join DEPARTMENTS 

SELECT department_id, JOB_ID , AVg(SALary) from employees group by department_id, JOB_ID

SELECT department_id, JOB_ID , SUM(SALary) from employees group by department_id, JOB_ID

SELECT  Department_Name, MIN(hire_date),Max(hire_date) from employees join DEPARTMENTS using(Department_id) group by Department_Name

SELECT Department_id, count(*) as TOTAlEMPLOYESS from employees group by Department_id
---------------------------
SELECT * from employees

SELECT  MANAGER_ID, count(*) As TotalSUBordinates from employees  e self join employees  b on  e.MANAGER_ID = b. group by MANAGER_ID  

SELECT MANAGER_ID, count(*) As TotalSUBordinates from employees as e join employees as b group by MANAGER_ID

SELECT MANAGER_ID, count(*) As TotalSUBordinates from employees  group by MANAGER_ID having avg(salary) >5000

-------------------------------------

SELECT last_name from employee where salary > (SELECT salary from employees where last_name = 'Abel')


Select AVG(salary) from employees join group by dept

SELECT  Department_Name, MIN(hire_date),Max(hire_date) from employees join DEPARTMENTS using(Department_id) group by Department_Name
60
 select First_NAme from employees where salary > (  SELECT AVG(SALARY) as AVGSALARY_ITDEPT from employees  where DEPARTMENT_ID = 60)
 
 select First_NAme, salary from employees where salary > (  SELECT AVG(SALARY)  from employees  where DEPARTMENT_ID = (
 Select DEPARTMENT_ID from DEPARTMENTS where department_name = 'IT'))
 9000
6000
4800
4800
4200
 
 SELECT * from employees where SALARY > ANY (Select salary from employees where job_id ='IT_PROG')
 
