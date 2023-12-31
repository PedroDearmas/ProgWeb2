package teste;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import auxiliares.FabricaDeConexoesBD;

public class TesteSelectBD {

	public static void main(String[] args) {
		try {
			Connection connection = new FabricaDeConexoesBD().obterConexao();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT id, nome, idade FROM pgweb2.alunos");

			while (resultSet.next()) {

				// pega o valor de cada coluna da linha corrente do cursor
				int id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				int idade = resultSet.getInt("idade");
				System.out.println("ID: " + id);
				System.out.println("Nome: " + nome);
				System.out.println("Idade: " + idade);
				System.out.println("------");
			}

			// fecha a conexão com o SGBD e libera os objetos da memória

			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
