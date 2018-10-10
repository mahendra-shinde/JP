SELECT * FROM USER_TABLES;

select * from tab;
SELECT FIRST_NAME, DEPARTMENT_NAME, CITY, COUNTRY_NAME FROM EMPLOYEES 
JOIN DEPARTMENTS USING (DEPARTMENT_ID)
JOIN LOCATIONS USING (LOCATION_ID)
JOIN COUNTRIES USING (COUNTRY_ID);

SELECT FIRST_NAME, DEPARTMENT_NAME, CITY, COUNTRY_NAME FROM EMPLOYEES 
JOIN DEPARTMENTS USING (DEPARTMENT_ID)
JOIN LOCATIONS ON (Departments.LOCATION_ID=LOCATIONS.LOCATION_ID)
JOIN COUNTRIES USING (COUNTRY_ID);

SELECT * FROM EMPLOYEES;
SELECT * FROM JOBS;

SELECT FIRST_NAME, LAST_NAME, SALARY, JOB_TITLE,MIN_SALARY,MAX_SALARY
FROM EMPLOYEES JOIN JOBS USING (JOB_ID);

SELECT concat(concat(concat(concat(concat(FIRST_NAME, LAST_NAME),' earns '),SALARY),' as '),JOB_TITLE) Earning
,MIN_SALARY,MAX_SALARY,(MIN_SALARy+MAX_SALARY/2)as AVG
FROM EMPLOYEES JOIN JOBS USING (JOB_ID);

SELECT MIN(HIRE_DATE),MAX(HIRE_DATE) FROM EMPLOYEES;
SELECT DEPARTMENT_ID, MIN(HIRE_DATE),MAX(HIRE_DATE) 
FROM EMPLOYEES 
GROUP BY DEPARTMENT_ID order by DEPARTMENT_ID asc;

select department_id, count(*) COUNTER from EMPLOYEES
group by DEPARTMENT_ID order by DEPARTMENT_ID
;

select MANAGER_ID, count(*) COUNTER from EMPLOYEES
group by manager_ID order by MANAGER_ID
;

select MANAGER_ID, avg(salary) from EMPLOYEES
--where manager_id<120  --filter before grouping
group by manager_ID 
having MANAGER_ID < 120 and AVG(SALARY) > 5000   --filter after grouping
;


select last_name from EMPLOYEES where SALARY> (select salary from EMPLOYEES where last_name = 'Abel');


select FIRST_NAME, LAST_NAME, SALARY from employees where SALARY > 
(
select avg(salary) from EMPLOYEES where DEPARTMENT_ID = 
(
select DEPARTMENT_ID from DEPARTMENTS where DEPARTMENT_NAME='IT'
)
) 
order by SALARY desc;


Select EMPLOYEE_ID, last_name, job_id, salary from employees
where salary < ANY (select salary from employees where job_id='IT_PROG')
;


CREATE TABLE BOOKS (
bookid number(4) primary key,
title varchar(30) not null,
author varchar(20) default 'Khan'
);


INSERT into BOOKS (bookid,title) values (101,'head first java');
INSERT into BOOKS values (102,'head first pyhton','');

select * from books;
update BOOKS
set AUTHOR = 'Khan';
commit;

DROP table books;

DELETE FROM BOOKS;

TRUNCATE TABLE BOOKS;