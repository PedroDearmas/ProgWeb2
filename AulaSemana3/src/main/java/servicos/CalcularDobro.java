package servicos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcularDobro")
public class CalcularDobro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String numeroTxT = request.getParameter("numero");
		int numero = Integer.parseInt(numeroTxT);
		response.setContentType("text/html");
		PrintWriter saida = response.getWriter();
		saida.print("O dobro do número informado é o " + (2 * numero));
		if (numero > 10) {

			response.sendRedirect("http://www.google.com");

			// teste também com: response.sendRedirect(“tabuada");

		}
		saida.close();
	}
}
