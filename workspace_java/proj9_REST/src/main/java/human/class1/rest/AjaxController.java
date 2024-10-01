package human.class1.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	
	
	// .do와 같이 뒤에 주소를 붙혀서 사용자와 ajax로 주고 받는 주소로 서로 나눈다.
	
	@RequestMapping(value="/ajax.view", method=RequestMethod.GET)
	public String ajaxView() {
		
		return "ajax";
	}
	
	@RequestMapping(value="/ajax", method=RequestMethod.POST)
	public String ajax(String ename,@RequestBody EmpDTO dto, @ModelAttribute EmpDTO dto2 ) {
		// json으로 보냈더니 parameter로 받을수 없다.
		// 그래서 @RequestBody 어노텐션을 이용해 받아온다.
		// post로 보낸 json을 처리하고 생략이 불가하다.
		System.out.println("ename : "+ ename);
		System.out.println("dto : "+ dto);
		System.out.println("dto2 : "+ dto2);
		return "ajax";
	}
	
	// 그냥 글씨 리턴
	@RequestMapping(value="/ajax/string", method=RequestMethod.POST)
	@ResponseBody // ViewResolver를 타지 않고 바로 간다 그냥 글씨가 나간다.
				  // 그냥 값이나 json으로 리턴해준다.
	public String ajax(@RequestBody EmpDTO dto) {
		System.out.println("dto : "+ dto);
		return "human";
	}

	// dto를 리턴
	@RequestMapping(value="/ajax/dto", method=RequestMethod.POST)
	@ResponseBody
	public EmpDTO ajaxdto(@RequestBody EmpDTO dto) {
		System.out.println("dto : "+ dto);
		return dto;
	}

	// list를 리턴
	@RequestMapping(value="/ajax/list", method=RequestMethod.POST)
	@ResponseBody
	public List ajaxlist(@RequestBody EmpDTO dto) {
		System.out.println("dto : "+ dto);
		List list = new ArrayList();
		list.add(dto);
		list.add(dto);
		list.add(dto);
		return list;
	}
	
	// forward 방식으로 주소를 바꾸지 않은채 .view를 보여주는 리턴
	@RequestMapping(value="/ajax/forward", method=RequestMethod.GET)
	public String ajaxForward() {
		return "forward:/ajax.view";
	}
	
	// Redirect 방식으로 주소가 바뀐다.
	@RequestMapping(value="/ajax/redirect", method=RequestMethod.GET)
	public String ajaxRedirect() {
		return "redirect:/ajax.view";
	}
	
	@RequestMapping("/ajax/notice/{num}/static/{str}")
	@ResponseBody
	public int notice(
			// @PathVariable : 주소의 값을 가져 올수 있는 변수에만 쓸수 있는 어노텐션
			@PathVariable("num") int num,
			@PathVariable("str") String str1,
			HttpServletRequest request
			) {
		System.out.println("num : " + num);
		System.out.println("str1 : " + str1);
		System.out.println("request.getParameter('num') : " + request.getParameter("num"));
		
		
		
		return 1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
