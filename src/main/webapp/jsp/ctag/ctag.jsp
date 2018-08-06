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

<h3>logging</h3>

<tags:logging/>
		<c:forEach items="${studentList}" var="vo">
			<br>${vo.id} / ${vo.name} / ${vo.call_cnt} / ${vo.reg_dt}
		</c:forEach>	
		<br>
<tags:logging/>			
			 
			 
			 
<h3>colorlogging</h3>

<tags:colorLogging color="blue" size="20"/>			 
	<c:forEach items="${studentList}" var="vo">
			<br>${vo.id} / ${vo.name} / ${vo.call_cnt} / ${vo.reg_dt}
	</c:forEach>
			<br>	
<tags:colorLogging color="red"/>			

</body>
</html>