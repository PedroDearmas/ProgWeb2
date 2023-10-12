

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/questao8")
public class Questao8 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		Aluno aluno1 = new Aluno ("Ana", 25);
		Aluno aluno2 = new Aluno ("Jonas", 24);
		Aluno aluno3 = new Aluno ("Marta", 30);
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		
		request.setAttribute("alunos", alunos);
		RequestDispatcher rd = request.getRequestDispatcher("tela3.jsp");
		rd.forward(request, response);
		
    }
}
