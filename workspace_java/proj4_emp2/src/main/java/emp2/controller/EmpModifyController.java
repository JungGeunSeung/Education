package emp2.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp2.dto.EmpDTO;
import emp2.service.EmpService;

@WebServlet("/modify")
public class EmpModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8;");
        
        System.out.println("EmpModifyController doGet 실행");
		
        String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		String hireDate = request.getParameter("hireDate");
		String deptno = request.getParameter("deptno");
		String sal = request.getParameter("sal");
		String comm = request.getParameter("comm");
		String mgr = request.getParameter("mgr");
		
		EmpDTO empDTO = new EmpDTO();
		empDTO.setEmpno(Integer.parseInt(empno));
		empDTO.setEname(ename);
		empDTO.setJob(job);
		empDTO.setComm(Integer.parseInt(comm));
		empDTO.setDeptno(Integer.parseInt(deptno));
		empDTO.setMgr(Integer.parseInt(mgr));
		empDTO.setSal(Integer.parseInt(sal));
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		Date date = null;
		try {
		    // hireDate 문자열을 Date 객체로 변환합니다.
		    date = formatter.parse(hireDate);

		    // Date 객체를 java.sql.Date로 변환합니다.
		    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		    
		    // 변환된 날짜를 DTO에 설정합니다.
		    empDTO.setHireDate(sqlDate);
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		
		
		request.setAttribute("emp", empDTO);
		
		
		request.getRequestDispatcher("/WEB-INF/views/modify.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		System.out.println("EmpModifyController doPost 실행");
		
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		String hireDate = request.getParameter("hireDate");
		String deptno = request.getParameter("deptno");
		String sal = request.getParameter("sal");
		String comm = request.getParameter("comm");
		String mgr = request.getParameter("mgr");
		
		EmpDTO empDTO = new EmpDTO();
		try {
			empDTO.setEmpno(Integer.parseInt(empno));
			empDTO.setEname(ename);
			empDTO.setJob(job);
			empDTO.setComm(Integer.parseInt(comm));
			empDTO.setDeptno(Integer.parseInt(deptno));
			empDTO.setMgr(Integer.parseInt(mgr));
			empDTO.setSal(Integer.parseInt(sal));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		Date date = null;
		try {
		    // hireDate 문자열을 Date 객체로 변환합니다.
		    date = formatter.parse(hireDate);

		    // Date 객체를 java.sql.Date로 변환합니다.
		    java.sql.Date sqlDate = new java.sql.Date(date.getTime());

		    // 변환된 날짜를 DTO에 설정합니다.
		    empDTO.setHireDate(sqlDate);
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		
		System.out.println(empDTO);
		EmpService empService = new EmpService();
		int result = empService.update(empDTO);
		System.out.println("insert 결과 :"+ result);
		
		String contextPath = request.getContextPath();
		response.sendRedirect(contextPath + "/emp");
	}

}
