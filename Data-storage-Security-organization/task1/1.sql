create schema netology;

create table netology.persons
(
    name           varchar(255),
    surname        varchar(255),
    age            int          not null,
    phone_number   varchar(255) not null,
    city_of_living varchar(255) default 'Russia',
    primary key (name, surname, age)
);

insert into netology.persons (name, surname, age, phone_number, city_of_living)
VALUES ('Данил', 'Васильев', 37, +64464989, 'Moscow'),
       ('Екатерина', 'Павлова', 23, +51821207, 'Izhevsk'),
       ('Владимир', 'Высоцкий', 66, +184154855, 'Novosibirsk');

update persons
set age = 37
where phone_number = +64464989;