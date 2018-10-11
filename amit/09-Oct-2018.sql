select * from tab;
select count(*) from tab;

select * from user_tables;

select * from user_indexes;

select * from user_sequences;

select * from user_views;

select * from user_constraints;


select * from emp;

select ename from emp;

select * from emp where sal > 600;

select * from emp where sal > 4000;

select empno, ename, job, sal, deptno from emp where sal > 4000;

select empno, ename, job, sal, deptno from emp where sal >= 2000 and sal <= 4000;

select empno, ename, job, sal, deptno from emp where sal between 2000 and 4000;


select ename,sal from emp where rownum <5 order by sal desc;

select * from emp order by sal desc;

select job from emp;

select distinct job from emp;

select * from emp;
select * from dept where deptno in (20,30);

select * from emp where deptno not in (20,30);

select * from dept where deptno = 20 or deptno =30;
select * from dept where deptno <> 20 and deptno !=30;

select * from emp where ename like '%TH';
select * from emp where ename like '___T%';

select * from emp where ename like 'S%T';

select * from emp where ename like '%TT';

select * from emp where comm is null;

select * from emp where comm is not null;

select ename as "Employee Name" from emp where comm is not null;

--Assignment
select dname from dept order by dname desc;
select * from emp order by ename desc,comm asc;

select dname from dept where dname like 'S%';

select dname from dept where loc ='CHICAGO';

select dname from dept where dname not like '%S';

--10-Oct-2018

select to_char(sal, '0,000') "Salary" from emp;

select to_char(sysdate, 'DD-MM-YYYY') from dual;

select to_char(to_date('10/10/2018', 'DD-MM-YYYY')) from dual;

select to_char(sysdate, 'DDspth " Day of " MMspth " Month of " Year') from dual;

select * from emp where to_char(hiredate,'YYYY') = '1980';

select * from emp where to_char(hiredate,'MM') = '12';

select * from emp where to_char(hiredate,'MM') between 9 and 12;

select * from emp where to_char(hiredate,'MM') in (9,12);


select ename, to_char(hiredate, 'MONTH YY') as "Joning Month" from emp;

select (nvl(comm,0)+ sal) as "Salary" from emp;

select ename, sal from emp where to_number('1,500','9,000')  < sal;

select * from dual;

select to_number('1,500','9,999')  from dual;

select to_char(sal, '$9,999') "Salary" from emp;

select to_char(sal, '$0,000') "Salary" from emp;

select upper(ename), lower(ename) from emp;

select to_char(avg(sal), '$9,999.00') as "Average Salary" from emp;

select  concat(initcap(ename),' JPMC'), lpad(sal,10,'*'),rpad(sal,10,'*') from emp;

select min(sal), max(sal), sum(sal) from emp;

select add_months(sysdate,1) from dual;

select hiredate,round(hiredate,'year') as "Rounded" from emp;

select hiredate,add_months(hiredate,36) as "Contract End Date", months_between(sysdate, hiredate)  from emp;

select ename , sal, comm, (nvl(comm,0)+ sal) as "Net Salary" from emp order by "Net Salary";

select ename, sal, rank() over (order by sal) from emp;

select ename, sal, dense_rank() over (order by sal) from emp;

--Equi Join
select ename, dname from emp e join dept d on (e.deptno = d.deptno);

select ename, dname from emp , dept where emp.deptno = dept.deptno;

select ename, dname from emp join dept using (deptno);


--Non Equi

select ename, sal, grade from emp e join salgrade d on (e.sal between d.losal and d.hisal);

select ename, sal, grade from emp , salgrade where emp.sal between salgrade.losal and salgrade.hisal;


--left outer join
select ename, dname from emp left join dept using (deptno);

--right outer join
select ename, dname from emp right join dept using (deptno);

--full outer join
select ename, dname from emp full join dept using (deptno);



