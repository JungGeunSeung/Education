package kr.or.human;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// @Target({ElementType.TYPE}) : type - 클래스에서만 사용 가능
// @Retention(RetentionPolicy.RUNTIME) : 실행되는 도중에도 살아있다
// @Documented 
// @Component : 스프링에게 Bean 으로 등록시키는 역할을 한다.
// Controller Bean (spring이 생성 할 수 있는 class)으로 등록한다.
@Controller // ("mainController") : 생략되어 있다.
// class에 붙은 @RequestMapping은 handlerMapping이 처리한다.
// ip:port/context-path/sub/** 형태 가 된다.
@RequestMapping("/sub")
public class MainController {
	
	// 메소드에 적용한 @RequestMapping은 HandlerAdapter가 처리한다.
	@RequestMapping("/test/main.do")
	public ModelAndView main1() {
		System.out.println("main1 실행");
		
		// ViewResolver로 보내는 객체
		ModelAndView mav = new ModelAndView();
		// forward로 이동하게 된다.
		mav.setViewName("main"); // jsp의 조합을 위해
		// ModelAndView mav = new ModelAndView("main"); : 생성과 동시에 적어도 실행된다.
		
		return mav;
	}
	
	@RequestMapping("/test/main2.do")
	public ModelAndView main2() {
		System.out.println("main2 실행");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		
		mav.addObject("msg", "오늘 어르신들의 집중력이 좋구만..(good)"); // request.setAttribute 처럼 담을 수 있다.
		
		return mav;
	}
	
	// 전달인자가 value하나일때는 value라는 글씨 생략 가능
	// 두개이상의 주소를 넣을때는 {} 안에 ,로 구분해서 넣는다
	// value는 url 패턴을 뜻한다.
	// method는 접근 방식 제한 생략하면 모든 방식 허용
	
	@RequestMapping( value = { "/test/main3.do", "/test/main4.do" },
					 method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView main3() {
		System.out.println("main3 실행");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		
		mav.addObject("msg", "main3 메소드 실행");
		
		return mav;
	}
	
//	url 주소와 method가 같으면 부팅 시 예외 발생
//	@RequestMapping("/test/main2.do")
//	public ModelAndView main4() {
//		System.out.println("main2 실행");
//		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("main");
//		
//		mav.addObject("msg", "오늘 어르신들의 집중력이 좋구만..(good)");
//		
//		return mav;
//	}
	
	// 주소가 같아도 method 가 달라서 작동 가능하다.
	@RequestMapping(value="/test/main5.do", method = RequestMethod.POST)
	public ModelAndView main5() {
		System.out.println("main5 실행");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg", "오늘 어르신들의 집중력이 좋구만..(good)");
		return mav;
	}
	@RequestMapping(value="/test/main5.do", method = RequestMethod.GET)
	public ModelAndView main6() {
		System.out.println("main6 실행");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg", "오늘 어르신들의 집중력이 좋구만..(good)");
		return mav;
	}
	
	// @RequestMapping(value="/test/main5.do", method = RequestMethod.PUT)
	// RequestMapping을 축약해서 쓸수 있다. (@PutMapping, @DeleteMapping, @GetMapping, @PostMapping)
	@PutMapping("/test/main5.do")
	public ModelAndView main7() {
		System.out.println("main6 실행");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg", "오늘 어르신들의 집중력이 좋구만..(good)");
		return mav;
	}
}
