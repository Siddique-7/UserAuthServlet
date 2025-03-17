create table users (
id number generated always as identity primary key,
username varchar2(50) unique not null,
password varchar2(255) not null,
email varchar(100) unique not null,
created_at timestamp default current_timestamp
);