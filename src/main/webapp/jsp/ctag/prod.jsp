<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>prod</h3>

<form action="/prodTagServlet" method="get">
<select  id="lang" name="lang">
	<c:forEach items="${lprodList}" var="vo" >
		<option value="1"></option>
	</c:forEach>

</select>
</form>


<tags:logging/>
		<c:forEach items="${lprodList}" var="vo">
			<br>${vo.lprod_id} / ${vo.lprod_gu} / ${vo.lprod_nm}
		</c:forEach>	
		<br>
<tags:logging/>	

<tags:prodSelect>


</tags:prodSelect>


</body>
</html>