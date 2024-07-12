package sec02.exam01_Promotion;

public class Dog extends Animal {

	@Override
	void sound() {
		System.out.println("멍 소리냄");
	}
	
	void walk() {
		System.out.println("산책함");
	}
}
