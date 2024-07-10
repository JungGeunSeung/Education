package sec01.exam04_super;

public class Food {

	String name;
	int price;
	String recipe;
	String type;
	int sum;
	
	Food() {
		System.out.println("Food 실행");
	}
	
	void eat() {
		System.out.println(this.name + "을 먹습니다.");
	}
	
	void order() {
		System.out.println(this.name + "을 주문합니다.");
		System.out.println("금액은 " + this.price + "원 입니다.");
		sum += this.price;
	}
	
	void cook () {
		System.out.println(this.recipe + "를 이용해서 " + this.name + "을 요리합니다.");
	}
	
	void receipt () {
		System.out.println("총 결제하실 금액은 " + this.sum + "원 입니다.");
	}
	
	void all() {
		order();
		cook ();
		eat();
		receipt ();
	}
}
