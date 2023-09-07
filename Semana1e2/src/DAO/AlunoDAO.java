package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import auxiliares.FabricaDeConexoesBD;
import modelo.Aluno;

public class AlunoDAO {
	// a conexão com o banco de dados
	private Connection connection;

	public AlunoDAO() {
		this.connection = new FabricaDeConexoesBD().obterConexao();
	}

	public void adiciona(Aluno aluno) {

		String sql = "INSERT INTO pgweb2.alunos (nome, idade) VALUES (?,?)";

		try {
			// objeto PreparedStatement para inserção com parâmetros
			PreparedStatement stmt = connection.prepareStatement(sql);
			// seta os valores dos parâmetros
			stmt.setString(1, aluno.getNome());
			stmt.setInt(2, aluno.getIdade());
			// executa a query
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Aluno consultarPorID(int idAlunoBuscado) {
		try {
			String sql = "SELECT id, nome, idade FROM pgweb2.alunos WHERE id = ?";
			// objeto PreparedStatement para consulta com parâmetros
			PreparedStatement prepStmt = connection.prepareStatement(sql);
			// seta o valor do parâmetro com o valor recebido do método
			prepStmt.setInt(1, idAlunoBuscado);
			// executa a query
			ResultSet resultSet = prepStmt.executeQuery();
			Aluno alunoBD = new Aluno();
			while (resultSet.next()) {
				// pega o valor de cada coluna da linha corrente do cursor
				int idBD = resultSet.getInt("id");
				String nomeBD = resultSet.getString("nome");
				int idadeBD = resultSet.getInt("idade");
				alunoBD.setId(idBD);
				alunoBD.setNome(nomeBD);
				alunoBD.setIdade(idadeBD);
			}
			prepStmt.close();
			resultSet.close();
			return alunoBD;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public void excluir (Aluno umAlunoBD) {
		String sql = "DELETE FROM pgweb2.alunos where id = ?";
		try {
			PreparedStatement preparedStatement;
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, umAlunoBD.getId());
			preparedStatement.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Aluno> listarTodos(){
		try {
			ArrayList<Aluno> alunos = new ArrayList<Aluno>();
			String sql = "SELECT id, nome, idade from pgweb2.alunos";
			java.sql.Statement statement = connection.createStatement();
			ResultSet resulSet = statement.executeQuery(sql);
			while(resulSet.next()) {
				Aluno aluno = new Aluno();
				aluno.setId(resulSet.getInt("id"));
				aluno.setNome(resulSet.getString("nome"));
				aluno.setIdade(resulSet.getInt("idade"));
				alunos.add(aluno);
			}
			resulSet.close();
			statement.close();
			return alunos;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}