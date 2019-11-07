<?php

	$servidor = "localhost";
	$usuario = "root";
	$senha = "";
	$banco = "Forum";

	$conexao = mysqli_connect($servidor, $usuario, $senha, $banco);

	mysqli_set_charset($conexao, "utf8");

	if(!$conexao){
		die("Falha na conexão". mysql_connect_error());
	}