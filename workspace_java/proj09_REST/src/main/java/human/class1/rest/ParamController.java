package human.class1.rest;


// @Controller("beanID") : class를 bean으로 등록시켜 Controller에 붙힌다. 또는 ("beanID")로 지정이 가능하다.
// @Service : class를 bean으로 등록시켜 Service에 붙힌다.
// @Component : 
// @Repository : 
// @Configuration : 클래스에 적는 어노텐션으로 클래스 안 메소드에 @Bean 을 적어 Bean으로 등록시키는 어노텐션
//                  xml 에서 <bean> 태그로 등록이 가능하다.

// @ResponseBody : method에 적을수 있지만, class에 적으면 해당 class의 모든 method에 @ResponseBody를 적용시켜준다.
//				   @ResponseBody는 ViewResolver를 타지 않고 return 글씨가 나간다.

// @RequestMapping("/human/a") : class에 적으면 해당주소로 class까지 들어와(HandlerMapping) 
// 					 			 나머지 주소를 메소드에게 찾아간다(HandlerAdaptor).
public class ParamController {
	
//	@Autowired : 이타입의 변수에 넣을수 있는 동일한 클래스나
//				 자동형변환 되는 클래스를 찾아서 생성(IoC)하고 자동으로 넣어준다(DI).
//				 만약 후보 클래스가 2개 이상 있다면 @Primary가 붙은 클래스가 온다.
//				 없다면 @Qualifier("beanID")로 beanID 로 찾아간다.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
