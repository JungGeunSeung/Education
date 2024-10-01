package kr.or.human.login;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/loginForm.do")
	public ModelAndView loginForm() {

		ModelAndView mav = new ModelAndView();

		mav.setViewName("login");

		return mav;
	}

	// 2차 프로젝트때 했던 방식과 같음
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req) {

		String userID = req.getParameter("userID");
		String userPW = req.getParameter("userPW");

		MemberDTO dto = new MemberDTO();
		dto.setUserID(userID);
		dto.setUserPW(userPW);

		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("result");

		return mav;
	}

	// 전달인자로 받는법
	@RequestMapping("/login2")
	public ModelAndView login2(

			// 어노텐션에 적힌 글자를 찾아 전달인자에 넣어준다.
			// String userID = req.getParameter("userID") 동일하다
			// 기본적으로 필수값으로 변경된다.
			// null이 들어갈 경우 400 Bad Request 코드 발생
			// required(필수값)의 기본값 : true
			@RequestParam("userID") String userID,

			// 만약 parameter의 key와 변수명이 같다면 @RequestParam 생략가능.

			@RequestParam(value = "userID", required = false) String userPW) {

//		String userID = req.getParameter("userID");
//		String userPW = req.getParameter("userPW");

		MemberDTO dto = new MemberDTO();
		dto.setUserID(userID);
		dto.setUserPW(userPW);

		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("result");

		return mav;
	}

	// Map으로 받는법
	@RequestMapping("/login3")
	public ModelAndView login3(@RequestParam Map user) { // 전달 받은 모든 것을 Map으로 전환
		String userID = (String) user.get("userID");
		String userPW = (String) user.get("userPW");

		MemberDTO dto = new MemberDTO();
		dto.setUserID(userID);
		dto.setUserPW(userPW);

		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("result");

		return mav;
	}

	// DTO 타입으로 넣어 자동으로 setter를 사용하는 법
	@RequestMapping("/login4")
	public ModelAndView login4(@ModelAttribute("dto") MemberDTO dto) { // @ModelAttribute : DTO에 알아서 넣어줌
		
		ModelAndView mav = new ModelAndView();
		
		// 어노텐션 뒤에다가 dto를 적어 생략가능.
		// request에 'dto'라는 key로 자동완성된 MemberDTO를 넣어줌
		// mav.addObject("dto", dto);
		
		mav.setViewName("result");

		return mav;
	}
	
	// @ModelAttribute("dto") 도 생략한 방법.
	@RequestMapping("/login5")
	public ModelAndView login5(MemberDTO dto) { // @ModelAttribute("dto")도 생략시request에 앞글자만
												 // 소문자로 바꾼 'memberDTO'라는 key로 넣어줌
												 // 그래서 EL태그로 꺼낼때 memberDTO. 으로 꺼내야함.
		ModelAndView mav = new ModelAndView();
		mav.setViewName("result");
		return mav;
	}
	
	// String 타입으로 보내는 방법 (제일 많이쓰는 방법)
	@RequestMapping("/login6")
	public String login6(String userID, MemberDTO dto, Model model) {
		System.out.println("login6 실행");
		System.out.println("userID : " + userID);
		System.out.println(dto);
		
		model.addAttribute("userID", userID);
		model.addAttribute("dto", dto);
		
		return "result";
	}
	
	@RequestMapping("result")
	public void login7 (MemberDTO dto) {
		 // return type이 void
	      // 또는 return값이 null 일때 주소의 마지막 "." 앞의 주소를 ViewResolver로 보냄
	      // 즉 주소.jsp가 호출
	      
	      // 그래도 읽기 좋게 명시적으로 return "result"; 해 주는게 좋다
	}
}
