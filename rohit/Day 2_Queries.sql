Select * from user_tables;

Select * from user_constraints;

Select * from User_indexes;

Select * from user_sequences;

Select * from Emp;--

Select ename from emp; -- example of Projection

Select * from Emp where sal > 4000; -- example of Selection

Select EMPNo, Ename , Hiredate, Sal from Emp where Sal > 200

Select ename, Sal from Emp where rownum < 5 order by sal DESC;

Select Distinct job from emp;

Select * from EMP where sal between 2000 and 4000;

Select * from Dept where deptno IN (20,30)

Select * from Dept where deptno NOT IN (20,30)

Select * from Emp where Sal between 1500 and 2500;

Select * from Emp Order by HireDate;

Select * from Emp where HireDate between '02-1-1981' and '02-1-1983';

Select * from Emp where ename like '___T%';

Select * from EMP where ename like 'S%T';

Select ename, comm from EMP where COMM is not null;

Select ename, comm from EMP where COMM is NULL;

Select ename as "Emplyee Name" from emp;


--Assignment Day 2

-- List all Dept Names in Descending order
Select dname from Dept order by dname DESC

--List all Depat names that begin with "S"
Select dname from Dept where dname like 'S%'

--List all Dept from Chiacago
Select dname from dept where LOC = 'CHICAGO'

-- List All dept where name does not end with S.
Select dname from dept where dname Not like '%S'

Select * from EMP Order by Deptno DESC, job ASC

Select To_Char(SYSDATE, 'DD-MM-YYYY') from Dual;

Select To_Char(sysdate, 'DDspth "Day of"  MMspth "Month of" Year') from dual;

Select * from emp where to_char (hiredate, 'YYYY') = 1981

Select * from emp where to_char (hiredate, 'MM') = 2

Select * from emp where to_char (hiredate, 'Month') = 'Feb'

Select * from emp where to_char (hiredate, 'YYYY') between 1981 and 1982 Order by Sal

Select ename, to_char(hiredate, 'Month YY') AS "Joining Month" from emp;

Select * from emp where to_char (hiredate, 'MM') between 2 and 5 Order by Sal

Select ename,sal from emp where to_number('1,500','9,000') < sal

Select to_number ('5,400' , '9,999') from Dual

Select to_char ('85548845' , '99,99,99,999') from Dual

Select to_char ('85548845' , '$99,99,99,999') from Dual

Select to_char ('85548845' , '00,99,99,999') from Dual

Select upper(ename) from emp -- single row function

Select Avg(sal) from emp -- multi row function or Agrregate function

Select to_char(Avg(sal), '99999.00') from emp

Select ename , Lpad(sal, 10, '*') from emp

Select ename , Lpad(sal, 4, '*') from emp

Select initcap('MAHENDRA SHINDE') FROM DUAL

Select min(sal) from emp 

Select max(sal) from emp

Select concat(Concat(ename, ' '), job) from emp

Select hiredate, round(hiredate, 'month') from emp

Select hiredate, round(hiredate, 'year') from emp

Select hiredate, add_months(hiredate,36) as "Contract End date" from emp

select ename, sal, comm, sal+comm as "Net Income" from emp order by Sal

select ename, sal, comm, sal+nvl(comm,0) as "Net Income" from emp order by Sal

Select ename, sal, rank() over (order by Sal) from emp

Select ename, sal, dense_rank() over (order by Sal) from emp

-- Equi Join
Select ename, dname from emp e Join Dept d on (e.deptno= d.deptno)
Select ename, dname from emp Join Dept using (Deptno)

--Non Equi join
Select ename, Sal, Grade from emp e JOIN salgrade d ON (e.sal between d.losal and d.hisal)

--Inner Join:
Select ename, dname from emp e Join Dept d using (Deptno)

--left Outer Join 
Select ename, dname from emp e LEFT JOIN Dept d using (Deptno)

--Right Outer Join
Select ename, dname from EMP e Right JOIN dept d using (Deptno)

-- Full Outer Join
Select ename, dname from EMP e FULL JOIN dept d using (Deptno)



