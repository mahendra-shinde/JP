Select * from emp;

Select Ename from emp;

Select * from emp where sal > 1000;

Select ENAME,SAL from emp where sal > 4000;

Select ENAME,SAL from emp where rownum < 5 order by sal desc;
select distinct job from emp;

Select * from emp where empno in (select empno from EMP where rownum < 5)
Order by sal desc;

Select ename,sal, rank() over (order by Sal desc) as RANKING from emp 


Select * from (select `* from EMP order by sal desc) where rownum < 6;

Select * from emp where Sal Between '2000' and 4000;


Select * from dept where deptno IN (20,30);
Select * from dept where deptno =20 or Deptno = 30

Select * from dept where deptno NOT IN (20,30);
Select * from dept where deptno !=20 And Deptno != 30

Select * from emp where ename like 'S%T';
Select * from emp where ename like '_I%';

Select ENAME, COMM from emp where COMM is not null;

Select ename as "Employee Name" from emp;

List all only deparatnames in desc order.
Select DNAME from dept order by DNAME desc;

List all department names that begins with "S"
Select DNAME from dept where dname like "S%"

List all only department from Chicago
Select dname fom dept where loc = 'CHICAGO';

List all the departments where dept name does not ends with "s"
Select danme from dept where DNAME Not like '%S';


Select * from emp order by Deptno, Job desc;

Select TO_DATE('31-AUG-2004','DD-MON-YYYY') from DUAL;

Select TO_DATE('17-07-2011', 'DD-MM-YYYY') from DUAL;

Select TO_CHAR(sysdate, 'DDspth "Day of" MMspth "Month of" YEAR') from Dual

Select TO_CHAR(sysdate, 'DD-MM-YYYY') from DUAL;

Select * from Emp where to_Char(HIREDATE, 'MM') between 2 and 5 order by hiredate desc;

Select ename, to_char(hiredate, 'MONTH YY') as "Joining Month" from emp;

Select TO_NUMBER('5,400', '9,999')from dual
Select TO_CHAR(555400, '$009,99,99,999.00')from dual

Select ename, Sal from emp where TO_Number('1,400','9,000') < Sal

Select lower(ENAME) from EMP; -- Single Row function
Select AVG(sal) "Average" from emp; -- Multi Row Function 
Select To_Char (AVG(sal), '9999.00') "Average" from emp; -- Multiple function on multi Rows  

Select INITCAP('the soap') from dual; -- INITCAP function will intial 
Select LPAD(Sal, 10,'*') from emp; -- LPAD function example
Select CONCAT('Employee Name is ', ename) from emp;

Select  min(sal), max (sal) from emp; -- Min & Max function 

Select hiredate,round(hiredate, 'month') from emp -- Date rounding function

Select ename, hiredate, add_months(hiredate, '36') as Contract_End_Date from emp order by Contract_End_Date desc

Select ename, sal, comm, sal+nvl(comm,0) as Net_Income from emp order by Net_Income desc

Select ename,sal, DENSE_rank() over (order by Sal desc) as RANKING from emp 

-- Query for Equijoin
Select ENAME, DNAME from emp e join Dept d
on (e.deptno = d.deptno)
--Or 
Select ENAME, DNAME from emp join Dept 
using (deptno)
-- Or
Select ENAME, DNAME from emp e, Dept d
where e.deptno = d.deptno

-- Query for Non Equijoin
Select ENAME, SAL, GRADE from emp e Join Salgrade d on (e.sal between d.losal and d.hisal)

SELECT * FROM SALGRADE
