-- -----------------------------------------------------
-- Table vendas.estado
-- -----------------------------------------------------
CREATE TABLE estado (
  codestado INT NOT NULL,
  nome VARCHAR(45) NULL,
  PRIMARY KEY (codestado));


-- -----------------------------------------------------
-- Table vendas.tipocliente
-- -----------------------------------------------------
CREATE TABLE tipocliente (
  codtipo INT NOT NULL,
  nometipo VARCHAR(45) NULL,
  PRIMARY KEY (codtipo));


-- -----------------------------------------------------
-- Table vendas.cliente
-- -----------------------------------------------------
CREATE TABLE cliente (
  codcliente INT NOT NULL,
  nome VARCHAR(100) NULL,
  email VARCHAR(100) NULL,
  telefone VARCHAR(45) NULL,
  cep VARCHAR(45) NULL,
  rua VARCHAR(45) NULL,
  numero INT NULL,
  complemento VARCHAR(45) NULL,
  cidade VARCHAR(45) NULL,
  codestado INT NOT NULL,
  codtipo INT NOT NULL,
  PRIMARY KEY (codcliente),
  FOREIGN KEY (codestado) REFERENCES estado (codestado)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  FOREIGN KEY (codtipo)
    REFERENCES tipocliente (codtipo)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table Pedido
-- -----------------------------------------------------
CREATE TABLE pedido (
  codpedido INT NOT NULL,
  data DATE NULL,
  valor DECIMAL(22,7) NULL,
  codcliente INT NOT NULL,
  PRIMARY KEY (codpedido),
  FOREIGN KEY (codcliente) REFERENCES cliente (codcliente)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- -----------------------------------------------------
-- Table Categoria
-- -----------------------------------------------------
CREATE TABLE categoria (
  codcategoria INT NOT NULL,
  nome VARCHAR(100) NULL,
  PRIMARY KEY (codcategoria));


-- -----------------------------------------------------
-- Table Produto
-- -----------------------------------------------------
CREATE TABLE produto (
  codproduto INT NOT NULL,
  nome VARCHAR(100) NULL,
  preco DECIMAL(22,7) NULL,
  codcategoria INT NOT NULL,
  PRIMARY KEY (codproduto),
  FOREIGN KEY (codcategoria) REFERENCES categoria (codcategoria)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- -----------------------------------------------------
-- Table Item
-- -----------------------------------------------------
CREATE TABLE item (
  coditem INT NOT NULL,
  quantidade INT NULL,
  valorunitario DECIMAL(22,7) NULL,
  codpedido INT NOT NULL,
  codproduto INT NOT NULL,
  PRIMARY KEY (coditem),
  FOREIGN KEY (codpedido) REFERENCES pedido (codpedido)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  FOREIGN KEY (codproduto) REFERENCES produto (codproduto)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

