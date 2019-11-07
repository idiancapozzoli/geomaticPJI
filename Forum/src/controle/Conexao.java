package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Idian Capozzoli 
 * @Author Thiago Hadano
 *
 */

public class Conexao {

	Connection conexao;
	
	
	/**
	 * Construtor da conexão
	 */
	public Conexao() {

		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}
	
	}
	
	
	/**
	 * Método para retornar a conexão
	 * @return conexao
	 */
	
	public Connection getConexao() {
			if (conexao == null)
				try {
					conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/Forum?user=root&password=");
				} catch (SQLException e) {
					System.out.println("Connection error: " + e.getMessage());
				}
			return conexao;
			
		}
	

	/**
	 * Método para alterar conexão
	 * @param conexao conexão com banco de dados
	 */
	public void setConexao(Connection conexao) {
		this.conexao = conexao;
	}
	
	
	
}


