/* 1 create database*/
create database tta;
/* 2 Delete database*/
drop database tta;
/*--------------------*/
/* 3 create table*/
use tta;
create table student(sid int , firstName varchar(100) , lastName varchar(100));
/* coloumn name _sid SID -sid 
not s id */

select * from student;

/* insert data in to table */

insert into student(sid , firstName , lastName) values(101 , 'Lee' , 'Brown');
insert into student(sid , firstName , lastName) values(102 , 'Bee' , 'Forbes');

/* adding primary key*/
/* delete table form database */
drop table student;

create table student(sid int primary key , firstName varchar(100) , lastName varchar(100));

/* create table student(sid int , firstName varchar(100) , lastName varchar(100) , primary key(sid)); */

/* Using Where*/
/* where in select */
select * from student where sid=101;
select * from student where firstName = 'Ava';
select * from student where sid > 101;
select * from student where sid=101 and firstName = 'bee';
select * from student where sid=101 or firstName = 'bee';

/* update table*/
update student set lastName = 'Leesan' where sid = 101;

/* delete table*/
/* just delete data structure will be in database */
/* delete piticular data*/
delete from student where sid= 101;

/* delete all data - if no PK*/
delete from student;

/* display data by column*/
select * from student;
select firstName , lastName from student;

/* Alter table adding new column */
alter table student add score int;
select * from student;

update student set score = 50 where sid = 101;
update student set score = 30 where sid = 102;
select * from student;

insert into student(sid , score) values (103, 78);
select * from student;

insert into student(sid , score) values (104, 58);
select * from student;

update student set firstName = 'Valerie', lastName = 'Oliver' where sid = 103;
select * from student;

update student set firstName = 'Karen', lastName = 'Williams' where sid = 104;
select * from student;


/* sort table by score */
select * from student order by score;
select * from student order by score desc;

/* displat records between the range*/

select * from student where score between 50 and 90;
