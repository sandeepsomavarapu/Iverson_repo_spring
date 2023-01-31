create database kpmg;
use kpmg;
create table employees(empid int,ename varchar(10),salary int,eadd varchar(10));
describe emps;
alter table employees add designation varchar(10);
alter table employees drop column eadd ;
alter table employees change empid empno int;
alter table employees rename to emps;
drop table emps;
truncate table employees;# it will make table as empty 
#DML
insert into employees values(123,"mahesh",20000,"hyderabad");
insert into employees values(124,"naresh",40000,"banglore");
insert into employees values(125,"rajesh",50000,"hyderabad");
insert into employees values(126,"somesh",30000,"delhi");
insert into employees values(127,"suresh",35000,"banglore");
insert into employees values(128,"hitesh",45000,"delhi");
select * from employees;
select ename from employees;
truncate table employees;
update employees set salary=salary+5000 where eadd='hyderabad';
update employees set salary=salary+1000;
delete from employees where eadd="delhi" ;
delete from employees;
select * from employees where eadd="hyderabad";
select * from employees where salary<=30000;
select * from employees where ename="rajesh";

select max(salary) from employees;
select min(salary) from employees;
select avg(salary) from employees;
select sum(salary) from employees;
select * from employees order by eadd ;