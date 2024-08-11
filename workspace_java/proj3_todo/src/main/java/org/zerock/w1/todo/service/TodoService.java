package org.zerock.w1.todo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.zerock.w1.todo.dto.TodoDTO;

public class TodoService {

	public void register(TodoDTO tododto) {
		// 원래는 DB에 insert 하는게 있어야 한다.
		System.out.println("등록중... " + tododto.toString());
		
	}
	
	public List<TodoDTO> getList() {
		// 원래는 DB에서 select 한 녀석들을 가지고 와서 만들어야 한다.
		List<TodoDTO> list = new ArrayList<TodoDTO>();
	
		for(int i =0; i<10; i++) {
			TodoDTO dto = new TodoDTO();
			dto.setTno(i);
			dto.setTitle("todo..." + i);
			dto.setDueDate(LocalDate.now());
			
			list.add(dto);
		}
		
		return list;
	}
}
