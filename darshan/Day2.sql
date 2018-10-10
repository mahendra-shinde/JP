SELECT
    *
FROM
    DEPARTMENTS;


-- JOIN THREE TABLES - (a+b)+c USING KEY

SELECT
    first_name,
    department_name,
    city,
    region_name,
    country_name
FROM
    employees
    JOIN departments USING ( department_id )
    JOIN locations USING ( location_id )
    JOIN countries USING ( country_id )
    JOIN regions USING ( region_id );
    
    
    -- JOIN THREE TABLES - (a+b)+c ON KEY

SELECT
    first_name,
    department_name,
    city,
    region_name,
    country_name
FROM
    employees e
    JOIN departments d ON ( e.department_id = d.department_id )
    JOIN locations l ON ( d.location_id = l.location_id )
    JOIN countries c ON ( l.country_id = c.country_id )
    JOIN regions r ON ( c.region_id = r.region_id );
    
-- CROSS JOIN

SELECT
    country_name,
    region_name
FROM
    countries
    CROSS JOIN regions;

-- NATURAL JOIN

SELECT
    country_name,
    region_name
FROM
    countries
    NATURAL JOIN regions;
    
-- ON JOIN

SELECT
    first_name,
    last_name,
    salary,
    job_title,
    min_salary,
    max_salary,
    ( min_salary + max_salary ) / 2 AS "Average"
FROM
    employees e
    JOIN jobs j ON ( e.job_id = j.job_id );


-- JOIN WHERE CLAUSE

SELECT
    first_name,
    last_name,
    salary,
    job_title,
    min_salary,
    max_salary
FROM
    employees e,
    jobs j
WHERE
    e.job_id = j.job_id;
    
-- GROUP BY

SELECT
    department_id,
    AVG(salary)
FROM
    employees
GROUP BY
    department_id;


-- WITHOUT GROUP BY    

SELECT
    MIN(hire_date),
    MAX(hire_date)
FROM
    employees;

-- WITH GROUP BY

SELECT
    MIN(hire_date),
    MAX(hire_date)
FROM
    employees
GROUP BY
    department_id;

SELECT
    department_id,
    COUNT(1)
FROM
    employees
GROUP BY
    department_id;

SELECT
    manager_id,
    COUNT(1)
FROM
    employees
GROUP BY
    manager_id;

SELECT
    manager_id,
    AVG(salary)
FROM
    employees
WHERE
    manager_id < 120 -- filter before grouping 
GROUP BY
    manager_id
HAVING
    AVG(salary) > 5000; -- filter after grouping


-- SUBQUERY

SELECT
    first_name,
    salary
FROM
    employees
WHERE
    salary > (
        SELECT
            AVG(salary)
        FROM
            employees
        WHERE
            department_id = (
                SELECT
                    department_id
                FROM
                    departments
                WHERE
                    department_name = 'IT'
            )
    );
    
    
( SELECT
    salary
  FROM
    employees whEre
job_id = 'IT_PROG');


SELECT * FROM JOB_HISTORY;

-- UNION QUERY
SELECT EMPLOYEE_ID FROM JOB_HISTORY  
UNION
SELECT EMPLOYEE_ID FROM EMPLOYEES ;
    
    
-- UNION QUERY
SELECT EMPLOYEE_ID FROM JOB_HISTORY  
UNION all
SELECT EMPLOYEE_ID FROM EMPLOYEES ;



-- INTERSECT QUERY
SELECT EMPLOYEE_ID FROM JOB_HISTORY  
INTERSECT
SELECT EMPLOYEE_ID FROM EMPLOYEES ;


-- MINUS QUERY
SELECT EMPLOYEE_ID FROM JOB_HISTORY  
MINUS
SELECT EMPLOYEE_ID FROM EMPLOYEES ;


-- CREATE TABLE
CREATE TABLE books (
    bookid   NUMBER(4) PRIMARY KEY,
    title    VARCHAR(30) NOT NULL,
    author   VARCHAR(20) DEFAULT 'Anonymus'
);

--DROP TABLE BOOKsS;

DROP TABLE bookss;

Insert into books(bookid, title)
values (101, 'Head First Java');

Insert into books(bookid,title)
values (102, 'Head first pyton');

select * from books;

update books
set author = 'Darshan'
where bookid=101;

update books
set author = 'Chaudhari'
where bookid=102;