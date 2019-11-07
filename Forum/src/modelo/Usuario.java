package modelo;

/**
*
* @author Idian Capozzoli
* @author Thiago Hadano
*
*/
public class Usuario {
	public int codigoUsuario;
	public String nome;
	public String nick;
	public String email;
	public String telefone;
	public String senha;
	
	/**
	 * Construtor do usuario que recebe parâmetros
	 * @param nome 	nome do usuario
	 * @param nick	nick/login do usuário
	 * @param email	email do usuário
	 * @param telefone	telefone do usuário
	 * @param senha	senha do usuário
	 */
	
	
	public Usuario() {
		
	}
	
	public Usuario(String nome,String nick, String email, String telefone, String senha ) {
		this.nome=nome;
		this.nick=nick;
		this.email=email;
		this.telefone=telefone;
		this.senha=senha;
	}
	
	public Usuario(int codigoUsuario, String nome,String nick, String email, String telefone, String senha ) {
		this.codigoUsuario=codigoUsuario;
		this.nome=nome;
		this.nick=nick;
		this.email=email;
		this.telefone=telefone;
		this.senha=senha;
	}
	
	
	/**
	 * Método para retornar código do usuario
	 * @return codigoUsuario 
	 */
	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	
	/**
	 * Método para alterar código do usuário
	 */
	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	
	
	/**
	 * Método para retornar nome do usuário
	 * @return nome 
	 */
	public String getNome() {
		return nome;
	}

	
	/**
	 * Método para alterar nome do usuário
	 * @param nome String
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	/**
	 * Método para retornar email do usuário
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	
	
	/**
	 * Método para alterar email do usuário
	 * @param email String
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	/**
	 * Método para retornar nick do usuário
	 * @return nick
	 */
	public String getNick() {
		return nick;
	}
	
	
	/**
	 * Método para alterar nick do usuário
	 * @param nick String
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	
	/**
	 * Método para retornar telefone do usuário
	 * @return telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	
	/**
	 * Método para alterar telefone do usuário
	 * @param telefone String
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	/**
	 * Método para retornar a senha do usuário
	 * @return senha
	 */
	public String getSenha() {
		return senha;
	}

	
	/**
	 * Método para alterar a senha do usuário
	 * @param senha String
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
