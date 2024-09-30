package org.zerock.w1.todo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;

@WebServlet("/one")
public class TodoOneController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/one doGet 실행");
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8;");
		// response - 요청을 받으면 응답해주는 변수
		// getWriter() - 응답해줄때 사용하는 메소드중 하나 브라우저에 출력해줌
		PrintWriter out = response.getWriter();
		out.println("<h1>h");
		out.print("e");
		out.append("ll");
		out.write("o</h1>");
		
		// 브라우저에서 보낸 파라메터를 받는다
		// id의 값 출력하기
		String 아이디 = request.getParameter("id");
		System.out.println("아이디 : "+ 아이디);
		// pw의 값 출력하기
		String 비밀번호 = request.getParameter("pw");
		System.out.println("비밀번호 : "+ 비밀번호);
		
		out.println(아이디);
		out.println(비밀번호);
		
		out.println("<hr>");
		
		// 밑에 반복문에 dto를 담기위한 list 변수 생성
		List<TodoDTO> list = new ArrayList<TodoDTO>();
		
		// 반복문으로 10가지의 todolist를 생성 list에 담기
		for(int i=0; i<10; i++) {
			
			TodoDTO dto1 = new TodoDTO();
			dto1.setTno(i);
			dto1.setTitle("할일 "+ i);
			dto1.setDueDate(LocalDate.now());
			if(i % 3 == 0) {
				dto1.setFinished(true);
			}
			list.add(dto1);
		}
		
		for(int i=0; i<list.size(); i++) {
			
			TodoDTO dto2 = list.get(i);
			out.println("<div id=div"+i+">");
			out.println("<input type='checkbox' id='chk"+i+"'");
			if(dto2.isFinished() == true) {
				out.println("checked='true'");
			}
			out.println(">");
			out.println("순번 "+dto2.getTno());
			out.println("제목 "+dto2.getTitle());
			out.println("시간 "+dto2.getDueDate());
			out.println("완료여부 "+dto2.isFinished());
			out.println("</div>");
		}
		
		out.println("<script>");
		out.println("let chk = document.querySelectorAll('[type=checkbox]');");
		out.println("let div = document.querySelectorAll('div');");

		out.println("for(let i=0; i < chk.length && i < div.length; i++){"); // 배열 길이 제한
		out.println("chk[i].addEventListener('click', function(event){");
		out.println("console.log(i);");
		out.println("let html = '<input type=\"checkbox\" id=\"chk' + i + '\"' + (chk[i].checked ? ' checked' : '') + '>' + ' 순번 ' + i + ' 제목 할일 ' + i + ' 시간 2024-08-13 완료여부 ' + (chk[i].checked ? 'true' : 'false');");
		out.println("div[i].innerHTML = html;");
		out.println("});"); // 체크박스 이벤트 종료 괄호
		out.println("}"); // 반복문 종료 괄호

		out.println("</script>");
	}

}
