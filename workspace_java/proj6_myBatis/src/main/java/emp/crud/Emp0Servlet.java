package emp.crud;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Emp0")
public class Emp0Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Emp0Servlet doGet 실행");
		String strEmpno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		String cmd = request.getParameter("cmd");
		emp.crud.EmpDTO dto = new emp.crud.EmpDTO();
		try {
			if(strEmpno != null) {
				int empno = Integer.parseInt(strEmpno);
				dto.setEmpno(empno);
				
			}
			
			dto.setEname(ename);
			dto.setJob(job);
			java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
			dto.setHireDate(currentDate);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		if(cmd == null) {
			EmpDAO dao = new EmpDAO();
			List empList = dao.selectEmp();
			request.setAttribute("empList", empList);
			request.getRequestDispatcher("WEB-INF/views/emp.jsp").forward(request, response);
			
		} else if ("join".equals(cmd)) {
			request.setAttribute("cmd", cmd);
			request.getRequestDispatcher("WEB-INF/views/empJoin.jsp").forward(request, response);
		} else if ("adit".equals(cmd)) {
			request.setAttribute("dto", dto);
			request.setAttribute("cmd", cmd);
			request.getRequestDispatcher("WEB-INF/views/empJoin.jsp").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Emp0Servlet doPost 실행");
		
		String strEmpno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		String cmd = request.getParameter("cmd");
		
		if("join".equals(cmd)) {
			System.out.println("join으로 들어옴");
			try {
				int empno = Integer.parseInt(strEmpno);
				
				emp.crud.EmpDTO dto = new emp.crud.EmpDTO();
				dto.setEmpno(empno);
				dto.setEname(ename);
				dto.setJob(job);
				java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
				dto.setHireDate(currentDate);
				
				EmpDAO dao = new EmpDAO();
				System.out.println("dto : " + dto);
				int result = dao.insertEmp(dto);
				System.out.println("insert 결과 : " + result + "개");
				
				response.sendRedirect("/proj6_myBatis/Emp0");
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		} else if("adit".equals(cmd)) {
			System.out.println("adit으로 들어옴");
			try {
				int empno = Integer.parseInt(strEmpno);
				
				emp.crud.EmpDTO dto = new emp.crud.EmpDTO();
				dto.setEmpno(empno);
				dto.setEname(ename);
				dto.setJob(job);
				java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
				dto.setHireDate(currentDate);
				
				EmpDAO dao = new EmpDAO();
				System.out.println("dto : " + dto);
				int result = dao.updateEmp(dto);
				System.out.println("update 결과 : " + result + "개");
				
				response.sendRedirect("/proj6_myBatis/Emp0");
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			
		} else if ("delete".equals(cmd)) {
			System.out.println("delete으로 들어옴");
			emp.crud.EmpDTO dto = new emp.crud.EmpDTO();
			int empno = Integer.parseInt(strEmpno);
			dto.setEmpno(empno);
			
			EmpDAO dao = new EmpDAO();
			int result = dao.deleteEmp(dto);
			
			response.sendRedirect("/proj6_myBatis/Emp0");
		}
		
		
		
		
		
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Emp0Servlet doPut 실행");
	}

	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Emp0Servlet doDelete 실행");
	}

}
