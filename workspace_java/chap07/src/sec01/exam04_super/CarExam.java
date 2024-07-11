package sec01.exam04_super;

public class CarExam {

	public static void main(String[] args) {

		Bus bus = new Bus();
		SuperCar s = new SuperCar();
		
		bus.drive();
		bus.pause();
		bus.open();
		bus.close();
		bus.drive();
		bus.stop();
		
		System.out.println("---------------------------");
		s.drive();
		s.mode("스포츠");
		s.speed(100);
		s.stop();
		
		
	}

}
