package sec01.exam04_super;

public class 제육 extends Food {

	
	
	제육 () {
		System.out.println("제육 생성자 실행");
		this.name = "제육";
		this.price = 8000;
		this.recipe = "돼지고기";
		this.type = "한식";
	}
	
	void spicy(String x) {
		this.name += " ("+x+")";
	}
	
	
	
	
	
	
	
	
	
}
