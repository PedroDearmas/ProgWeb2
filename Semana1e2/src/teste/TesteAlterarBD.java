package teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import auxiliares.FabricaDeConexoesBD;


public class TesteAlterarBD {
	public static void main(String[] args) {
		try {
			Connection connection = new FabricaDeConexoesBD().obterConexao();
				
			String sql = "UPDATE pgweb2.alunos SET nome = ? WHERE id = ? ";
	
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, "MARIAZINHA");
			preparedStatement.setInt(2, 6);
			preparedStatement.executeUpdate();
			System.out.println("dado ALTERADO no banco");
		
			//feche a instrução preparada e a conexão após a conclusão
			preparedStatement.close();
			connection.close();
	
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
}
