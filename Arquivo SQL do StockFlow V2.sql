create database stockflow;

CREATE TABLE usuario (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	permissao ENUM('Administrador', 'Vendedor') NOT NULL,
	celular VARCHAR(20) NOT NULL,
	email VARCHAR(150) UNIQUE NOT NULL,
	senha VARCHAR(50) NOT NULL
);

CREATE TABLE categoria(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(50) NOT NULL
);


CREATE TABLE clientes (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100) NOT NULL
	tipo_cliente ENUM('PF', 'PJ') NOT NULL,
	cpf VARCHAR(11) UNIQUE,
	cnpj VARCHAR(14) UNIQUE,
	email VARCHAR(150) UNIQUE NOT NULL,
	data_nascimento DATE NOT NULL,
	observacao TEXT
);

CREATE TABLE fornecedor (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	cpf_cnpj VARCHAR(14) UNIQUE NOT NULL,
	telefone VARCHAR(20) NOT NULL,
	email VARCHAR(150) NOT NULL,
	observacao TEXT
);

CREATE TABLE produto (
	id INT AUTO_INCREMENT PRIMARY KEY,
	foto VARCHAR(255),
	codigo_de_barras VARCHAR(100) NOT NULL,
	nome VARCHAR(100) NOT NULL,
	descricao TEXT,
	custo_compra DECIMAL(10,2) NOT NULL,
	preco_unitario DECIMAL(10,2) NOT NULL,
	preco_unitario_venda DECIMAL(10,2) NOT NULL,
	estoque_atual INT DEFAULT 0,
	categoria_id INT,
    fornecedor_id INT,
	FOREIGN KEY (categoria_id) REFERENCES categoria(id),
    FOREIGN KEY (fornecedor_id) REFERENCES fornecedor(id)
    
);
