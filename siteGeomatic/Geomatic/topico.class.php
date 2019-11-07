<?php 
require_once "conexao.php";

Class Topico{

	  private $texto;
      private $date;
      private $codTipo;


	public function __construct($texto,$date,$codTipo){
		$this->texto = $texto;
		$this->date = $date;
		$this->codTipo=$codTipo;

	}

	public function inserirTopico(){

		$servidor = "localhost";
		$usuario = "root";
		$senha = "";
		$banco = "Forum";

		$conexao = mysqli_connect($servidor, $usuario, $senha, $banco);

		mysqli_set_charset($conexao, "utf8");

		$query = "INSERT INTO topico(textoTopico,dataTopico,codCategoria) VALUES ('".$this->texto."', '".$this->date."',".$this->codTipo.")";

		$resultado = mysqli_query($conexao, $query);

		if($resultado){
			return "Usuario inserido com sucesso";
		}else{
			return "Erro!";
		}
	}
}
?>
