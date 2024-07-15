package sec03.exam02_abstract;

public class Abstract {

	public static void main(String[] args) {

		// 사전적 의미로는 공통되는 특성을 추출 한 것
		// 추상 클래스의 용도 : 공통된 필드와 메소드의 이름을 통일할 목적
		// 					    실체 클래스를 작성할때 시간 절약
		// 선언법 : public abstract class 클래스이름 {}
		// 추상 메소드를 선언 abstract 메소드이름 () {}
		// 추상 메소드를 선언하면 상속받는 클래스는 무조건 override 해줘야 한다.
		
		
		
		Dog dog = new Dog();
		dog.sound();
		dog.breathe();
		
		Animal a = dog;
		System.out.print("dog타입을 Animal타입으로 형변환 : ");
		a.sound();
		
		
	}

}
