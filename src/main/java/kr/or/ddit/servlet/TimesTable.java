package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TimesTable
 */
@WebServlet("/TimesTableServlet")
public class TimesTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TimesTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter pw = response.getWriter();
		
		pw.write("<!DOCTYPE html>");
		pw.write("<html>");
		pw.write("<head>");
		pw.write("<meta charset=\"UTF-8\">"); // 따옴표 겹칠때는 역슬러시로 한다.
		pw.write("<title>Insert title here</title>");
		pw.write("</head>");
		pw.write("<body>");
	
		for (int i = 1; i <10; i++) {
			System.out.println("\n"+i+"단 ===============");
			pw.write("<tr>");
			for (int j = 1; j<10; j++) {
				pw.write("<td>"+i+"X"+j+"="+(i*j)+"</td>");
				System.out.println(i+"*"+j+" = "+i*j);
			}
			pw.write("</tr>");
		}
		pw.write("</body>");
		pw.write("</html>");
		pw.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
