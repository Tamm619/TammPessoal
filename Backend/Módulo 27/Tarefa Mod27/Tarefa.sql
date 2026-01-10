create table tb_produto (
	id int,
	nome varchar(20),
	estoque varchar(3)
);
alter table tb_produto rencolumn estoque to estoque_disponivel;

insert into tb_produto values (1, 'Calculadora', 'sim');

select * from tb_produto;