create table categorias(
    id bigint primary key not null auto_increment,
    nome varchar(100),
    ativo boolean default true
);