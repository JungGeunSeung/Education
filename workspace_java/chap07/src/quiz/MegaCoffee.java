package quiz;

public class MegaCoffee extends Cafe {

	String name = "";
	
	@Override
	void order (String nas) {
		this.name = nas;
		if (name.equals("사라다빵")) {
			System.out.println("빽다방에는 "+ name+"이 없습니다.");
		} else {
			System.out.println(name + "를 주문합니다.");
			
		}
	}
	
	
}
