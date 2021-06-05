use sql_hotel;

create table corder(
orderid int primary key auto_increment,
cname varchar(100),
phone varchar(100),
address varchar(100),
itemid varchar(100),
qty int,
total double,
date varchar(100),
foreign key (itemid) references item(itemid)
);

select * from corder;

insert into corder(cname , phone , address , itemid , qty , total , date)
values('Toya Town' , 0123456789 , '109 Sunflower Road' , 'hotel123' , 7 , 861 , '05/06/2021');
insert into corder(cname , phone , address , itemid , qty , total , date)
values('Buggy Bown' , 0123456788 , '485 Jamaica Road' , 'hotel128' , 2 , 10.00 , '20/01/2021');
insert into corder(cname , phone , address , itemid , qty , total , date)
values('Angela Simmions' , 0129256789 , '1 Brighton Road' , 'hotel121' , 1 , 10.00 , '30/03/2021');
insert into corder(cname , phone , address , itemid , qty , total , date)
values('Vanessa Hussey' , 0793456789 , '123 Cannon Road' , 'hotel125' , 5 , 15.00 , '17/05/2021');
insert into corder(cname , phone , address , itemid , qty , total , date)
values('Riya Kim' , 0723456789 , '19 Massive Road' , 'hotel124' , 10 , 60.00 , '23/12/2020');
insert into corder(cname , phone , address , itemid , qty , total , date)
values('Timithoy Tim' , 0793456789 , '7 Jakeman Road' , 'hotel123' , 3 , 36.00 , '08/06/2020');
insert into corder(cname , phone , address , itemid , qty , total , date)
values('Mark Moon' , 0784456789 , '126 Flower Road' , 'hotel127' , 7 , 49.00 , '10/03/2021');
insert into corder(cname , phone , address , itemid , qty , total , date)
values('Luke Down' , 0123422789 , '963 Summer Walk' , 'hotel126' , 3 , 51.00 , '29/02/2021');
insert into corder(cname , phone , address , itemid , qty , total , date)
values('Simon Cross' , 0559256789 , '10 Kingsbury Avenue' , 'hotel122' , 1 , 8.00 , '13/04/2021');
insert into corder(cname , phone , address , itemid , qty , total , date)
values('Aaliyah Knight' , 0893456789 , '70 Longo Road' , 'hotel130' , 5 , 60.00 , '01/04/2021');

update corder set total = 84.00 where orderid = 2;
select * from corder;

update corder set date ='2021-06-05' where orderid = 2;
update corder set date ='2021-01-20' where orderid = 3;
update corder set date ='2021-03-30' where orderid = 4;
update corder set date ='2021-05-17' where orderid = 5;
update corder set date ='2020-12-23' where orderid = 6;
update corder set date ='2020-06-08' where orderid = 7;
update corder set date ='2021-03-10' where orderid = 8;
update corder set date ='2021-02-29' where orderid = 9;
update corder set date ='2021-04-13' where orderid = 10;
update corder set date ='2021-04-01' where orderid = 11;

/* Display number of orders placed in a day
Result: 1 */
select count(date) from corder where date = '2021-06-05';

/*  Display total amount of order.
Result: sum 120 */
select sum(total) from corder where itemid = 'hotel123';