SELECT * FROM USER_TABLES;
SELECT * FROM USER_CONSTRAINTS;
SELECT * FROM USER_INDEXES;
SELECT * FROM USER_SEQUENCES;
SELECT * FROM TAB;


SELECT * FROM EMP;
SELECT ENAME FROM EMP; --projection of ENAME
SELECT * FROM EMP where SAL > 4000; --selection
SELECT ENAME,SAL FROM EMP where SAL > 4000; -- selection with projection
SELECT ENAME,SAL FROM EMP WHERE ROWNUM < 10 ORDER BY SAL DESC;

SELECT count (DISTINCT JOB) FROM EMP;
SELECT count (JOB) FROM EMP;
SELECT DISTINCT * FROM EMP; -- Distinct was failed because of *


SELECT ENAME,SAL FROM EMP WHERE SAL BETWEEN 2000 AND 4000; --between, boundary values inluded
SELECT ENAME,SAL FROM EMP WHERE SAL != 800;

SELECT * FROM DEPT;
SELECT * FROM DEPT WHERE DEPTNO IN (20,30);
SELECT * FROM DEPT WHERE DEPTNO = 20 or DEPTNO = 30;
SELECT * FROM DEPT WHERE DEPTNO NOT IN (20,30);
SELECT * FROM DEPT WHERE DEPTNO != 20 and DEPTNO != 30;

SELECT * FROM EMP;
SELECT ENAME FROM EMP WHERE ENAME like 'S%I%';
SELECT ENAME,COMM FROM EMP WHERE COMM is not null;
SELECT ENAME "EMPLOYEE NAME",COMM COMMISION FROM EMP WHERE COMM is not null;


SELECT * FROM DEPT;


--1. List all department names in desc order.
select dname from dept order by dname desc;
--2. List all department names that begins with "S"
select dname from dept where dname like 'S%';
--3. List all departments from CHICAGO
select dname from dept where loc = 'CHICAGO';
--4. List all departments where name does not END with "S"
select dname from dept where dname not like '%S';