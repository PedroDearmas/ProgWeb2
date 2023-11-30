<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consulta De Bairro</title>
</head>
<body style="margin-top: -20px;">

	<c:import url="cabecalho.jsp" />

	<c:if test="${not empty mensagem}">
		<br />
		<br />
		<div
			style="color: white; background-color: green; width: 300px; text-align: center;">
			${mensagem}</div>
	</c:if>

	<h2>Dados do Bairro</h2>

	<form>
		Id: <input type="text" name="nome" value="${bairro.id}">
		<br /> <br /> 
		Nome: <input type="text" name="nome" value="${bairro.nome}">
		<br /> <br /> 
		População: <input type="text" name="populacao"value="${bairro.populacao}" size="2">
		<br /> <br /> 
		<input type="button" name="btnVoltar" value="Voltar" onclick="history.go(-1);">
	</form>

	<br />
	<br />
	<br />
	<c:import url="rodape.jsp" />

</body>
</html>