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


SELECT * FROM EMP Order by DEPTNO desc, SAL asc;

select sysdate from dual;
select SYSTIMESTAMP from dual;
select systime from dual;

SELECT TO_CHAR(SYSDATE,'DD-MM-YYYY') FROM DUAL;
SELECT TO_CHAR(SYSDATE,'DD-MON-YYYY') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'DDspth " Day of " MMspth " Month of " YEAR') from dual;--


select * from emp;
select * from emp where to_char(HIREDATE,'YY')=81;
select * from emp where to_char(HIREDATE,'MM')=02;
select * from emp where to_char(HIREDATE,'DD')=02;

select * from emp where to_char(HIREDATE,'MM') between 02 and 03;


select ename, to_char(hiredate, 'MONTH YYYY hh":"mm":"ssss') "Joining Month" from emp;


select * from dual;

select ename, sal from emp where to_number ('1,500','9,000')< SAL;

select to_number('5,400.00','9,999.00') from dual;
select to_char(7894,'$9,999') from dual;

select upper(ename) from emp;
select lower(ename) from emp;
select avg(sal) from emp;


select INITCAP(ename) from emp;
select INITCAP(CONCAT(ename,' GOODS')) from emp;
select LPAD(ename, 10,'*') from emp;
select RPAD(ename,10,'*') from emp;
select concat (concat (ename,' '),job) from emp;

select least (sal) from emp;
select min(sal) from emp;

select hiredate, round (hiredate,'year') from emp;
select hiredate, add_months(hiredate,36) as FIREDATE, 
months_between(HIREDATE,add_months(hiredate,36) ) from emp;

select round (hiredate,'month') from emp;


select ename, sal, comm, sal+nvl(comm,0) as "net income" from emp;


select ename, sal, rank() over (order by sal desc) from emp  ;

select * from SALGRADE;


--equi join
select ename, dname from emp e, dept d where e.deptno = d.deptno;
select ename, dname from emp e join dept d on e.deptno = d.deptno;
select ename, dname from EMP join dept using (deptno);

--non-equi join
select ename, sal, grade from emp e join salgrade s
on (e.sal between s.losal and s.hisal);

select * from emp;


SELECT ename, dname from emp e join dept d using (deptno);
SELECT ename, dname from emp e left join dept d using (deptno);
SELECT ename, dname from emp e right join dept d using (deptno);
SELECT ename, dname from emp e full join dept d using (deptno);




SELECT * from emp e natural join dept d;
SELECT * from emp e natural join SALGRADE d;

select empno from emp
intersect
select empno from emp;