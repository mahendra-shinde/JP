
DROP TABLE emp_master;
CREATE TABLE emp_master(employeeId number PRIMARY KEY,
 name VARCHAR2(30), salary NUMBER);
 
 CREATE SEQUENCE emp_master_seq;
 
 INSERT INTO emp_master VALUES(emp_master_seq.nextval,'Zara',9999);

SELECT * FROM emp_master;
				
				
				
				