package sec04.exam01;

public class CalcExam {

	public static void main(String[] args) {
		
		powerOn();
		
		Calc calc = new Calc();
		calc.powerOff();
		
		
		System.out.println(calc); // class가 위치하고 있는 패키지 위치와 @뒤는 힙영역의 위치이다
	}

	static void powerOn() {
		System.out.println("전원을 켭니다.");
	} // void poweron 종료 괄호
	
	
	
	
	
	
	
	
	
} // class 종료 괄호
