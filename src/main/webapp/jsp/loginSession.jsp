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
<%-- SessionAttributeListner 를 통해 로그인시 application객체에 
	liginSessionMap 객체를 속성으로 저장 
	
	liginSessionMap loop를 돌며 데이터를 출력
	
	--%>
	
	loginSession count : ${loginSessionMap.size() } <br>
	
	<c:forEach items="${loginSessionMap }" var ="vo">
	${vo.key } / ${vo.value }
	</c:forEach>
	
	
	
</body>
</html>