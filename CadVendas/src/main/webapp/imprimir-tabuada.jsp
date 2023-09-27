<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercício 2</title>

</head>
<body>
<%
	String n = request.getParameter("n");

	int numero = Integer.parseInt(n);

	for (int x=1; x<=10; x++){

	out.print("<br />"+x + " x " + numero + " = " + numero*x);
	}
%>
</body>
</html>