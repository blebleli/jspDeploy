package kr.or.ddit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FowardServlet
 */
@WebServlet("/fowardServlet")
public class FowardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("FowardServlet doGet");
		
		//foward.jsp 로 위임
		RequestDispatcher rd = request.getRequestDispatcher("jsp/foward.jsp"); //인자 -- 위임할 주소 입력
		rd.forward(request, response);

		//최초요청된 주소 그대로 유지된다.
	}
}
