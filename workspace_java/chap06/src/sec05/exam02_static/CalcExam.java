package sec05.exam02_static;

public class CalcExam {

	// 자바 즉 java.exe 가 특정 클래스를 실행할때 클래스이름.main(스트링배열) 을 실행한다.
	
	public static void main(String[] args) {
		
		System.out.println(Calc.pi); //static : 자바가 실행될때 생성
		Calc calc1 = new Calc();
		Calc calc2 = new Calc();
		
		calc1.color = "빨강";
		calc2.color = "파랑";
		
		System.out.println(calc1.pi);
		System.out.println(Calc.pi); // new 선언을 안해도 쓸 수있다. (static)
		
		
		calc1.pi = 3;
		System.out.println(calc1.pi);
		System.out.println(calc2.pi); // calc1의 값을 바꾸면 calc2에 값도 바뀐다. 즉 객체를 생성하지 않고 미리 만들어졌기
									  // 때문에, 객체를 생성해도 static은 생성 되지 않는다.
		
		// static 은 선발대.
		// 정적맴버외 인스턴스맴버는 new 후에 오는 후발대
		// 따라서 static은 static 밖에 못쓴다. 인스턴스 맴버 사용불가
		// 후발대인 인스턴스 맴버는 static 사용가능
		
		// 지역변수 : 해당 블럭{} 안에서만 사용가능
		// 필드변수 : 객체 생성되면 사용가능
		// static 변수 == 클래스 변수 == 공용변수 : 자바 실행시 사용가능

		// 싱글톤(singleton)
		// 단 하나만의 객체만 만들도록 보장해야 할때 사용
		// new 연산자로 호출할수 없게 만들어야 한다.
		// 필드 - private static 클래스 변수명1 = new 클래스();
		// 생성자 - private 클래스() {};
		// 정적 메소드 - static 클래스 변수명2() {return 변수명1}
	
		// 단축키 : ctrl + shift + O(영어) : import 자동 작성 단축키
	
	
	
	
	}

}
