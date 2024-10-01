package org.zerock.w1.todo.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;
import org.zerock.w1.todo.service.TodoService;

@WebServlet("/todo/modify")
public class TodoModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8;");
        
        System.out.println("/todo/modify doGet 실행");
		
        String tno = request.getParameter("tno");
		String title = request.getParameter("title");
		String dueDate = request.getParameter("dueDate");
		String finished = request.getParameter("finished");
		
		TodoDTO todoDTO = new TodoDTO();
		todoDTO.setTno(Integer.parseInt(tno));
		todoDTO.setTitle(title);
		todoDTO.setDueDate(LocalDate.parse(dueDate));
		boolean fini = true;
		if(finished != null) {
			if(finished.equals("false")) {
				fini = false;
			}
		}
		todoDTO.setFinished(fini);
		
		request.setAttribute("dto", todoDTO);
		
		
		request.getRequestDispatcher("/WEB-INF/todo/modify.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		System.out.println("/todo/modify doPost 실행");
		
		String tno = request.getParameter("tno");
		String title = request.getParameter("title");
		String dueDate = request.getParameter("dueDate");
		String finished = request.getParameter("finished");
		
		TodoDTO todoDTO = new TodoDTO();
		todoDTO.setTno(Integer.parseInt(tno));
		todoDTO.setTitle(title);
		todoDTO.setDueDate(LocalDate.parse(dueDate));
		if("N".equals(finished)) {
			todoDTO.setFinished(false);
		} else {
			todoDTO.setFinished(true);
		}
		System.out.println(todoDTO);
		
		TodoService todoService = new TodoService();
		int result = todoService.update(todoDTO);
		System.out.println("insert 결과 :"+ result);
		
		String contextPath = request.getContextPath();
		response.sendRedirect(contextPath + "/todo/list");
	}

}
