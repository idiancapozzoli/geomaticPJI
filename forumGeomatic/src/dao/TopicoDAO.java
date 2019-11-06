package dao;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import conexao.FabricaConexoes;
import modelo.Topico;

public class TopicoDAO {
	
	FabricaConexoes con = new FabricaConexoes();
	
	public void insereTopico(Topico topico) {

		try {
			
			PreparedStatement pstmt = con.getConexao().prepareStatement(
					"insert into topico (textoTopico, dataTopico, codigoUsuario) "
					+ "values (?,?,?);");
		
			pstmt.setString(1, topico.getTextoTopico());
			pstmt.setDate(2, (java.sql.Date) topico.getDataTopico());
			pstmt.setInt(3, topico.getCodigoUsuario());
			 
			pstmt.executeUpdate();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      
	}
	
	
	
	
	
	
	public ArrayList<Topico> consultaTopico() {
		

		
		ArrayList<Topico> topicos = new ArrayList<>(20);
		ResultSet rs = null;
		try {		
				
			Statement stmt = con.getConexao().createStatement();
			
			rs = stmt.executeQuery("select * from topico");

	

			
			while (rs.next()) {
				topicos.add(new Topico(rs.getString("textoTopico"), rs.getDate("dataTopico"), rs.getInt("codigoUsuario"), rs.getInt("codigoTopico")));
			}
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      
		
		return topicos;
	}
	
	
	
	
	
	
	
	
	public int consultaCodigoTopico(int codigoUsuario){
		
		ResultSet rs = null;
		int codigoTopico=0;
	 try {
			
			PreparedStatement pstmt = con.getConexao().prepareStatement(
					"select codigoTopico from topico,usuario\r\n" + 
					"where topico.codigoUsuario=?;");
		
			pstmt.setInt(1, codigoUsuario);
			
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				 codigoTopico= rs.getInt("codigoTopico");  
				}
					
			}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	 return codigoTopico;
 }
	
}
