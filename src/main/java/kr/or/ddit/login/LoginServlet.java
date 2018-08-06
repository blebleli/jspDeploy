package kr.or.ddit.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.user.service.UserService;
import kr.or.ddit.user.service.UserServiceInf;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet") //폼테그에 설정한 값과 같아야한다.
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post방식은 이부분에 작성한다
		
		request.setCharacterEncoding("utf-8"); //받아오는값
		
		System.out.println(request.getMethod()); //===> POST form 부분 메서드에 정해준것이 넘어온다
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter pw = response.getWriter();
		
		//파라미터를 받아서 sysout으로 console 창에 출력
		String userId = request.getParameter("userId");  //form 에서 name부분의 이름을 가져오는것...!!
		String password = request.getParameter("password");
		System.out.println(userId);
		System.out.println(password);
		
		
		//로그인 프로세스 
		//가짜 service, dao 생성
		UserServiceInf userService = new UserService();
		UserVo userVo = userService.getUser(userId);
		
		
		//1. setAttribute 한번 set한다.
		request.setAttribute("test", "test");

		
		//session.setAttribute("sessionScope", request.getParameter("sessionScope"));
		//userService 에서 받아온 userVo 정보와 사용자가 입력한 정보가 동일한 경우
		//[로그인  성공] 메세지를 화면에 출력
		//정보가 틀릴경우
		//[로그인 실패] 메세지를 화면에 출력
		
		//db에서 불러온값과 비교
		
		//로그인 성공시 : forward/main.jsp로 이동하게만들고, 
		//로그인 실패시 : redirect/login.jsp
		
		//로그인 성공시 : userVO객체를 저장하여 (적당한 영역에)
		// main.jsp에서 사용자 아이디를 화면에 출력
		// 단 새로운 탭에서 main.jsp를 직접 접속해도 사용자 아이디가 화면에 나와야한다.
		if (userVo.validataUser(userId, password)) {
			
			HttpSession session = request.getSession();
			session.setAttribute("userVo", userVo);
			
			request.getRequestDispatcher("/main.jsp").forward(request, response); //인자 -- 위임할 주소 입력
			System.out.println("로그인성공");
			
		}else{
			//response.sendRedirect("/login/login.jsp"); 
			//forward 방식은 요청이 한번!
			request.getRequestDispatcher("/login/login.jsp").forward(request, response);
			System.out.println("로그인 실패");
		}
	
	}

}
