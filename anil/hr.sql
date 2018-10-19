SELECT FIRST_NAME, DEPARTMENT_NAME, CITY FROM EMPLOYEES JOIN DEPARTMENTS USING (DEPARTMENT_ID) JOIN LOCATIONS USING (LOCATION_ID);

--'ON' word in below statement is used because because department id is named as dept_id in one table and department_id in other table
SELECT FIRST_NAME, DEPARTMENT_NAME, CITY FROM EMPLOYEES E JOIN DEPARTMENTS D ON (E.DEPARTMENT_ID = D.DEPARTMENT_ID) JOIN LOCATIONS USING (LOCATION_ID);


SELECT FIRST_NAME, DEPARTMENT_NAME, CITY, COUNTRY_NAME FROM EMPLOYEES JOIN DEPARTMENTS USING (DEPARTMENT_ID) JOIN LOCATIONS USING (LOCATION_ID) JOIN COUNTRIES USING (COUNTRY_ID);

SELECT FIRST_NAME, SALARY, JOB_TITLE, MIN_SALARY, MAX_SALARY, (MIN_SALARY+MAX_SALARY)/2 AVG_SALARY FROM EMPLOYEES JOIN JOBS USING (JOB_ID);

SELECT MIN(HIRE_DATE),MAX(HIRE_DATE) FROM EMPLOYEES;

-- Group by can have a particular column which is not present in select but select cannot have any particular column which is not present in Group by
SELECT DEPARTMENT_NAME, MIN(HIRE_DATE),MAX(HIRE_DATE) FROM EMPLOYEES JOIN DEPARTMENTS USING(DEPARTMENT_ID) GROUP BY DEPARTMENT_NAME;

SELECT COUNT(EMPLOYEE_ID) AS "NO. OF EMP'S", DEPARTMENT_ID, DEPARTMENT_NAME FROM EMPLOYEES JOIN DEPARTMENTS USING (DEPARTMENT_ID)GROUP BY DEPARTMENT_ID,DEPARTMENT_NAME;


--Having condition can only be used in conjuntion with group by and not without group by
select manager_id, avg(salary) from employees
where manager_id <120  -- Filter before grouping 
group by manager_id
having avg(salary) > 5000; -- Filter after grouping

select last_name, salary 
from employees 
where salary > (select salary from employees where last_name = 'Abel');

select last_name, salary from employees where last_name = 'Abel';

SELECT FIRST_NAME, SALARY, AVG(SALARY) AS AVG_SAL_IT FROM EMPLOYEES WHERE SALARY > (SELECT AVG(SALARY) FROM EMPLOYEES WHERE DE);

SELECT AVG(SALARY) FROM EMPLOYEES WHERE DEPARTMENT_ID = 'IT';

SELECT DEPARTMENT_ID, DEPARTMENT_NAME FROM EMPLOYEES JOIN DEPARTMENTS USING (DEPARTMENT_ID), DEPARTMENT_NAME;
SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY 
FROM EMPLOYEES 
WHERE SALARY < ANY 
    (SELECT SALARY 
    FROM EMPLOYEES 
    WHERE JOB_ID='IT_PROG');

CREATE TABLE BOOKS12345 (
    BOOK_ID NUMBER(4) PRIMARY KEY,
    TITLE VARCHAR(30) NOT NULL,
    AUTHOR VARCHAR(20) DEFAULT 'ANONYMUS');

DROP TABLE BOOKS1234;

INSERT INTO BOOKS123 (BOOK_ID, TITLE)
VALUES (101, 'HEAD FIRST JAVA');

INSERT INTO BOOKS123 (BOOK_ID, TITLE)
VALUES (102, 'HEAD FIRST PYTHON');

SELECT * FROM BOOKS123;

UPDATE BOOKS123
SET AUTHOR = 'ANIL'
WHERE BOOK_ID = 101;

-- 11/10/2018 Procedures & Functions

-- Everytime we login to database we need to execute the below statement to turn the server outputs
-- Turn of OUTPUT Statements
set serveroutput on;

-- Sample stored procedure to display a message
begin
    dbms_output.put_line('Hello World');
end;

exec dbms_output.put_line('Hello World');

CREATE or REPLACE procedure update_locations AS
begin
	dbms_output.put_line('Updating table');
    UPDATE locations
    set city = 'Mumbai'
    where POSTAL_CODE = '11932';
    DBMS_OUTPUT.PUT_LINE('UPDATED!');
END;

CALL UPDATE_LOCATIONS()



CREATE or REPLACE FUNCTION COUNT_EMP ( DEPT NUMBER ) return
number as 
    p_count number;
begin
    select count(*) into p_count from employees
    where department_id = dept;
    return p_count;
end;

select department_name, count_emp(department_id) from departments;


CREATE view deptView AS
SELECT department_id, sum(salary)as Total, min(salary)as Lowest, avg(salary)as Average from employees
grup by department_id;

select department_id, average from
deptview

SELECT column_name(s)
FROM table1
LEFT JOIN table2 ON table1.column_name = table2.column_name;