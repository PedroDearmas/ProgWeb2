<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Lista de Vendas</h2>

	<table border="1">
		<tr>

			<th>id</th>
			<th>Cliente</th>
			<th>Email Cliente</th>
			<th>Produto</th>
			<th>Valor Pago</th>
			<th>Tipo Pagamento</th>
			<th>Tipo Entrega</th>
			<th>Status Pagamento</th>

		</tr>

		<c:forEach items="${vendas}" var="venda">

			<tr>

				<td>${venda.id}</td>
				<td>${venda.cliente}</td>
				<td>${venda.clienteEmail}</td>
				<td>${venda.produto}</td>
				<td>${venda.valorPago}</td>
				<td>${venda.tipoPagamento}</td>
				<td>${venda.tipoEntrega}</td>
				<td>${venda.statusPagamento}</td>
			</tr>
		</c:forEach>
	</table>
	 
	<br>
	<a href="cadastro-venda-pag-digital.html">Lista de Vendas com pagamento digital</a>
	
</body>
</html>