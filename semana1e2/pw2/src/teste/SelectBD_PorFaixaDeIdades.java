package teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import auxiliares.FabricaDeConexoesBD;

public class SelectBD_PorFaixaDeIdades {

	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Digite a idade mínima: ");
			int idadeMinima = scanner.nextInt();
			System.out.print("Digite a idade máxima: ");
			int idadeMaxima = scanner.nextInt();
			scanner.close();
			
			Connection connection = new FabricaDeConexoesBD().obterConexao();
			
			PreparedStatement preparedstatement = connection.prepareStatement("SELECT id, nome, idade FROM pgweb2.alunos WHERE idade between ? and ? ");
			preparedstatement.setInt(1, idadeMinima);
			preparedstatement.setInt(2, idadeMaxima);
			ResultSet resultSet = preparedstatement.executeQuery();

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
			preparedstatement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
