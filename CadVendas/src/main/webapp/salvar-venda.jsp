<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="modelo.Venda"%>
<%@ page import="DAO.VendaDAO"%>
<html>
<head>
<title>Exercício 3</title>
</head>
<body>
	<%

String produto = request.getParameter("nome");
String valor = request.getParameter("valor");

out.println("produto = " + produto);
out.println("valor = " + valor);

int valorInt = Integer.parseInt(valor);

Venda v = new Venda();
v.setItem(produto);
v.setValor(valorInt);

VendaDAO dao = new VendaDAO();
int status = dao.inserir(v);

if(status == 1){
out.print("Venda inserida com sucesso.");
}

else {
out.print("Desculpe, não pode salvar!");
}

%>
</body>
</html>
