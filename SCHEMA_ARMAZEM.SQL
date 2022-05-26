create database armazem;

create table produto(
  id serial not null primary key,
  nome varchar(50) not null unique,
  quantidade integer not null
);

insert into produto (nome, quantidade) values ('arroz', 100);
insert into produto (nome, quantidade) values ('feijao', 100);
insert into produto (nome, quantidade) values ('macarrao', 100);




