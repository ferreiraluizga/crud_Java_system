-- banco de dados para funcionamento do app Java "Sistema de Desenvolvedores"

-- criação do banco de dados
CREATE DATABASE dbEmpresa;
USE dbEmpresa;

-- desenvolvedores a serem cadastrados
CREATE TABLE tbDesenvolvedores (
    id INT PRIMARY KEY IDENTITY(1,1),
    nome VARCHAR(255) NOT NULL,
    nascimento VARCHAR(10),
    genero VARCHAR(50),
    estadoCivil VARCHAR(50),
    areas VARCHAR(255),
    cep VARCHAR(10),
    endereco VARCHAR(255),
    bairro VARCHAR(100),
    complemento VARCHAR(100),
    estado VARCHAR(50),
    cidade VARCHAR(50),
    celular VARCHAR(15),
    telefone VARCHAR(14),
    cadastro VARCHAR(10)
);

-- tabela de administradores do sistema
CREATE TABLE tbAdministradores (
    id INT PRIMARY KEY IDENTITY(1,1),
    nome VARCHAR(255),
    usuario VARCHAR(50),
    email VARCHAR(100),
    senha VARCHAR(50)
);

-- inserindo administrador padrão
INSERT INTO tbAdministradores (nome, usuario, email, senha)
VALUES ('Luiz Gabriel Ferreira', 'ferreiraluizga', 'ferreiraluizga@admin.com', 'admin123');
