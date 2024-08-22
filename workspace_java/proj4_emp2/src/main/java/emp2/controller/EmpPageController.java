package emp2.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp2.service.EmpPageService;

@WebServlet("/emp/page")
public class EmpPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/emp/page doGet 실행");
		
		
		String countPerPage = request.getParameter("countPerPage"); // 브라우저에서 표시할 글의 개수
		System.out.println("countPerPage : " + countPerPage);
		String page = request.getParameter("page"); // 현재 페이지 쪽수
		System.out.println("page : " + page);
		
		if(countPerPage == null) countPerPage = "10";
		
		if(page == null) page = "1";
		
		EmpPageService empPageService = new EmpPageService();
		
		Map map = empPageService.getEmpPage(countPerPage, page);
		
		System.out.println("map : " + map);
		
		request.setAttribute("map", map);
		request.setAttribute("countPerPage", countPerPage);
		request.setAttribute("page", page);
        
        request.getRequestDispatcher("/WEB-INF/views/empPageList.jsp").forward(request, response);
	}

}
