<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String res;

res = request.getAttribute("result").toString();

%>

<%-- <c:if test="${result > 20}"> --%>
<%-- <c:out value="The result is over than 20" /> --%>
<%-- </c:if> --%>

<c:choose>

<c:when test="${result >=0 && result > 20}">
<c:out value="The result is over than 20" />
</c:when>

<c:when test="${result >=0 && result < 20}">
<c:out value="The result is less than 20" />
</c:when>

<c:when test="${result >=0 && result == 20}">
<c:out value="The result is exactly 20" />
</c:when>

<c:otherwise>
No comment sir...
</c:otherwise>

   
</c:choose>


</body>
</html>