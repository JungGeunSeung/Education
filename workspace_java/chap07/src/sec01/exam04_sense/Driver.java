package sec01.exam04_sense;

public class Driver {

//	void run(Martin a) {
//		System.out.println("전달인자 : 마틴");
//		a.drive();
//	}
//	
//	void run(Gwagen a) {
//		System.out.println("전달인자 : 지바겐");
//		a.drive();		
//	}
	
	void run(Car a) {
		System.out.println("전달인자 : Car");
		a.drive();
	}
	
	public static void main (String[] args) {
		
		Driver dri = new Driver();
		Gwagen gwa = new Gwagen();
		Martin mar = new Martin();
		
//		dri.run(gwa); // 위 오버로딩한 run으로 실행한것
//		dri.run(mar); // 위 오버로딩한 run으로 실행한것
		
		dri.run(gwa); // 자동 형변환
		dri.run(mar); // 자동 형변환
		Car c1 = gwa; // 형변환을 선언
		Car c2 = mar; // 형변환을 선언
		dri.run(c1);
		dri.run(c2);
	}
	
	// 부모 쓰루 t/f, 커피 주문 2개의 메소드
	// 상속 오버라이드 t/f, 해당매점 커피
	// 내가 커피를 시켰을때, 드라이브쓰루가 있으면 true로 출력과 주문
	
}
