package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Idian Capozzoli 
 * @Author Thiago Hadano
 *
 */

public class FabricaConexoes {

	Connection conexao;
	
	/**
	 * Construtor da conexão
	 */
	public FabricaConexoes() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexao = (Connection) DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/Forum"
	            , "root"
	            , "20012003"  );
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Método para retornar a conexão
	 * @return conexao
	 */
	
	public Connection getConexao() {
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
