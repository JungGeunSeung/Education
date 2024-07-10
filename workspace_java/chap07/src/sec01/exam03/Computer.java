package sec01.exam03;

public class Computer extends Calc {

	// 오버라이드
	// 리턴타입, 메소드명, 전달타입 을 같게 해야한다.
	// 메소드의 재정의
	
	
	
	@Override
	double areaCircle(double r) {
		System.out.println("컴퓨터 계산 실행");
		return Math.PI * r * r;
	}
}
