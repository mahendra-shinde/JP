select * from user_tables;

Select * from SYS.USER_CONSTRAINTS

SELECT * from user_INDexes;                                                                                         

select * from user_SEQUENCES;
select * from DEPT

SELECt * FROM EMP as E inner join DEPT as d on  (e.Deptno = d.deptno);

Select * from emp where sal < 4000 and sal > 2000

selct * from emp where sal > 60;

select * from emp where  ROWNUM < 8 ORDER BY sal DESC;

select * from emp  ORDER BY sal DESC ;

SELECT DISTINCT JOB  as originaljob from EMP

SELECT * from EMP where sal between 2000 and  4000

SELECT * FROM EMP WHERE SAL NOT in(SELECT sal from EMP where sal between 2000 and  3000)


select * from DEPT where deptno IN(20,30)

select * from DEPT where deptno NOT IN(20,30)

SELECT * FROM DEPT WHERE (deptno != 20 or deptno != 30)

SELECT * FROM emp where JOB like 'M%';

SELECT * FROM emp where  ename like 'S%T';

SELECT * FROM emp where  ename like '__O%';


SELect * from emp where comm is NOT null;

SELect * from emp where comm is  null;

select * from dept


SELECT DNAME AS DEPTNAME from dept order by DNAME DESC

SELECT * from dept order by  DEPTNO DESC, DNAME DESC

SELECT DNAME AS DEPTNAME from dept where DNAME like 'S%'

select * from dept where loc = 'CHICAGO'

SELECT DNAME AS DEPTNAME from dept where DNAME NOT like '%S'

SELECT * from dept where DNAME NOT like '%S'

Select * from EMP

SELECT TO_CHAR(SYSDATE,'DD-MM-YYYY') from DUAL;

SELECT SYSDATE from DUAL;

SELECT TO_DATE(SYSDATE) from DUAL;

SELECT TO_CHAR(SYSDATE,'DDspth " DAY OF "  MmSPTH  "MONTH of"  YEAR') from DUAL;

SELECT  TO_CHAR(SYSDate,'MONTH-DD-YYYY') from DUAL;

SELECT * from emp where to_char(HIREDATE,'YY') = 81 

SELECT to_char(HIREDATE,'DD-MON-YYYY') from emp 

SELECT * from emp where (to_char(HIREDATE,'MON') = 'JUN' )
SELECT * from emp where (to_char(HIREDATE,'MON') IN ('FEB' , 'JUN'))

SELECT * from emp where to_char(HIREDATE,'MON') between 'FEB' and 'JUN'


SELECT  ename, sal from emp where to_number('1,500','9,000') < sal

SELECT TO_NUMBER('5,400','9,999') from dual

SELECT to_char('5878','$0,99,999,99,99,9999.00') from dual

select to_


SELECT * from emp where to_char(HIREDATE,'MON') IN ('FEB' and 'JUN')

SELECT * from emp where (to_char(HIREDATE,'MON') in( 'FEB' or 'JUN'))

SELECT ename, to_char(hiredate, 'MONTH YY') AS "JOINING MONTH" from emp

SELECT ename , sal, comm, (sal+ (comm)) AS NETSALARY from emp

select upper(ENAME) from emp

select to_char(AVG(SAL),'999,99,99,99.00' )from emp

select AVG(SAL)from emp

SELECT count(*),  AS TOTALEMP from EMP group by DEPTNO

SELECT ename, Rpad(sal,10,'*') from emp

SELECT initcap(ename) from emp

SELECT concat('DR.',  ename) from emp

SELECT MIN(sal)   from emp

SELECT hiredate, round(hiredate,'YY') from emp

SELECT * FROM EMP

SELECT HIREDATE, ADD_MONTHS(HIREDATE,36) AS CONTRACTEXPIREDATE from emp

SELECT month_between(hiredate,sysdate) as totalmonth from emp

SELECT ename , sal, comm, (sal+ nvl(comm,0)) AS NETSALARY from emp

SELECT ename, sal, rank() over(order by sal) from emp;

SELECT ename, sal, dense_rank() over(order by sal) AS  from emp;

SELECT ename from emp order by sal ;

equi_join query

SELECT ename , dname from emp e join dept d on e.deptno = d.deptno

SELECT ename , dname from emp  join dept  using (deptno)

Select * from salgrade

nonequijoin

SELECT ENAME, SAL, GRADE from emp  e join salgrade   s on( e.sal between s.LOSAL and s.HISAL);

SELECT ename , dname from emp e inner join dept d on e.deptno = d.deptno

SELECT ename , dname from emp e  join dept d on e.deptno = d.deptno

SELECT ename, dname from emp e join dept d using(deptno) 


SELECT ename, dname from emp e left join dept d using(deptno) 

SELECT ename, dname from emp e right join dept d using(deptno) 

SELECT ename, dname from emp e full join dept d using(deptno) 



