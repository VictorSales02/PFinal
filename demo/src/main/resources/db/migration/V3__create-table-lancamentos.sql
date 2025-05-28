create table lancamentos(
    id bigint primary key not null auto_increment,
    descricao varchar(100),
    data_vencimento date,
    data_pagamento date,
    valor float not null,
    observacao varchar(100),
    tipo varchar(20) check(tipo in ('RECEITA','DESPESA')) not null,
    ativo boolean default true,
    id_pessoa bigint not null,
    id_categoria bigint not null,

    foreign key (id_pessoa) references pessoas(id),
	foreign key (id_categoria) REFERENCES categorias(id)

);