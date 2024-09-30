package org.zerock.w1.todo.service;

import java.time.LocalDate;
import java.util.List;

import org.zerock.w1.todo.dao.TodoDAO;
import org.zerock.w1.todo.dto.TodoDTO;

public class TodoService {
	
	
	

	public static final String INSTANCE = null;

	public int register(TodoDTO todoDTO) {
		// 원래는 DB에 insert 하는게 있어야 한다.
		System.out.println("등록중... " + todoDTO.toString());
		
		TodoDAO todoDAO = new TodoDAO();
		return todoDAO.insert(todoDTO);
		
	}
	
	public List<TodoDTO> getList() {
		// 원래는 DB에서 select 한 녀석들을 가지고 와서 만들어야 한다.
		
		TodoDAO todoDAO = new TodoDAO();
		
		List<TodoDTO> list = todoDAO.selectAll();
	
//		for(int i =0; i<10; i++) {
//			TodoDTO dto = new TodoDTO();
//			dto.setTno(i);
//			dto.setTitle("todo..." + i);
//			dto.setDueDate(LocalDate.now());
//			
//			list.add(dto);
//		}
		
		return list;
	}
	
	public TodoDTO get(int tno1) {
		TodoDTO dto1 = new TodoDTO();
		
		TodoDAO dao = new TodoDAO();
		dto1 = dao.selectOne(tno1);
//		dto.setTno(tno);
//		dto.setTitle("sample");
//		dto.setDueDate(LocalDate.now());
//		dto.setFinished(true);
		
		return dto1;
	}

	public int update(TodoDTO todoDTO) {
		TodoDAO todoDAO = new TodoDAO();
		return todoDAO.update(todoDTO);
	}
	
	public int delete(int tno) {
		TodoDAO todoDAO = new TodoDAO();
		return todoDAO.delete(tno);
	}

}
