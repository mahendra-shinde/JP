create or replace
PROCEDURE getEmployee
(in_id IN EMPLOYEE.EMPID%TYPE,
 out_name OUT EMPLOYEE.NAME%TYPE,
 out_role OUT EMPLOYEE.ROLE%TYPE,
 out_city OUT EMPLOYEE.CITY%TYPE,
 out_country OUT EMPLOYEE.COUNTRY%TYPE
 )
AS
BEGIN
  SELECT NAME, ROLE, CITY, COUNTRY 
  INTO out_name, out_role, out_city, out_country
  FROM EMPLOYEE
  WHERE EMPID = in_id;
  
END;