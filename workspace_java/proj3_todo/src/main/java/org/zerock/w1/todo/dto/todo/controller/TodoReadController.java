package org.zerock.w1.todo.dto.todo.controller;

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
		System.out.println("TodoListController doGet 실행");
		String test = request.getParameter("tno");
		int tno = 123;
		if(test != null) {
			tno = Integer.parseInt(test);
		} else {
			System.out.println("null");
			
		}
		
		TodoService todoservice = new TodoService();
		TodoDTO dto = todoservice.get(tno);
		
		request.setAttribute("dto", dto);
		
		request.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(request, response);
	
	}

}
