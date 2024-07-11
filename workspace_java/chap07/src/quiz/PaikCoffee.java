package quiz;

public class PaikCoffee extends Cafe {

	String name = "";
	
	@Override
	void order (String na) {
		this.name = na;
		if (name.equals("할메가")) {
			System.out.println("빽다방에는 "+ name+"이 없습니다.");
		} else {
			System.out.println(name + "를 주문합니다.");
			
		}
	}
	
}
