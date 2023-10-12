

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
public class questao5 extends HttpServlet {
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
			nmes = "janeiro";
		}
		else if (mes == 2) {
			nmes = "fevereiro";
		}
		else if (mes == 3) {
			nmes = "março";
		}
		else if (mes == 4) {
			nmes = "abril";
		}
		else if (mes == 5) {
			nmes = "maio";
		}
		else if (mes == 6) {
			nmes = "junho";
		}
		else if (mes == 7) {
			nmes = "julho";
		}
		else if (mes == 8) {
			nmes = "agosto";
		}
		else if (mes == 9) {
			nmes = "setembro";
		}
		else if (mes == 10) {
			nmes = "outubro";
		}
		else if (mes == 11) {
			nmes = "novembro";
		}
		else if (mes == 12) {
			nmes = "dezembro";
		}
		
		
		if (pais.equals("brasil")) {
			saida.print("Data: "+dia+"/"+nmes+"/"+ano);
		}else if (pais.equals("inglaterra")) {
			saida.print("Data: "+nmes+"/"+dia+"/"+ano);
		}else {
			saida.print("Por favor selecione somente o pais inglaterra ou brasil");
		}
	}
}
