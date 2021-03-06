<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//pageContext.setAttribute("userId", "brown");
%>

<c:set var="userId" value="bleble"/>

<fmt:setLocale value="ja"/>

<fmt:bundle basename="kr.or.ddit.msg.msg">
	<fmt:message key="hello"/><br>
	<fmt:message key="visitor">
		<fmt:param value="${userId}"/>
	</fmt:message>
</fmt:bundle>

<h3>setBundle</h3>
<fmt:setLocale value="en"/>
<fmt:setBundle basename="kr.or.ddit.msg.msg" var="msg"/>
<fmt:message bundle="${msg }" key="hello"/>
<fmt:message bundle="${msg }" key="visitor">
	<fmt:param value="${userId}"/>
</fmt:message>

</body>
</html>