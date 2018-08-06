<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--request 객체에 code속성이 "02"값으로 존재 --%>


<c:if test="${code =='02' }">
	brown
</c:if>
	
<c:choose>
	<c:when test="${code=='01' }"> brown</c:when>
	<c:when test="${code=='02' }"> brown</c:when>
	<c:when test="${code=='03' }"> brown</c:when>
	<c:otherwise> line rengers</c:otherwise>
	
</c:choose>	
	
</body>
</html>