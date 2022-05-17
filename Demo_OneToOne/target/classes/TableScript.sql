drop database if exists customer_db;

create database customer_db;

use customer_db;

create table address(
	address_id int ,
	street varchar(30) not null,
	city varchar(10) not null,
	constraint ps_addressid_pk primary key (address_id)
);

insert into address values(100,'8 East Walnut Street', 'New York');
insert into address values(101,'720 Rockland Road', 'Las Vegas');
insert into address values(102,'37 Marlborough Street', 'Gallup');

create table customer (
	customer_id int auto_increment,
	address_id int unique,
	emailid varchar(25) not null,
	name varchar(10) not null,
	date_of_birth date not null,
	constraint ps_customerid_pk primary key (customer_id),
	constraint ps_customer_address_fk foreign key(address_id) references address(address_id)
);



insert into customer values (1234,100,'james01@infosys.com', 'James', sysdate()-interval 7476 day);
insert into customer values (1235, 101,'william@infosys.com', 'William', sysdate()-interval 11374 day);
insert into customer values (1236, 102,'antony_04@infosys.com', 'Antony', sysdate()-interval 12344 day);
commit;

select * from customer;
select * from address;
