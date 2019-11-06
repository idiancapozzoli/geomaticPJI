create database Forum;
use Forum;

create table usuario(
codigoUsuario int not null auto_increment,
nome varchar(100),
email varchar(100),
nick varchar(100) not null,
telefone varchar(100),
senha varchar(100) not null,
primary key(codigoUsuario,nick,senha)
)engine innodb;

create table topico(
codigoTopico int not null auto_increment,
textoTopico varchar(500) not null,
dataTopico date,
codigoUsuario int not null,
primary key (codigoTopico, codigoUsuario),
foreign key (codigoUsuario) references usuario(codigoUsuario)
)engine innodb;

create table comentario(
codigoComentario int not null auto_increment,
textoComentario varchar(500) not null,
dataComentario date,
codigoUsuario int not null,
codigoTopico int not null,
primary key (codigoComentario, codigoUsuario, codigoTopico),
foreign key (codigoUsuario) references usuario(codigoUsuario),
foreign key (codigoTopico) references topico(codigoTopico)
)engine innodb;
