<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- factorial method 
 0! =1
 1! =1
 2! = 2*1 = 2
 3! = 3*2*1 = 6
 4! = 4*3*2*1 = 24

--%>


<%!
public int factorial(int n){
	
	if(n<=1){
		return n;
	}else{
		return factorial(n-1)*n;
	}
}
%>

<%for(int i=1; i<=8; i++){%>
	<%=i+"일때 : "+factorial(i)%> <br>
<%}%>





</body>
</html>