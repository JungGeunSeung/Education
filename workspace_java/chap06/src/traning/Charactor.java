package traning;
public class Charactor {

	int hp;
	int dep;
	int tolerance = 9;
	
	
	Charactor(int x) {
		hp = x;
		dep = (int)Math.random() * 5 + 1 ;
	}
	
	void beattack () {
		System.out.println("공격 당했습니다");
		int a = (int)(Math.random() * 9) + 1;
		System.out.println(a + "의 피해를 입혔습니다.");
		hp -= a - dep;
		System.out.println("남은 HP : " +hp);
	}
	
	void heal () {
		System.out.println("상처를 치유했습니다.");
		if (tolerance <= 0) {
			tolerance = 1;
		}
		int a = (int)(Math.random() * tolerance--) + 1;
		System.out.println("hp를" + a + "만큼 회복했습니다.");
		hp += a;
		System.out.println("남은 HP : " +hp);
	}
	
	int ehp() {
		return hp;
	}
}
