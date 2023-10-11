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
	<%
	
	String numero = request.getParameter("numero");
	int num1 = Integer.parseInt(numero);

	
	int dobro = num1 * 2;
	%>
	<p>

		O dobro de
		<%=num1%>
		é
		<%=dobro%>.

	</p>
</body>
</html>