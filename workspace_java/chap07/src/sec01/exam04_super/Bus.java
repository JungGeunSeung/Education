package sec01.exam04_super;

public class Bus extends Car {

	void drive () {
		System.out.println("버스 운전을 시작합니다.");
	}
	
	void pause () {
		System.out.println("버스가 멈춰 섭니다.");
	}
	
	void open () {
		System.out.println("손님의 승차를 위해 문을 엽니다.");
	}
	
	void close () {
		System.out.println("문을 닫습니다.");
	}
	
}
