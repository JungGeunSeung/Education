package sec03.exam02_abstract;

public abstract class Animal {

	String kind;
	
	void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	
	abstract void sound();
	
}
