package sec01.exam01;

public class Child extends Parent {

	String name = "child의 name";
	// 기본 생성자
	Child () {
		// 부모 생성자를 호출하는 super()
		// 맨 첫출에 있어야 한다.
		// this와 같이 사용 불가
		super();
	}
	
	// 부모의 생성자 전달인자 타입이 자식 전달인자 타입과 같아야 된다.
	// 부모의 기본생성자 외 전달인자가 필요한 부모의 생성자일 경우 super에도 같은 타입에 전달인자를 전달해줘야 한다.
//	Child (String x) {
//		super(x);
//		System.out.println("Child 생성자 실행");
//		name = "child의 name";
//	}
	
	
	
	
	String getName(int s) {
		System.out.println("child의 getName 실행");
		return this.name;
	}
	
	void printName() {
		System.out.println("this.name : " + this.name);
		System.out.println("super.name : " + super.name);
	}
	
}
