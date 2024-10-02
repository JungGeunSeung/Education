package kr.or.human;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */

// bean 으로 등록된다.
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	// @Controller 로 등록된 클래스는 @RequestMapping가 사용가능하다.
	// value는 주소를 뜻하고 이 주소로 들어오면 메소드를 실행하게 된다.
	// method = RequestMethod.GET : get방식으로만 들어오게 한다.(생략시 모든 method 허용 가능)
	// 오버라이드 되지 않았기 때문에, 전달인자를 바꿔도 상관이 없다 양식이 자유롭다.
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
