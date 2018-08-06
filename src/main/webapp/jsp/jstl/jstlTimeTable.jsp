<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>

	td{border : 1px solid #ea8685;}
	th{background : #e66767;}
	
</style>
</head>
<body>

	<table>
		<tr>
			<th>단</th>
			<th>값</th>
		</tr>
		<c:forEach  begin="2" end="9" var="i">
			<%--index는0부터 시작한다. step은 단계 --%>

				<c:forEach  begin="2" end="9" var="j">
					<tr>
						<td>${i}*${j}</td>
						<td>${i*j}</td>
					</tr>
				</c:forEach>
		</c:forEach>
	</table>

</body>
</html>