-----STORED PROC-------

begin
    Update locations 
    Set city = 'Mumbai'
    where postal_code = '400059';
end;
    
Create procedure update_locations as
begin
    Update locations 
    Set city = 'Mumbai'
    where postal_code = '400059';
end;

----------------
-- Turn ON Output statements
set serveroutput on ---run everytime you log into db, once/session

---- Sample stored PROC to display a message
begin
    dbms_output.put_line ('Hello World');
end;


begin
    dbms_output.put_line ('Welcome');
end;

-- Stored PROC always has to be called from a PL/SQL block


exec dbms_output.put_line ('Hello World');

Call dbms_output.put_line ('Hello World');

-------------
Create or Replace procedure update_locations as
begin
    dbms_output.put_line ('Updating Table');
    Update locations 
    Set city = 'Mumbai'
    where postal_code = '400059';
    dbms_output.put_line ('Updated!');
end;

Call update_locations()

----------- Secure DML stored Proc

create or replace PROCEDURE secure_dml
IS
BEGIN
  IF TO_CHAR (SYSDATE, 'HH24:MI') NOT BETWEEN '08:00' AND '18:00'
        OR TO_CHAR (SYSDATE, 'DY') IN ('SAT', 'SUN') THEN
	RAISE_APPLICATION_ERROR (-20205,
		'You may only make changes during normal office hours');
  END IF;
END secure_dml;

------------ Add Job History Stored PROC

create or replace PROCEDURE add_job_history
  (  p_emp_id          job_history.employee_id%type
   , p_start_date      job_history.start_date%type
   , p_end_date        job_history.end_date%type
   , p_job_id          job_history.job_id%type
   , p_department_id   job_history.department_id%type
   )
IS
BEGIN
  INSERT INTO job_history (employee_id, start_date, end_date,
                           job_id, department_id)
    VALUES(p_emp_id, p_start_date, p_end_date, p_job_id, p_department_id);
END add_job_history;

--------- Function
---- (Function has a return type, returns a value, SP does not return a value)

Create or Replace function count_emp (dept number) return number AS
    p_count number;
Begin
    Select count (*) into p_count from employees
    where department_id = dept;
    
    return p_count;
END;
------

Select department_name, count_emp(department_id) from departments;

Select count_emp(10) from dual
Select count_emp(50) from dual


------ VIEWS

select department_id, average from 
(Select department_id, Sum(salary) as Total, Min(salary)as Lowest, Avg(salary)as Average from employees group by department_id)
order by department_id DESC;

Create view deptView AS
(Select department_id, Sum(salary) as Total, Min(salary)as Lowest, Avg(salary)as Average from employees group by department_id)
---------

select department_id, average from 
deptView
order by department_id DESC

------------
