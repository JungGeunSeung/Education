package kr.or.human.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.human.HomeController;
import kr.or.human.dto.EmpDTO;
import kr.or.human.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService empService;
	
	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
	
	@RequestMapping("/member")
	public String listEmp(Model model) {
		
		List<EmpDTO> list = empService.listEmp();
		model.addAttribute("list",list);
		
		logger.debug("debug list.size() : " + list.size());
		logger.info("info list.size() : " + list.size());
		logger.warn("warn list.size() : " + list.size());
		logger.error("error list.size() : " + list.size());
		
		return "listEmp";
	}
	
	@RequestMapping("/member/one")
	public String listEmpOne(Model model, EmpDTO dto) {
		
		List<EmpDTO> list = empService.listEmpOne(dto);
		model.addAttribute("list",list);
		
		return "listEmp";
	}
	
	@RequestMapping("/member/write/update")
	public String inupdate(Model model, EmpDTO dto) {
		model.addAttribute("list",dto);
		return "update";
	}
	
	@RequestMapping("/member/update")
	public String update(EmpDTO dto, Model model) {
		
		int result = empService.updateEmp(dto);
		System.out.println("result 결과 : " + result);
		List<EmpDTO> list = empService.listEmp();
		model.addAttribute("list",list);
		return "redirect:/member";
	}
	
	@RequestMapping("/member/delete")
	public String delete(EmpDTO dto, Model model) {
		
		int result = empService.deleteEmp(dto);
		System.out.println("result 결과 : " + result);
		List<EmpDTO> list = empService.listEmp();
		model.addAttribute("list",list);
		
		return "redirect:/member";
	}
	
	@RequestMapping("/member/write/insert")
	public String ininsert() {
		return "insert";
	}
	
	@RequestMapping("/member/insert")
	public String insert(EmpDTO dto, Model model) {
		
		int result = empService.insertEmp(dto);
		System.out.println("result 결과 : " + result);
		List<EmpDTO> list = empService.listEmp();
		model.addAttribute("list",list);
		
		return "redirect:/member";
	}
	
	
	
}
