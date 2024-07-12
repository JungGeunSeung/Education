package sec02.exam01_Promotion;

public class MeExam {
	public static void main(String[] args) {
		
		Tosome some = new Tosome();
		
		Coffee cof = new Coffee();
		
		Coffee some1 = some;
		
		CoffeeMe me = new CoffeeMe();
		
		System.out.println("일반 커피 전문점을 출력하는 cof");
		me.coffee(cof);
		System.out.println("--------------------------------");
		System.out.println("Tosome(자식)을 Coffee(부모)로 형변환한 some1");
		me.coffee(some1);
		
	}
	
	
}
