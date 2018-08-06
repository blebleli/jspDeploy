package kr.or.ddit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class SumCalulation
 */
@WebServlet("/sumCalulation")
public class SumCalulation extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post방식은 이부분에 작성한다
				request.setCharacterEncoding("utf-8"); //받아오는값
				
				System.out.println(request.getMethod()); //===> POST form 부분 메서드에 정해준것이 넘어온다
			int start = Integer.parseInt(request.getParameter("start"));
			int end = Integer.parseInt(request.getParameter("end"));
			int result= 0;
			for (int i = start;  i<end; i++) {
				result += i;
			}
			
			//System.out.println(result);
			//request.getParameter 사용자가 보낸 파라미터를 받아오는 작업
			//request객체에 일시적으로 값을 저장하는 방법
			request.setAttribute("sumResult", result);
			
			//session에 sumResult 를 저장한다.
			HttpSession session = request.getSession();
			session.setAttribute("sumResult", result);
			
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/sumResult.jsp");
			rd.forward(request, response);
			
			
	}

}
