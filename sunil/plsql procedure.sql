----
set SERVEROUT on

set SERVEROUT OFF


------------
begin 
   update_Location;
end;

exec DBMS_OUTPUT.PUT_LINE('hi')

call DBMS_OUTPUT.PUT_LINE('bye bye')

CREATE or Replace procedure update_Location AS 
begin
    DBMS_OUTPUT.PUT_LINE('updating table');
    UPDATE locations
    set city = 'Mumbai'
    where postal_code = '40010';
    DBMS_OUTPUT.PUT('updated ');
end;

exec update_Location

begin
    update_Location;
end;


--------------function
Materialize view
CREATE or REPLACE function count_emp(dept number) return
number as 
p_count number;
begin
    select count(*) into p_count from employees 
    where DEPARTMENT_ID = dept;
    return p_count;
end;

select department_id, department_name , count_emp(department_id) from departments;

select department_name , count(department_id) from departments;

SELECT * from departments
