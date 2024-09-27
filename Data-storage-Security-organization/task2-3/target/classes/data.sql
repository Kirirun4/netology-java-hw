insert into netology.customers (name, surname, age, phone_number)
values ('Alexey', 'Petrov', 9, '111-999'),
       ('Alena', 'Vasilyeva', 33, '222-888'),
       ('Svetlana', 'Sharapova', 28, '333-777'),
       ('aleXEY', 'Suvorov', 30, '444-666'),
       ('Darya', 'Semenova', 26, '555-000');


insert into netology.orders (date, customer_id, product_name, amount)
values ('05.01.2023', 3, 'хлеб', 5),
       ('05.01.2023', 4, 'макароны', 3),
       ('05.01.2023', 4, 'рубашка', 2),
       ('05.01.2023', 1, 'тортик', 15),
       ('05.01.2023', 2, 'тортик', 7);