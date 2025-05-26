create table lancamentos(
    id bigint primary key not null auto_increment,
    descricao varchar(100),
    dataVencimento date,
    dataPagamento date,
    valor float not null,
    observacao varchar(100),
    tipolancamento varchar(20) check(tipolancamento in ('receita','despesa')) not null,
    id_pessoa bigint not null,
    id_categoria bigint not null,

    foreign key (id_pessoa) references pessoas(id),
	foreign key (id_categoria) REFERENCES categorias(id)

);