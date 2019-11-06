package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexao.FabricaConexoes;
import modelo.Usuario;

public class UsuarioDAO {
	
	FabricaConexoes con = new FabricaConexoes();

	public void insereUsuario(Usuario usuario) {

		try {
			
			PreparedStatement pstmt = con.getConexao().prepareStatement(
					"insert into usuario (nome, nick, email, telefone, senha) "
					+ "values (?,?,?,?,?);");
		
			pstmt.setString(1, usuario.getNome());
			pstmt.setString(2, usuario.getNick());
			pstmt.setString(3, usuario.getEmail());
			pstmt.setString(4, usuario.getTelefone());
			pstmt.setString(5, usuario.getSenha());	
			
			pstmt.executeUpdate();	
			
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      
	}
	
	public ResultSet consultaUsuario() {
		
		ResultSet rs = null;
		
		try {		
		
			Statement stmt = con.getConexao().createStatement();
		
			rs = stmt.executeQuery("select * from usuario");			
			
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      
		
		return rs;
	}
	
	
	public String checarLogin (String nick, String senha){
		 
		 try {
				
				PreparedStatement pstmt = con.getConexao().prepareStatement(
						"select * from usuario where nick = ?");
			
				pstmt.setString(1, nick);
				
				
				ResultSet rs = pstmt.executeQuery();
				
				if (!rs.next()) {
					return ("Nick errado");
				} else {
					if (rs.getString("senha").equals(senha)) {
					return ("OK! Você logou!");	
					} else {
						return ("Senha errada");
					}
					
					
				}	
						
				}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  return ("ok") ;    

	 }
	
	
	public int consultaCodigoUsuario(String nick){
		
			ResultSet rs = null;
			int codigoUsuario=0;
		 try {
				
				PreparedStatement pstmt = con.getConexao().prepareStatement(
						"select codigoUsuario from usuario\r\n" + 
						"where nick like ?;");
			
				pstmt.setString(1, nick);
				
				
				rs = pstmt.executeQuery();
				
				if (rs.next()) {
					 codigoUsuario = rs.getInt("codigoUsuario");  
					}
						
				}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		 return codigoUsuario;
	 }
		

	
}
