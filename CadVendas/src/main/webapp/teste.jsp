<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:import url="cabecalho.jsp" />
	<br /> 
	
	<c:set var= "idade" value="15"/>
	<c:if test="${idade >5 }">
		idade 10
	</c:if>
	
	idade: <c:out value = "${idade }"/>
		
	<br />
	<c:import url="rodape.jsp" />
</body>
</html>