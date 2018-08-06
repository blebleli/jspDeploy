package kr.or.ddit.ctag;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.student.model.StudentVo;
import kr.or.ddit.student.service.StudentService;
import kr.or.ddit.student.service.StudentServiceInf;

/**
 * Servlet implementation class CustomTagServlet
 */
@WebServlet("/customTag")
public class CustomTagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		//학생 1페이지 리스트 조회
		//request 객체 속성 설정
		//ctag.jsp로 전달(forward>
		
		Map<String, Integer> paramMap = new HashMap<String, Integer>();
		paramMap.put("page", 1);
		paramMap.put("pageSize", 10);
		
		StudentServiceInf studentService = new StudentService();
		
		Map<String, Object>resultMap = studentService.getStudentPageList(paramMap);
		
		//학생 페이지 리스트
		List<StudentVo> studentList = (List<StudentVo>)resultMap.get("pageList");
		request.setAttribute("studentList",studentList );
		System.out.println(studentList);

//		//페이지 네비게이션 문자열
//		String pageNavi = (String) resultMap.get("pageNavi");
//		request.setAttribute("pageNavi", pageNavi);

		request.getRequestDispatcher("/jsp/ctag/ctag.jsp").forward(request, response); //인자 -- 위임할 주소 입력
	}


}
