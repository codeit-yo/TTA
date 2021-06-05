use sql_hotel;

create table item(
itemid varchar(100) primary key,
dish varchar(100),
price double,
category varchar(100)
);

insert into item(itemid , dish , price , category) 
values('hotel123' , 'lasagne' , 12.00 , 'dinner');
insert into item(itemid , dish , price , category) 
values('hotel124' , 'fruit cocktail' , 6.00 , 'desert');
insert into item(itemid , dish , price , category) 
values('hotel125' , 'pink lemonade' , 3.00 , 'drink');
insert into item(itemid , dish , price , category) 
values('hotel126' , 'oxtail' , 17.00 , 'dinner');
insert into item(itemid , dish , price , category) 
values('hotel127' , 'pancakes' , 7.00 , 'breakfast');
insert into item(itemid , dish , price , category) 
values('hotel128' , 'cheese sandwich' , 5.00 , 'lunch');
insert into item(itemid , dish , price , category) 
values('hotel129' , 'chicken and rice' , 12.00 , 'dinner');
insert into item(itemid , dish , price , category) 
values('hotel121' , 'strawberry milkshake' , 5.00 , 'drink');
insert into item(itemid , dish , price , category) 
values('hotel122' , 'ginger cake' , 8.00 , 'desert');
insert into item(itemid , dish , price , category) 
values('hotel130' , 'vegetable curry' , 12.00 , 'dinner');

select * from item;

/* Display total number of dishes serve in hotel.
Result: 10 */
select count(dish) from item;

/* Display dishes as per category */
select dish from item where category = 'drink';
select dish from item where category = 'desert';
select dish from item where category = 'lunch';
select dish from item where category = 'dinner';
select dish from item where category = 'breakfast';