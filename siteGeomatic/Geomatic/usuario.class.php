<?php 
require_once "conexao.php";

Class Usuario{

	  private $nome;
      private $nick;
      private $senha;
      private $codTipo;
      private $email;
      private $phone;


	public function __construct($nome,$nick,$senha,$codTipo,$email,$phone){
		$this->nome = $nome;
		$this->nick = $nick;
		$this->senha=$senha;
		$this->codTipo=$codTipo;
		$this->email=$email;
		$this->phone=$phone;
	}

	public function inserirUsuario(){

		$servidor = "localhost";
		$usuario = "root";
		$senha = "";
		$banco = "Forum";

		$conexao = mysqli_connect($servidor, $usuario, $senha, $banco);

		mysqli_set_charset($conexao, "utf8");

		$query = "INSERT INTO usuario(nome,nick,senha,codTipo,email,telefone) VALUES ('".$this->nome."', '".$this->nick."','".$this->senha."',".$this->codTipo.",'".$this->email."',".$this->phone.")";

		$resultado = mysqli_query($conexao, $query);

		if($resultado){
			return "Usuario inserido com sucesso";
		}else{
			return "Erro!";
		}
	}
}
?>
