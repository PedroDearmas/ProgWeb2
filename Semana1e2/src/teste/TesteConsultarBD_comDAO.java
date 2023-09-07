package teste;

import DAO.AlunoDAO;
import modelo.Aluno;

public class TesteConsultarBD_comDAO {

	public static void main(String[] args) {
		AlunoDAO alunoDAO = new AlunoDAO();
		Aluno umAluno = alunoDAO.consultarPorID(24);
		
		System.out.println("nome: " + umAluno.getNome());
		System.out.println("idade: " + umAluno.getIdade());
	}

}
