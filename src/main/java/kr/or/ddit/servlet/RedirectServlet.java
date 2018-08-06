package kr.or.ddit.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectServlet
 */
@WebServlet("/redirectServlet")
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//serclet 은 controller의 역할을 하는 객체로 
		//로직과 화면을 연결해준다.
		//화면은 서블릿에서 직접 제어하지 않는다.
		
		System.out.println("redirect doGet");
		
		//redirect를 통해 응답을 처리할 화면으로 이동하라고 브라우저에게 지시한다.
		//이쪽으로 응답을 다시보내라...! 주소가 이쪽으로 바꿔져야한다 내용도
		response.sendRedirect("/jsp/redirect.jsp");
		
		//f5 새로고침했을땐, redirect.jsp 그대로 로드된다.
		
		//redirect의 쓰임
		//서버상의 상태가 변경되는 경우
		// (ex : 게시판 글쓰기 - 게시글이 신규 생성된다.)
		// (ex : 게시판 업데이트 - 게시글이 수정된다.)
		//새로고침 눌렀을때 게시글이 계속 생성될수있다. -- servlet 타서 재생성안되도록.
		
		
	}

}
