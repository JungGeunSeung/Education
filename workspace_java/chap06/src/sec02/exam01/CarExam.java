package sec02.exam01;

public class CarExam {

	public static void main(String[] args) {

		Car mycar = new Car();
		Car mycar2 = new Car();
		
		System.out.println(mycar.model);
				
		mycar.model = "흑팔라";
		System.out.println(mycar.model);
		
		System.out.println(mycar2.model);
		
		// class Car에 변수 speed에는 값을 넣지 않았기 때문에 0 이 나온다
		System.out.println(mycar.speed);
		
		
		mycar.speed = 60;
		System.out.println(mycar.speed);
		
		
	}

}
