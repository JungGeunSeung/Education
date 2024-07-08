package sec06.exam02.pack2;

public class Receipt_3 {
	
	// 생성자를 쓰지 않을 경우Receipt_3 () {} 가 생성 되는데 이건,
	// public Receipt_3 () {} 라는 말로 public이 생략 된것이다.
	
	// Receipt_3 () {}
	// default 접근 제한자 : 생성자 앞에 default 가 생략되는데, 이렇게 되면
	// Receipt_2 에서 불러 올 수 없다.
	
	public Receipt_3 () {}
	// public 접근 제한자 : 어느 패키지던 클래스던 접근이 가능하다.
	
	// private 접근제한자 : 현재 클래스 외에는 사용이 불가능하게 막아준다.
	private void donation() {
		
	}
	
	
}
