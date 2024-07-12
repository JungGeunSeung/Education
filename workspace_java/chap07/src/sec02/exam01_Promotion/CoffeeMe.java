package sec02.exam01_Promotion;

public class CoffeeMe {

	void coffee(Coffee a) {
		if(a.isDT()) {
			System.out.println("드라이브 쓰루를 이용한다");
			a.order("커피");
		} else {
			System.out.println("그냥 테이크 아웃");
			a.order("커피");
		}
	}
	
	
	
	
}
