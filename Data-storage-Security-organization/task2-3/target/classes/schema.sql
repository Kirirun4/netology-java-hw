create schema if not exists netology;

create table if not exists netology.customers(
                                 id int primary key auto_increment,
                                 name varchar(255) not null,
                                 surname varchar(255) not null,
                                 age int not null,
                                 phone_number varchar(255)
);

create table if not exists netology.orders(
                                  id int primary key auto_increment,
                                  date varchar(255) not null,
                                  customer_id int references netology.customers (id),
                                  product_name varchar(255) not null,
                                  amount int
);
