package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import controle.Conexao;
import modelo.Usuario;
import visao.PaginaInicial;

public class UsuarioDAO {
	
	Conexao con = new Conexao();
	private ArrayList<String> dados = new ArrayList<String>();
   

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
	
	
	public Usuario fazerLogin (String nick, String senha){
		 
		 try {
				PreparedStatement pstmt = con.getConexao().prepareStatement(
						"select * from usuario where nick =? and senha =?;");
				
				pstmt.setString(1, nick);
				pstmt.setString(2, senha);
				
				ResultSet rs = pstmt.executeQuery();
				
				if (rs.next()) {
					Usuario usuario = new Usuario(rs.getInt("codigoUsuario"), rs.getString("nome"),rs.getString("nick"),rs.getString("email"),rs.getString("telefone"),rs.getString("senha"));
					return usuario;
				}
						
				}catch (SQLException e) {
				e.printStackTrace();
			}
		return null;

	 }
	
	public void editarUsuario (){
		 
		 try {
				PreparedStatement pstmt = con.getConexao().prepareStatement(
						"update usuario set nome = ?, nick = ?, email = ?, telefone= ? where codigoUsuario = ?");
				
				pstmt.setString(1, PaginaInicial.usuarioLogado.getNome());
				pstmt.setString(2, PaginaInicial.usuarioLogado.getNick());
				pstmt.setString(3, PaginaInicial.usuarioLogado.getEmail());
				pstmt.setString(4, PaginaInicial.usuarioLogado.getTelefone());
				pstmt.setInt(5, PaginaInicial.usuarioLogado.getCodigoUsuario());
				
				pstmt.executeUpdate();	
				
				}catch (SQLException e) {
				e.printStackTrace();
			}

	 }
	
	
	public void excluirUsuario (){
		 
		 try {
				PreparedStatement pstmt = con.getConexao().prepareStatement(
						"delete from usuario where codigoUsuario=?");
				pstmt.setInt(1,  PaginaInicial.usuarioLogado.getCodigoUsuario());
				
				pstmt.executeUpdate();	
						
				}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	 }
	
	
	public ArrayList<String> consultaUsuario(String nickRecebido) {

		ResultSet rs = null;
		
		try {		
		
			PreparedStatement pstmt = con.getConexao().prepareStatement(
					"select nome, nick from usuario where nick = ?");
		
			pstmt.setString(1, nickRecebido);
			
			rs = pstmt.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					dados.add("NICK:  " + rs.getString("nick") + "          --           NOME:   " + rs.getString("nome"));
				}
				
			}else {
				dados.add("Usuário não encontrado, digite outro nick!");

			}
			return dados;
					
		} catch (SQLException e) {
			e.printStackTrace();
		}   
		
		return null;
		
	}

}
