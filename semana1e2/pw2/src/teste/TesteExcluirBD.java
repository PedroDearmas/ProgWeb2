package teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import auxiliares.FabricaDeConexoesBD;

public class TesteExcluirBD {
	
	public static void main(String[] args) {
	
		try {
			Connection connection = new FabricaDeConexoesBD().obterConexao();
				
			String sql = "DELETE FROM pgweb2.alunos WHERE id = ? ";
	
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, 4);
			preparedStatement.executeUpdate();
			System.out.println("dado deletado no banco");
		
			//feche a instrução preparada e a conexão após a conclusão
			preparedStatement.close();
			connection.close();
	
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
}
