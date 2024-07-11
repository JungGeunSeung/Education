package quiz;

public class Cafe {
	
	String name;
	
	
	void order (String name) {
		this.name = name;
		System.out.println(name + "를 주문합니다.");
	}
	
	void pay (int money) {
		System.out.println(money + "를 지불합니다.");
	}
}
