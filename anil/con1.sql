select * from EMP; 

select ename from EMP;

select ename as 'Employee Name' from emp

select * from EMP where sal>4000;

select ename from EMP where sal>4000;

select * from TAB;

select * from user_tables;

select ename,sal from emp where rownum < 5 order by sal desc; 

select distinct job from emp;

select job from emp;

select ename from emp where sal between 2000 and 4000;

select * from dept where deptno != 20 and deptno <> 30;

select ename from emp where ename like 'S%T';

select ename,comm from emp where comm is not null;

select ename,comm from emp where comm is null;

select dname from dept order by dname;

select * from emp order by deptno desc, JOB;

select TO_CHAR(sysdate, 'DD-MM-YYYY') from dual;

select * from EMP where to_char(HIREDATE, 'YYYY') BETWEEN 1981 AND 1987;

select * from EMP where to_char(HIREDATE, 'MON') = 'APR';

SELECT ENAME, TO_CHAR(hiredate, 'MONTH YY') as "Joining Month" from emp;