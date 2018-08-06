package kr.or.ddit.jstl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LocaleSelect
 */
@WebServlet("/localeSelect")
public class LocaleSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//localeSelect.jsp 에서
		//location.href="/localeSelect?lng="+langu; 이부분의 lng을 get으로 가져온다
		//String lng = request.getParameter("locale");
		//lng = lng == null? "ko" : lng;
			
		//request.setAttribute("locale", lng);
		
		request.getRequestDispatcher("/jsp/jstl/localeSelect_c.jsp").forward(request, response);
	}

//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
//	//view로 위임
//
//		req.getRequestDispatcher("/jsp/jstl/localeSelect_c.jsp").forward(req, resp);
//	}
	
}
