<?php 
require_once "conexao.php";

Class Olimpiada{

	  private $nome;
      private $nick;
      private $texto;


	public function __construct($nome,$nick,$texto){
		$this->nome = $nome;
		$this->nick = $nick;
		$this->texto=$texto;
	}

	public function inserirOlimpiada(){

		$servidor = "localhost";
		$usuario = "root";
		$senha = "";
		$banco = "Forum";

		$conexao = mysqli_connect($servidor, $usuario, $senha, $banco);

		mysqli_set_charset($conexao, "utf8");

		$query = "INSERT INTO olimpiada(nomeOlimpiada,nickOlimpiada,textoOlimpiada) VALUES ('".$this->nome."', '".$this->nick."','".$this->texto."')";

		$resultado = mysqli_query($conexao, $query);

		if($resultado){
			return "Usuario inserido com sucesso";
		}else{
			return "Erro!";
		}
	}
}
?>
