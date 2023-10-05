package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.VendaPagDigital;
import models.VendaPagDigitalDAO;

@WebServlet("/inserirVendaPagDigitalServlet")
public class InserirVendaPagDigitalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		
		String NomeCli = request.getParameter("nomeCliente");
		String EmailCli = request.getParameter("emailCliente");
		String NomeProd = request.getParameter("nomeProduto");
		double ValPago = Float.parseFloat(request.getParameter("valorProduto"));
		String FormPag = request.getParameter("formaPagamento");
		String TipoEntr = request.getParameter("tipoDeEntrega");
		
		
		VendaPagDigital v = new VendaPagDigital();

		v.setCliente(NomeCli);
		v.setClienteEmail(EmailCli);
		v.setProduto(NomeProd);
		v.setValorPago(ValPago);
		v.setTipoPagamento(FormPag);
		v.setTipoEntrega(TipoEntr);
		
		
		if (FormPag.equals("Cartao de credito")){
			v.setStatusPagamento("Pagamento Confirmado");
		}else {
			v.setStatusPagamento("Aguardando Pagamento");
		}
		
		int satus = VendaPagDigitalDAO.inserir(v);
		
		
		request.setAttribute("venda", v);
		
		RequestDispatcher rd = request.getRequestDispatcher("ConfirmVenda.jsp");
		rd.forward(request, response);	
	}
}