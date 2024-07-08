package sec05.exam05_final;

public class Person {

	// final이 붙은 변수는 변경 할 수 없다.
	final String nation = "Korea";
	// final로 선언하는 동시에 초기화하지 않은경우 생성자에서 딱 한번 값을 초기화 할수 있다.
	final String ssn;
	String name;
	
	Person (String ssn, String name){
		this.ssn = ssn;
		this.name = name;
	}
	
	// 상수 : 불변의 값 (static final)
	// 상수이름은 모두 대문자로 작성한다.
	
	
	
	
	
}
