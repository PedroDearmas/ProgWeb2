<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
a lista vai entrar aqui

	<c:forEach items="${vendas}" var="venda">
	
		${venda.id} , $(venda.cliente)
	
	
	</c:forEach>

</body>
</html>