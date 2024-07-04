package traning;

public class CharactorExe {

	public static void main(String[] args) {

		Charactor one = new Charactor(100);
		
		while(true) {
			int rand = (int)(Math.random() * 20) + 1;
			if(rand >= 10) {
				one.beattack();
				System.out.println("---------------");
			} else {
				one.heal();
				System.out.println("---------------");
			}
			int hp = one.ehp();
			if (hp <= 0) {
				System.out.println("사망하였습니다.");
				break;
			}
		}
		
	}

}
