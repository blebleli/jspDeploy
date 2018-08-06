package kr.or.ddit.ctag;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.lprod.service.LprodService;
import kr.or.ddit.lprod.service.LprodServiceInf;

/**
 * Servlet implementation class ProdTagServlet
 */
@WebServlet("/prodTagServlet")
public class ProdTagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		LprodServiceInf lprodService = new LprodService();
		
		List<LprodVo> lprodList = (List<LprodVo>)lprodService.getAllLprod();
		request.setAttribute("lprodList",lprodList );
		System.out.println(lprodList);

		request.getRequestDispatcher("/jsp/ctag/prod.jsp").forward(request, response); //인자 -- 위임할 주소 입력
	}



}
