<%@tag language="java" pageEncoding="UTF-8"%>
<%@tag import="java.sql.SQLException"%>
<%@tag import="java.sql.DriverManager"%>
<%@tag import="java.sql.ResultSet"%>
<%@tag import="java.sql.Statement"%>
<%@tag import="java.sql.Connection"%>
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
			String sql = "select * from lprod"; //세미콜론 빼고
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
			
			out.write("<h3>lprod</h3>");
			out.write("<table>");                   
			out.write("<tr>          ");
			out.write("<th>prod_id</th> ");
			out.write("<th>prod_nm</th> ");
			out.write("<th>prod_gu</th> ");
			out.write("</tr>         ");
			
			while(rs.next()){ 
				//레코드를 다음으로 넘기는것. re.에 다양한 지정방법이 있다.
				// 컬럼의 데이터를 가져오기위한 메서드는 'get자료형이름()'메서드 사용하는데
				// 이 메서드의 매개값으로 '컬럼명' 또는 '컬럼번호'를 
				// 지정하면 된다. (컬럼번호는 1번부터 시작한다.)
				out.write("<tr>");
				out.write("<td>"+(rs.getInt("prod_id"))+"</td>");
				out.write("<td>"+(rs.getString("prod_nm"))+"</td>");
				out.write("<td>"+(rs.getInt("prod_gu"))+"</td>");
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