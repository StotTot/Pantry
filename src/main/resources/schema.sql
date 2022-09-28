drop table if exists products;

create table products (
    product_id integer auto_increment primary key,
    name varchar(1024),
    date bigint,
    ex_date bigint
)