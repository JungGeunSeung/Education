package human.class1.ajax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import human.class1.ajax.service.EmpServiceImpl;
	
@Controller
public class EmpController {
	
	@Autowired
	EmpServiceImpl empService;
	
	// ajax로 데이터를 처리하기 위해 @ResponseBody로 list를 리턴
	@RequestMapping("/listEmp")
	@ResponseBody
	public List listEmp(Model model) {
		
		List list = empService.listEmp();
		
		model.addAttribute("list", list);
		
		return list;
	}
	
	@RequestMapping("/emp")
	public String emp() {
		
		return "emp";
	}
}
