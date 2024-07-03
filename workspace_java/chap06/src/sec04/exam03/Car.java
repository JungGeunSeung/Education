package sec04.exam03;

public class Car {
	
	String name;
	
	int gas;
	// 필드에서 선언한 변수는  
	// 클래스 생성(외부에서 new로 선언하는 순간)과 함께 생성되고
	// 클래스 소멸(hip영역으로 참조하고 있는 변수가 없음)시 까지 생존
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		} else {
			System.out.println("gas가 있습니다");
			return true;
		}
	}
	// return을 마지막에 쓰는게 아니면, 나중에 500~600줄이 넘어가는 코딩에서 뭐때문에 리턴하는지 모르게
	// 되기 때문에 변수에 값을 받아서 마지막에 return에다가 주는게 좋다.
	
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다 (gas잔량 : "+ gas +")");
				gas--;
			} else {
				System.out.println("멈춥니다 (gas잔량 : "+ gas +")");
				return; // break 대신 사용했다. void타입은 return 값을 주면 안되기 때문에 값은 주지 않았다
				// return은 break 보다 강력하게 장동하기 때문에, 메소드가 종료 된다.
			}
		}
	}
	
	void setName (String nick) {
		System.out.println(nick.length());
		if (nick.length() != 0) {
			name = nick;
		} else {
			System.out.println("이름은 필수 입니다.");
		}
	}
}
