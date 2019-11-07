import java.sql.Date;
import java.util.ArrayList;
/**
 * 
 * @author Idian Capozzoli 
 * @Author Thiago Hadano
 *
 */
public class Topico {
	private int codigoTopico;
	private String tituloTopico;
	private String textoTopico;
	private String dataTopico;
	private int codigoUsuario;
	private Usuario usuario;
	private ArrayList<Comentario> arrayComentario;
	
	
	/**
	 * Construtor de Tópico que recebe parâmetros
	 * @param textoTopico texto que o usuário irá escrever
	 * @param data data em que o tópico é feito
	 * @param usuario usuário que criou o tópico
	 */
	
	public Topico (String tituloTopico, String textoTopico, Usuario usuario) {
		this.tituloTopico=tituloTopico;
		this.textoTopico=textoTopico;
		this.usuario=usuario;
	
	}
	
	public Topico (String textoTopico, String dataTopico, int codigoUsuario) {
		this.textoTopico=textoTopico;
		this.dataTopico= dataTopico;
		this.codigoUsuario=codigoUsuario;
	}

	public Topico (String textoTopico, String dataTopico, int codigoUsuario, int codigoTopico) {
		this.textoTopico=textoTopico;
		this.dataTopico= dataTopico;
		this.codigoUsuario=codigoUsuario;
		this.codigoTopico=codigoTopico;
	}
	
	public void addComentario(Comentario comentario) {
		arrayComentario.add(comentario);
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
	public String getDataTopico() {
		return dataTopico;
	}

	
	/**
	 * Método para alterar a data em que o tópico foi feito
	 * @param dataTopico String
	 */
	public void setDataTopico(String dataTopico) {
		this.dataTopico = dataTopico;
	}

	public String getTituloTopico() {
		return tituloTopico;
	}

	public void setTituloTopico(String tituloTopico) {
		this.tituloTopico = tituloTopico;
	}

	public ArrayList<Comentario> getArrayComentario() {
		return arrayComentario;
	}

	public void setArrayComentario(ArrayList<Comentario> arrayComentario) {
		this.arrayComentario = arrayComentario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	
	
	
	

	
}