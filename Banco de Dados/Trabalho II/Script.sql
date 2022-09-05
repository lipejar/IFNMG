create table ESTADO (

	cod int not null,

	nome varchar(50) not null,

	sigla varchar(5) not null,

	primary key(cod));

/*-=-=-=-=-=-TABELA ESTADO=-=-=-=-=-=*/

insert into ESTADO values
	(1,'Minas Gerais','MG'),

	(2,'São Paulo','SP'),

	(3,'Bahia','BA'),

	(4,'Rio de Janeiro','RJ'),

	(5,'Alagoas','AL'),

	(6,'Amapá','AP'),

	(7,'Amazonas','Am'),

	(8,'Ceará','CE'),

	(9,'Espirito Santo','ES'),

	(10,'Goiás','GO'),

	(11,'Maranhão','MA'),

	(12,'Mato Grosso','MT'),

	(13,'Mato Grosso do Sul','MS'),

	(14,'Pará','PA'),

	(15,'Paraiba','PB'),

	(16,'Paraná','PR'),

	(17,'Pernambuco','PE'),

	(18,'Piauí','PI'),

	(19,'Rio Grande do Norte','RN'),

	(20,'Rio Grande do Sul','RS'),

	(21,'Rondônia','RO'),

	(22,'Roraima','RR'),

	(23,'Santa Catarina','SC'),

	(24,'Sergipe','SE'),

	(25,'Tocantins','TO'),

	(26,'Distrito Federal','DF'),

	(27,'Acre','AC');

	

/*-=-=-=-=-=-TABELA CLIENTE=-=-=-=-=-=*/



create table CLIENTE (

	idCliente int not null,

	cpf varchar(25) not null,

	nome varchar(45) not null,

	rua varchar(45),

	bairro varchar(45),

	numero varchar(45),

	estado varchar(45) not null,

	primary key(idCliente),

	foreign key (estado) references ESTADO (cod));

	

insert into CLIENTE values

	(1, '123.456.789-10', 'Paulo', 'Rua Doce', 'Pão de mel', 15, 1),

	(2, '120.340.560-70', 'Osvaldo', 'Rua Doce', 'Pão de mel', 17, 1),

	(3, '644.235.175-84', 'Carlos do Rego', 'Rua bem legal', 'Limoeiro', 264, 3),

	(4, '743.196.237-98', 'Johnny boy', 'Palmares', 'Av.Peixoto', 124, 4),

	(5, '874.726.925-36', 'Magno Manga', 'Bitira', 'Camarões', 753, 5),

	(6, '856.129.074-64', 'Iara', 'Bitira', 'Camarões', 749, 5),

	(7, '524.756.123-76', 'José do Rego', 'Marechal', 'Pandarim', 67, 7),	

	(8, '965.236.785-86', 'Januário Pereira', 'Pastelinho', 'Bairro do Frevo', 62, 8),

	(9, '285.124.865-53', 'Jaime', 'Rua 15', 'Tiralimões', 23, 9),

	(10, '453.129.633-23', 'Mario', 'Panguajé', 'Põelimões', 233, 10);

	

/*-=-=-=-=-=-TABELA PRODUTO=-=-=-=-=-=*/



create table PRODUTO (

	codProduto int not null,

	nome varchar(45) not null,

	valor decimal(8,2) not null,

	primary key(codProduto));


insert into PRODUTO values 

	(1, 'Brinco legal', 50.23),

	(2, 'Colar de anjinho', 38.99),

	(3, 'Pulseira maneira', 29.99),

	(4, 'Brinco dourado legal', 99.99),

	(5, 'Anel de ouro', 150.50),

	(6, 'Anel de prata', 80.25),

	(7, 'Anel de diamante', 2000.00),

	(8, 'Pulseira RGB inovadora', 8000.00),

	(9, 'Colar de melancia', 25.60),

	(10, 'Brinco com argolão', 20.00);



/*-=-=-=-=-=-TABELA ORDEM DE VENDA=-=-=-=-=-=*/



create table ORDEMVENDA (

	idVenda int not null,

	dataVenda date,

	confEntrega tinyint,

	idCliente int not null,

	estadoCliente int not null,

	primary key (idVenda)

	foreign key (estadoCliente) REFERENCES estado(cod),

	FOREIGN key (idCliente) REFERENCES CLIENTE(idCliente));

	

insert into ORDEMVENDA values 

	(1, '2022-11-24', 1, 1, 1),

	(2, '2022-11-24', 0, 2, 1),

	(3, '2022-11-24', 1, 3, 3),

	(4, '2022-11-24', 1, 4, 4),

	(5, '2022-10-06', 0, 5, 5),

	(6, '2022-03-12', 1, 6, 5),

	(7, '2021-10-15', 1, 7, 7),

	(8, '2004-10-27', 0, 8, 8),

	(9, '2006-04-28', 1, 9, 9),

	(10, '2005-07-13', 0, 10, 10);



/*-=-=-=-=-=-TABELA ITENS=-=-=-=-=-=*/



create table ITENS (

	codOrdemVenda int not null,

	codProduto int not null,

	quantdItens int not null,

	foreign key (codProduto) references PRODUTO (codProduto),

	foreign key (codOrdemVenda) references ORDEMVENDA (idVenda));

	

insert into ITENS values 

	(1, 1, 5),

	(2, 1, 2),

	(1, 2, 1),

	(7, 3, 4),

	(5, 4, 2),

	(3, 5, 1),

	(6, 6, 1),

	(8, 7, 2),

	(9, 8, 4),

	(10, 9, 3),

	(1, 10, 1);

</sql><sql name="SQL 2">drop table ITENS;

drop table PRODUTO;

drop table ORDEMVENDA;

drop table CLIENTE;

drop table ESTADO;</sql><current_tab id="0"/></tab_sql></sqlb_project>
