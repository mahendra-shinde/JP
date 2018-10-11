--Display the hire date, name and department number for all clerks.
SELECT hiredate, ename, deptno FROM emp WHERE job = ‘CLERK’;

--Display the names and salaries of all employees with a salary greater than 2000.
SELECT ename, sal FROM emp WHERE sal > 2000;

--Display the names and hire dates of all employees hired in 1981 or 1982 
SELECT ename, hiredate FROM emp WHERE hiredate LIKE ‘%1981’ OR hiredate LIKE ‘%1982’; 
—OR—
SELECT ename, hiredate FROM emp WHERE hiredate >= ‘1/1/1981’ AND hiredate <= ‘31/12/1982’; 

--Display the names and dates of employees with the column headers “Name” and “Start Date”
SELECT ename AS "Name", hiredate AS "Start Date" FROM emp;

--Display the names and hire dates of all employees in the order they were hired.
SELECT ename, hiredate FROM emp ORDER BY hiredate;

--Display the names and salaries of all employees in reverse salary order.
SELECT ename, sal FROM emp ORDER BY sal DESC;

--Display ‘ename of department deptno earned commission $’ for each salesman in reverse salary order.
SELECT ename || ‘ of department ‘ || deptno || ‘ earned commission $’ || comm FROM emp WHERE job = ‘SALESMAN’ ORDER BY sal DESC; 

--Display the department numbers of all departments employing a clerk.
SELECT DISTINCT deptno FROM emp WHERE emp.job = ‘CLERK’;

--Display the department number, total salary payout and total commission payout for each department. 
SELECT deptno, sum(sal), sum(comm) FROM emp GROUP BY deptno;

--Display the department number, total salary payout and total commission payout for each department that pays at least one employee commission. 
SELECT deptno, sum(sal), sum(comm) FROM emp GROUP BY deptno HAVING sum(comm) > 0;

--Display the name of each employee with his department name.
SELECT ename, dname FROM emp INNER JOIN dept ON emp.deptno = dept.deptno;

--Display a list of all departments with the employees in each department.
SELECT dname, ename FROM dept LEFT OUTER JOIN emp ON dept.deptno = emp.deptno;

--Display the names of each employee with the name of his/her boss.
SELECT s.ename, b.ename FROM emp s INNER JOIN emp b ON s.mgr = b.empno;

--Display the employee number and name of each employee who manages other employees with the number of people he or she manages. 
SELECT a.mgr, b.ename, count(a.mgr) FROM emp a INNER JOIN emp b ON a.mgr = b.empno WHERE a.mgr IS NOT NULL GROUP BY a.mgr, b.ename; 

--Repeat the display for the last question, but this time display the rows in descending order of the number of employees managed. 
SELECT a.mgr, b.ename, count(a.mgr) FROM emp a INNER JOIN emp b ON a.mgr = b.empno WHERE a.mgr IS NOT NULL GROUP BY a.mgr, b.ename ORDER BY count(a.mgr) DESC;

--Display the names and job titles of all employees with the same job as Jones.
SELECT ename, job FROM emp WHERE job = (SELECT job FROM emp WHERE ename = ‘JONES’); 

--Display the names and department name of all employees working in the same city as Jones.
SELECT ename, dname FROM emp INNER JOIN dept ON emp.deptno = DEPT.deptno WHERE loc = (SELECT loc FROM emp INNER JOIN dept ON emp.deptno = DEPT.deptno WHERE ename = ‘JONES’); 

--Display the name of the employee whose salary is the lowest.
SELECT ename FROM emp WHERE sal = (SELECT min(sal) FROM emp);

--Display the names of all employees except the lowest paid.
SELECT ename FROM emp WHERE sal > (SELECT min(sal) FROM emp);

--Display the names of all employees whose job title is the same as anyone in the sales dept.
