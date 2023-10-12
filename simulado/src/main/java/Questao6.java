
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Questao6
 */
@WebServlet("/questao6")
public class Questao6 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");

		request.setAttribute("NomeNoServ", nome);

		RequestDispatcher rd = request.getRequestDispatcher("tela.jsp");
		rd.forward(request, response);

	}
}
