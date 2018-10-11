select * from books;

delete from books where author = 'Mahendra';
drop table books;


Create table books (

    bookid number(4) primary key,
    title varchar2(30) not null,
    author varchar(20) default 'Anonymous'
    
    );

Insert into books(bookid, title) values (101, 'Head First java');

Insert into books(bookid, title) values (102, 'Head First python');

select * from books;

update books set author = 'Amit' where bookid =102;
commit;

select * from books;

TRUNCATE table books;

--stored procedure, unnamed

begin

update locations set city ='Mumbai' where postal_code='400059';

end;


create or replace procedure update_loactions AS
begin

  dbms_output.put_line('updating table');
update locations set city ='Mumbai' where postal_code='400059';

end;

exec update_loactions


set serveroutput on  ---turns ON the Output statement

create PROCEDURE hello_world as
begin
    dbms_output.put_line('hellow world');
end;

call dbms_output.put_line('hellow world');

call hello_world()
EXEC hello_world()

---function
create or replace function count_emp (dept number) return
number as
p_count number;

begin
select count(*) into p_count from employees where department_id = dept;

return p_count;

end;

select department_name, count_emp(department_id) from departments;

select count_emp(50) from dual;


---View
select department_id, average from
(select department_id, sum(salary) as total, min(salary) as lowest, avg(salary) as average from employees group by department_id) order by department_id desc

Create view deptView AS
select department_id, sum(salary) as total, min(salary) as lowest, avg(salary) as average from employees group by department_id;

select department_id, average from deptview
order by department_id desc;



