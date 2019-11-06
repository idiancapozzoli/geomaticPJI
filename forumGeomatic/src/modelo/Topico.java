package modelo;
import java.sql.Date;
/**
 * 
 * @author Idian Capozzoli 
 * @Author Thiago Hadano
 *
 */
public class Topico {
	private int codigoTopico;
	private String textoTopico;
	private Date dataTopico;
	private int codigoUsuario;
	
	
	/**
	 * Construtor de Tópico que recebe parâmetros
	 * @param textoTopico texto que o usuário irá escrever
	 * @param data data em que o tópico é feito
	 * @param usuario usuário que criou o tópico
	 */
	public Topico (String textoTopico, Date data, int codigoUsuario) {
		this.textoTopico=textoTopico;
		this.dataTopico= data;
		this.codigoUsuario=codigoUsuario;
	}

	public Topico (String textoTopico, Date data, int codigoUsuario, int codigoTopico) {
		this.textoTopico=textoTopico;
		this.dataTopico= data;
		this.codigoUsuario=codigoUsuario;
		this.codigoTopico=codigoTopico;
	}

	/**
	 * Método para retornar código do usuário que criou o tópico
	 * @return codigoUsuario
	 */
	public int getCodigoUsuario() {
		return codigoUsuario;
	}
	
	/**
	 * Método para alterar o código do usuário
	 * @param codigoUsuario int
	 */
	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	
	/**
	 * Método para retornar o código do tópico
	 * @return codigoTopico
	 */
	public int getCodigoTopico() {
		return codigoTopico;
	}

	
	/**
	 * Método para alterar código do tópico
	 * @param codigoTopico int
	 */
	public void setCodigoTopico(int codigoTopico) {
		this.codigoTopico = codigoTopico;
	}

	
	/**
	 * Método para retornar texto do tópico
	 * @return textoTopico
	 */
	public String getTextoTopico() {
		return textoTopico;
	}

	
	/**
	 * Método para alterar texto do tópico 
	 * @param textoTopico String
	 */
	public void setTextoTopico(String textoTopico) {
		this.textoTopico = textoTopico;
	}

	
	/**
	 * Método para retornar data em que o tópico foi feito
	 * @return dataTopico
	 */
	public Date getDataTopico() {
		return dataTopico;
	}

	
	/**
	 * Método para alterar a data em que o tópico foi feito
	 * @param dataTopico String
	 */
	public void setDataTopico(java.sql.Date dataTopico) {
		this.dataTopico = dataTopico;
	}

	
}