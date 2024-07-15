package sec03.exam02_abstract;

public class Dog extends Animal {

	Dog() {
		this.kind = "포유류";
	}
	
	@Override
	void sound() {
		System.out.println("개 짓는소리좀 안나게해라~~!!~!~!");
	}
	
}
