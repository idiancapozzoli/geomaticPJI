CREATE DATABASE Forum;
use Forum;

create table tipousuario(
codTipo int not null primary key,
nomeTipo varchar(100)
)engine innodb; 

create table categoria(
codCategoria int not null primary key,
nomeCategoria varchar(100)
)engine innodb;

create table usuario(
codUsuario int not null primary key auto_increment,
nome varchar(100),
nick varchar (100),
senha varchar(20),
codTipo int,
email varchar(100),
telefone varchar(15),
foreign key (codTipo) references tipoUsuario(codTipo)
)engine innodb;

create table topico(
codTopico int not null primary key auto_increment,
textoTopico varchar(500),
dataTopico date,
codCategoria int,
codUsuario int,
foreign key (codCategoria) references categoria(codCategoria),
foreign key (codUsuario) references usuario(codUsuario)
)engine innodb;

create table comentario(
codComentario int not null primary key auto_increment,
textoComentario varchar(500),
dataComentario date,
codTopico int,
codUsuario int,
foreign key (codTopico) references topico(codTopico),
foreign key (codUsuario) references usuario(codUsuario)
)engine innodb;

create table olimpiada(
codOlimpiada int not null primary key auto_increment,
nomeOlimpiada varchar(100),
nickOlimpiada varchar(100),
textoOlimpiada varchar(1000)
)engine innodb;
