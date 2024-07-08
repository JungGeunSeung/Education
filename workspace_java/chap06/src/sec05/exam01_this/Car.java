package sec05.exam01_this;

public class Car {

	String model;
	int speed;
	
//	Car (String m) {
//		model = m;
//	}
	Car (String model) {
		this.model = model;
		// this : 현재 클래스내에 존재하는 필드를 불러온다. (나(class)에게 해당하는 필드를 불러올때 this를 사용한다)
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// 메소드(static) 영역 : main이 실행 될때, 객체를 생성한(new class) 클래스가 들어가게 되고, 설정한 값이나 결과는
	// 힙영역에 저장 하게 된다.
	// 메소드만 올라가는게 아니라 class와 필드도 다 올라간다.
	
	
	
	
	
	
}
