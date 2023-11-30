<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Confirmar Exclusão</h2>
	<p>Id: ${bairro.id}</p>
	<p>Nome: ${bairro.nome}</p>
	<p>População: ${bairro.populacao}</p>
	<a href="excluirBairroBD?id=${bairro.id}">Excluir</a>
	<input type="button" name="btnVoltar" value="Voltar" onclick="history.go(-1);">
</body>
</html>