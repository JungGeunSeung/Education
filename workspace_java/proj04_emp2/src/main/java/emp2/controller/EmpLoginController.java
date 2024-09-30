package emp2.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import emp2.dto.EmpDTO;
import emp2.service.EmpService;

@WebServlet("/login")
public class EmpLoginController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("EmpLoginController doPost 실행");
		
		try {
			String ename = request.getParameter("id");
			String empno = request.getParameter("pw");
			
			EmpDTO dto = new EmpDTO();
			dto.setEname(ename);
			dto.setEmpno(Integer.parseInt(empno));
			
			EmpService service = new EmpService();
			EmpDTO result = service.loginCheck(dto);
			
			// 돌려받은 값들을 세션에 넣기
			
			
			if(result != null) {
				HttpSession session = request.getSession();
				session.setAttribute("loginDTO", result);

				// list 페이지로 sendRedirect 하기
				// 응답이 나가면 요청은 사라진다.
				response.sendRedirect(request.getContextPath() + "/emp");
			} else {
				System.out.println("로그인 되지 않았습니다.");
				response.sendRedirect(request.getContextPath() + "/login.jsp?code=LO01");
			}
			
			
			
			
			
		} catch	( Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
