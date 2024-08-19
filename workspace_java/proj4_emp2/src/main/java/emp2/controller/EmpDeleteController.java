package emp2.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp2.service.EmpService;

@WebServlet("/empDelete")
public class EmpDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("EmpDeleteController doPost 실행");
		String empno = request.getParameter("empno");
		
		int empno2 = 0;
		
		if(empno != null) {
			empno2 = Integer.parseInt(empno);
		} else {
			System.out.println("null");
		}
		EmpService empService = new EmpService();
		int dto = empService.delete(empno2);
		System.out.println("삭제 개수 :" + dto);
		
		response.sendRedirect("emp");
	}


}
