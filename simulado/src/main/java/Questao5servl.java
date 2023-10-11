

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Questao5servl
 */
@WebServlet("/questao5")
public class Questao5servl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	      
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int dia = Integer.parseInt(request.getParameter("dia"));
		int mes = Integer.parseInt(request.getParameter("mes"));
		int ano = Integer.parseInt(request.getParameter("ano"));
		String pais = request.getParameter("pais");
		
		response.setContentType("text/html");
		PrintWriter saida = response.getWriter();
		
		String nmes = "";
		
		if(mes == 1) {
			
		}
		
	}
}
