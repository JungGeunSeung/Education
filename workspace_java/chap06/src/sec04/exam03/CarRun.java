package sec04.exam03;

public class CarRun {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.gas = 5;
		boolean gasState = car.isLeftGas();
		
		if (gasState) {
			System.out.println("출발합니다.");
			car.run();
		}
		
		if (car.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
		
		System.out.println(car.name);
		
		car.setName("차이름");
		System.out.println(car.name);
		car.setName("");
		System.out.println(car.name);
		
	}

}
