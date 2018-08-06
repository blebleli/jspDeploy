<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	td,th{
		border : 1px solid green;
	}
</style>
</head>
<body>
<%


	/*
 	데이터베이스 처리 순서

 1. 드라이버 로딩 ==>
 		DB 관련 작업을 수행할 수 있는 클래스를 메모리에 로딩하는 작업
 		Class.forName("Oracle.jdbc.driver.OracleDriver");  //메모리 로딩까지 해준다

 2. DB에 접속하기==> 
 		접속이 완료되면 Connection객체를 얻을 수 있다.
 		DriverManager.getConnection()메서드를 이용한다. 

 3. 질의(SQL 문을 실행한다.)==> 
 		Statement 객체 또는 PreparedStatement 객체를 이용하여
 		SQL 명령을 DB 에 전달하여 실행하고, 시행된 결과를 받아온다.
 4. 질의 결과를 받아서 처리하기
 		1)SQL문이 'select'문일 경우 ==> ResultSet 객체가 만들어지고
 		  이 ResultSet 객체에 select 한 결과가 담긴다.
 		2)SQL 문이 'insert','update','delete'등 'select'문이 아닐경우
 		  -처리된 결과가 정수값이 반환된다. 
 		   이 정수값의 의미는 처리된 '레코드 수'를 의미한다.
 5. 종료 ==> 사용했던 객체들의 자원을 반납한다.		     
 		(ResultSet, Statement, PreparedStatement, Connect)       


	 */

	 
		//DB 작업에 필요한 객체 변수 선언
		//java sql 으로 선택
		Connection conn = null;
		Statement stmt = null;	
		ResultSet rs = null;  //쿼리문이 'select' 일경우 필요

		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//2. DB 접속 => Connection 객체 생성						// 정식오라클이면 ocrl 임시 xe
			String url = "jdbc:oracle:thin:@localhost:1521:xe";  // @다음엔 내컴퓨터가 localhost 다은컴은 ip주소
			String user ="PC06";	//오라클 아이디
			String pass ="java";	//오라클 비번
			conn = DriverManager.getConnection(url, user, pass);

			//3. Statement 객체 생성(Statement객체는 Connection 객체를 이용해서 생성한다)
			stmt = conn.createStatement();

			//4. SQL 문을 Statement 객체를 이용하여 실행하고
			//  실행 결과를 ResultSet 객체에 저장한다.
			String sql = "select * from student"; //세미콜론 빼고
			rs = stmt.executeQuery(sql); 		// select문 일때 명령어 문자열을 매개변수로


			//5. 결과 처리 ==> ResultSet 객체에 저장되어 있는 자료를
			//				반복문을 이용하여 차례로 읽어와 처리한다.
			//처리결과가 여러개라면 레코드 개수가 여러개. 가 sesultset 에 담겨있다

			System.out.println("==실행 결과 ==");

			/* ResultSet 객체에 담겨 있는 데이터 에 접근하기 위해
			현재 작업을 진행하는 레코드를 가리키는 것이 있는데
			이것을 커서 라 한다.
			next() 메서드는 이 커서의 위치를 다음 레코드 위치로 
			이동시키고 그 자리에 데이터가 있으면 true 없으면 false 를 반환한다.*/
			
			out.write("<h3>성적표</h3>");
			out.write("<table>");                   
			out.write("<tr>          ");
			out.write("<th>번호</th> ");
			out.write("<th>이름</th> ");
			out.write("<th>국어</th> ");
			out.write("<th>영어</th> ");
			out.write("<th>수학</th> ");
			out.write("</tr>         ");
			
			while(rs.next()){ 
				//레코드를 다음으로 넘기는것. re.에 다양한 지정방법이 있다.
				// 컬럼의 데이터를 가져오기위한 메서드는 'get자료형이름()'메서드 사용하는데
				// 이 메서드의 매개값으로 '컬럼명' 또는 '컬럼번호'를 
				// 지정하면 된다. (컬럼번호는 1번부터 시작한다.)
				out.write("<tr>");
				out.write("<td>"+(rs.getInt("std_num"))+"</td>");
				out.write("<td>"+(rs.getString("std_name"))+"</td>");
				out.write("<td>"+(rs.getInt("std_kor"))+"</td>");
				out.write("<td>"+(rs.getInt("std_eng"))+"</td>");
				out.write("<td>"+(rs.getInt("std_mat")+"</td>"));
				out.write("</tr>");
			}
			out.write("</table>");
			
			System.out.println("출력 끝...");

		} catch (SQLException e) {
			e.printStackTrace();			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
			
			//6. 사용했던 자원 반납
			if(rs!=null) try {rs.close();} catch (SQLException e2) {}
			if(rs!=null) try {stmt.close();} catch (SQLException e2) {}
			if(rs!=null) try {conn.close();} catch (SQLException e2) {}	

		}
	
%>


</body>
</html>