package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IndexServlet
 */
//localhost:8180/IndexServlet

//index를 다시 잡아줄때 사용

@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IndexServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8"); //웹 인코딩을 utf-8로 설정할 수 있게된다
		
		PrintWriter pw = response.getWriter();
		pw.write("<!DOCTYPE html>");
		pw.write("<html>");
		pw.write("<head>");
		pw.write("<meta charset=\"UTF-8\">"); // 따옴표 겹칠때는 역슬러시로 한다.
		pw.write("<title>Insert title here</title>");
		pw.write("</head>");
		pw.write("<body>");
		pw.write("hello, eclipse tomcat");
		pw.write("2018.07.02. 오후4시15분");
		pw.write("<!-- http. -->"	);
		pw.write("	<!-- kr.or.ddit.layer -->");
		pw.write("</body>");
		pw.write("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
