package teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import auxiliares.FabricaDeConexoesBD;

public class TesteInserirBD {

	public static void main(String[] args) {
		try {
			Connection connection = new FabricaDeConexoesBD().obterConexao();
			
			String sql = "INSERT INTO pgweb2.alunos (nome, idade)VALUES (?, ?)";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, "Pedro");
			preparedStatement.setInt(2, 20);
			//executa a query
			preparedStatement.executeUpdate();
			System.out.println("dado inserido no banco");
			
			//feche a instrução preparada e a conexão após a conclusão
			preparedStatement.close();
			connection.close();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}