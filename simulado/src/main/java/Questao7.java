

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Questao7
 */
@WebServlet("/questao7")
public class Questao7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		int idade = Integer.parseInt(request.getParameter("idade"));

		Aluno aluno = new Aluno(nome, idade);
		
		request.setAttribute("aluno", aluno);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("tela2.jsp");
		rd.forward(request, response);
	}
}
