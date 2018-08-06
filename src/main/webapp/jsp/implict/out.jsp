<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	td{
		border : 1px solid green;
	}
</style>
</head>
<body>
	<%
	//기본객에 : request, response, session
	//out 객체 :  sevlet의 printWriter와 유사한객체
	//localhost : 8180/jsp/implict/out.jsp
	out.write("sumResult : "+session.getAttribute("sumResult"));
	// --suminput 에서 저장된것이 그대로 유지된다.
%>
<table>
<%	for (int i = 2; i <10; i++) {
		out.write("<tr>");
			for (int j = 1; j<10; j++) {
				out.write("<td>"+i+"*"+j+"="+(i*j)+"</td>");
				
			}
			out.write("</tr>");
		}
%>
</table>

</body>
</html>