package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controle.Conexao;
import modelo.Comentario;
import modelo.Topico;

/**
 * 
 * @author Idian Capozzoli
 * @Author Thiago Hadano
 * 
 */
public class ComentarioDAO {
	
	Conexao con = new Conexao();
	
	public void insereTopico(Comentario comentario) {

		try {
			
			PreparedStatement pstmt = con.getConexao().prepareStatement(
					"insert into comentario (textoComentario, dataComentario, codigoPessoa, codigoTopico) "
					+ "values (?,?,?);");
		
			pstmt.setString(1, comentario.getTextoComentario());
			pstmt.setDate(2, comentario.getDataComentario());
			pstmt.setInt(3, comentario.getCodigoUsuario());
			pstmt.setInt(4, comentario.getCodigoTopico());
			
			
			pstmt.executeUpdate();	
			
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      
	}
	
	public ResultSet consultaPessoa() {
		
		ResultSet rs = null;
		
		try {		
		
			Statement stmt = con.getConexao().createStatement();
		
			rs = stmt.executeQuery("select * from pessoa");			
			
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      
		
		return rs;
	}
}
