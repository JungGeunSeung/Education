package org.zerock.w1.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 세션을 가져오는 방법
		// 기존 세션이 없으면 만들고, 있으면 가져온다
		HttpSession session = request.getSession();
		
		// 기존 세션이 없으면 null을 return, 있으면 가져옴.
		// 이미 로그인 되어있을때 세션을 가져오는 곳에서 사용
//		HttpSession session = request.getSession(false);
		
		// 세션에서 가져오는법. String타입으로 형변환 하여 변수에 담을수 있다.
		// 키가 없으면 null
		String value = (String)session.getAttribute("key");
		System.out.println("value : " + value);
		
		
		
		// isNew() : 세션이 처음 만들어진건지 여부를 알려주는 boolean타입
		// 관리하고 있는 JSESSIONID가 아닌 경우에 응답으로 JSESSIONID를 준다
		// 이때 true가 된다.
		System.out.println("session.isNew() : " + session.isNew());
		
		// getLastAccessedTime() : 이전에 마지막으로 접속했던 시간을 나타낸다 long 타입
		System.out.println("session.getLastAccessedTime() : " + session.getLastAccessedTime());
		
		// 세션에 넣는법
		
		if("admin".equals(request.getParameter("id"))) {
			
			session.setAttribute("isLogon", true);
			session.setAttribute("level", "관리자");
			
		}
		
		session.setAttribute("key", "value");
		
		
		
		
		
	}

}
