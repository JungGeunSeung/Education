package sec01.exam04_super;

public class SuperCar extends Car {
	
	void drive() {
		System.out.println("슈퍼카 운전을 시작합니다.");
	}
	
	void mode (String moding) {
		System.out.println("엔진모드를 변경합니다 : " + moding);
	}
	
	void speed(int s) {
		System.out.println("속도를 변경합니다." + s);
	}
}
