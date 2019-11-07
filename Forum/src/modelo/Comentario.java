package modelo;

import java.sql.Date;
/**
 * 
 * @author Idian Capozzoli
 * @Author Thiago Hadano
 *
 */
public class Comentario {
	private int codigoComentario;
	private String textoComentario;
	private Date dataComentario;
	private Usuario usuario;
	private Topico topico;
	/**
	 * Construtor de Comentário que recebe parâmetros
	 * @param textoComentario texto que o usuário irá escrever
	 * @param dataComentario data em que o comentário será feito
	 * @param usuario usuário que criou o comentário
	 * @param topico qual tópico o comentário pertence
	 */
	public Comentario (String textoComentario, Date dataComentario, Usuario usuario, Topico topico) {
		this.textoComentario=textoComentario;
		this.dataComentario=dataComentario;
		this.usuario=usuario;
		this.topico=topico;
	}
	
	/**
	 * Método para retornar o código do usuário que criou o comentário
	 * @return codigoUsuario
	 */
	public int getCodigoUsuario() {
		return usuario.getCodigoUsuario();
	}
	
	
	/**
	 * Método para retornar o código do tópico que o comentário se refere
	 * @return codigoTopico
	 */
	public int getCodigoTopico() {
		return topico.getCodigoTopico();
	}
	
	
	/**
	 * Método para retornar o texto do comentário
	 * @return texto do comentário
	 */
	public String getTextoComentario() {
		return textoComentario;
	}

	
	/**
	 * Método para alterar o texto do comentário
	 * @param textoComentario String 
	 */
	public void setTextoComentario(String textoComentario) {
		this.textoComentario = textoComentario;
	}

	
	/**
	 * Método para retornar a data em que o comentário foi feito
	 * @return dataComentario
	 */
	public Date getDataComentario() {
		return dataComentario;
	}

	
	/**
	 * Método para alterar a data em que o comentário foi feito
	 * @param dataComentario Date
	 */
	public void setDataComentario(Date dataComentario) {
		this.dataComentario = dataComentario;
	}

	
	/**
	 * Método para retornar o usuário que criou o comentário
	 * @return usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	
	/**
	 * Método para alterar o usuário que criou o comentário
	 * @param usuario Usuario 
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	/**
	 * Método para retornar o tópico que o comentário pertence
	 * @return topico
	 */
	public Topico getTopico() {
		return topico;
	}

	
	/**
	 * Método para alterar o tópico que o comentário pertence
	 * @param topico Topico
	 */
	public void setTopico(Topico topico) {
		this.topico = topico;
	}
	
	
}

