create database sql_hotel;
use sql_hotel;
create table manager(name varchar(100), shift varchar(100), salary double, mid int primary key
);
insert into manager(name , shift , salary , mid) values('Ines Brushfield' , '7 am - 3 pm' , 25000 , 101);
insert into manager(name , shift , salary , mid) values('Babara MacCaffrey' , '3 pm - 11 pm' , 26000 , 102);
insert into manager(name , shift , salary , mid) values('Twoney Crown' , '11 pm - 7 am' , 27000 , 103);
insert into manager(name , shift , salary , mid) values('Laden Simmions' , '12 pm - 6 pm' , 19000 , 104);
insert into manager(name , shift , salary , mid) values('Evlin Faree' , '6 pm - 12 am', 19000 , 105);
insert into manager(name , shift , salary , mid) values('Helena Downes' , '7 am to 3 pm' , 19000 , 106);
insert into manager(name , shift , salary , mid) values('Kimberely Blue' , '3 pm - 11 pm' , 20000 , 107);
insert into manager(name , shift , salary , mid) values('Nomi Cotton' , '11 pm - 7 am' , 21000 , 108);
insert into manager(name , shift , salary , mid) values('Maurice Turner' , '12 pm - 6 pm' , 15000, 109);
insert into manager(name , shift , salary , mid) values('Noris Cook' , '6 pm - 12 am' , 15000 , 110);

select * from manager;

update manager set shift = '7 am - 3 pm' where mid = 106;

/* Display average salary of manager
Result : Average salary 20600 */
select avg(salary) from manager;
select avg(salary) as ASalary from manager; /* ASalary 20600 */