package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.VendaPagDigital;
import models.VendaPagDigitalDAO;

/**
 * Servlet implementation class ListarVendaServlet
 */
@WebServlet("/ListarVendaServlet")
public class ListarVendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<VendaPagDigital> listaVendasPagDigital = new ArrayList<VendaPagDigital>();
		
		listaVendasPagDigital = VendaPagDigitalDAO.listarTodas();
		
		request.setAttribute("vendas", listaVendasPagDigital);
		
		RequestDispatcher rd = request.getRequestDispatcher("ListaDeVendas.jsp");
		rd.forward(request, response);	
	}
}
