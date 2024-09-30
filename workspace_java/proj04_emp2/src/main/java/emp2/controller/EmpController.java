package emp2.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp2.service.EmpService;

@WebServlet("/emp")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/emp doGet 실행");

        String empno2 = request.getParameter("empno");

        System.out.println("empno : " + empno2);

        EmpService empService = new EmpService();
        List list = empService.getEmp(empno2);

        request.setAttribute("list", list);

        request.getRequestDispatcher("/WEB-INF/views/empList.jsp").forward(request, response);
			
	}

}
