package emp2.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp2.dto.EmpDTO;
import emp2.service.EmpService;

@WebServlet("/join")
public class EmpInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		System.out.println("EmpInsertController doGet 실행");
		
		request.getRequestDispatcher("/WEB-INF/views/empInsert.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("EmpInsertController doPost 실행");
		
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String sal = request.getParameter("sal");
		String deptno = request.getParameter("deptno");
		String job = request.getParameter("job");
		
		EmpDTO dto = new EmpDTO();
		
		dto.setEmpno(Integer.parseInt(empno));
		dto.setEname(ename);
		dto.setSal(Integer.parseInt(sal));
		dto.setDeptno(Integer.parseInt(deptno));
		dto.setJob(job);
		
		EmpService empService = new EmpService();
		
		int result = empService.joinEmp(dto);
		System.out.println("insert 결과 : " + result);
		
		response.sendRedirect("emp");
	}

}
