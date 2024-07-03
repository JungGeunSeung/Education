package sec04.exam01;

public class Calc {
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	static void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		System.out.println("더하기"+x);
		System.out.println("더하기"+y);
		
		return x + y;
	}
	// 아래 파란 주석은 메소드를 만들고 설명을 덧붙힐때 사용한다. 아래에 있는 메소드에 적용된다
	/**
	 * 두 정수를 받아서
	 * 나누기한 결과를
	 * 실수 로 돌려준다
	 * 전달인자 : int, int
	 * 리턴타입 : double
	 * */
	
	double divide (int x, int y) {
		System.out.println("나누기" + x);
		System.out.println("나누기" + y);
		if (y == 0) {
			System.out.println("두번째 전달인자가 잘못 되었습니다. 다시입력해주세요");
			return 0;
		} else {
		return (double)x / y;
		}
	}
	
	// 배열을 받아 모두 더하기
	int plus2 (int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	// 전달 인자의 개수를 모를때, ... 가변 인자로 받아서 모두 더하기
	// 가변인자로 전달받은 값들은 배열로 처리 된다
	int plus3 (int ... values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
