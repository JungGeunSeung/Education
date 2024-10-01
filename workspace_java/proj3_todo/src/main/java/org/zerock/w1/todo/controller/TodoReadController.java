package org.zerock.w1.todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;
import org.zerock.w1.todo.service.TodoService;
@WebServlet("/todo/read")
public class TodoReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("TodoReadController doGet 실행");
		// 요청받은 파라메터를 변수에 저장
		String tno2 = request.getParameter("tno");
		
		int tno = 0;
		
		// 파라메터가 널이 아닐경우 숫자로 변환 (String to int)
		if(tno2 != null) {
			tno = Integer.parseInt(tno2);
		} else {
			System.out.println("null");
		}
		
		// TodoService를 호출하여 TodoDTO타입의 메소드를 호출하여 dto변수에 저장
		TodoService todoservice = new TodoService();
		TodoDTO dto = todoservice.get(tno);
		
		// 요청하는 곳에 키와 벨류로 저장
		request.setAttribute("dto", dto);
		
		// todo/read.jsp 로 forward
		request.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(request, response);
	
	}

}
