package teste;

import DAO.AlunoDAO;
import modelo.Aluno;

public class TesteExcluirBD_comDAO {
	
	public static void main(String[] args) {

		AlunoDAO alunoDAO = new AlunoDAO();
		Aluno umAlunoBD = alunoDAO.consultarPorID(2);
		alunoDAO.excluir(umAlunoBD);
		System.out.println("aluno(a) excluído(a)");
	}
}