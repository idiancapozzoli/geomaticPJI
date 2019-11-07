<?php 
require_once "conexao.php";

Class Comentario{

	  private $texto;
      private $date;


	public function __construct($texto,$date){
		$this->texto = $texto;
		$this->date = $date;

	}

	public function inserirComentario(){

		$servidor = "localhost";
		$usuario = "root";
		$senha = "";
		$banco = "Forum";

		$conexao = mysqli_connect($servidor, $usuario, $senha, $banco);

		mysqli_set_charset($conexao, "utf8");

		$query = "INSERT INTO comentario(textoComentario,dataComentario) VALUES ('".$this->texto."', '".$this->date."')";

		$resultado = mysqli_query($conexao, $query);

		if($resultado){
			return "Usuario inserido com sucesso";
		}else{
			return "Erro!";
		}
	}
}
?>
