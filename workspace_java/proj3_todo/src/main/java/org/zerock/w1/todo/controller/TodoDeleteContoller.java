package org.zerock.w1.todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;
import org.zerock.w1.todo.service.TodoService;

@WebServlet("/todo/delete")
public class TodoDeleteContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TodoReadController doGet 실행");
		String tno2 = request.getParameter("tno");
		
		int tno = 0;
		
		if(tno2 != null) {
			tno = Integer.parseInt(tno2);
		} else {
			System.out.println("null");
		}
		TodoService todoservice = new TodoService();
		int dto = todoservice.delete(tno);
		System.out.println("삭제 개수 :" + dto);
		
		response.sendRedirect("list");
		
	}

}
