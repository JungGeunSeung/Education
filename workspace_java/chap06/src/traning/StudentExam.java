package traning;

public class StudentExam {

	public static void main(String[] args) {

		Student one = new Student("", 25);
		// 필드는 초기화 없는 경우 0, null, false로 new하는 순간 자동으로 초기화 됨
		
		one.name = "정근승";
//		one.age = 25;
		one.addr = "전의";
		one.gender = 0;
		one.major = "없음";
		one.hasGlasses = true;
		
		System.out.println("이름 : "+one.name);
		System.out.println("나이 : "+one.age);
		System.out.println("주소 : "+one.addr);
		System.out.println("성별 : "+one.gender);
		System.out.println("전공 : "+one.major);
		System.out.println("안경 : "+one.hasGlasses);
		
		//지역변수는 초기화 없이 사용 불가능
		
		Student two = new Student("");
		System.out.println(two.name); // null // 인스턴스맴버이기 때문에
		two.name = "현준수";
		two.age = 26;
		System.out.println(two.name);
		System.out.println(two.age);
		
		
		System.out.println(one);
		int study = one.study("java");
		System.out.println("지식이 "+study+" 상승했다!");
		int hungry = one.eating("국밥");
		System.out.println("공복감이 "+hungry+"이 되었다.");
		int game = one.game("메이플");
		System.out.println("스트레스가 "+game+"가 되었다.");
		System.out.println(one);
		int health = one.sleep(7);
		System.out.println("체력이 "+health + "이 되었다.");
		
		System.out.println("-----------------------------------------------------------------");
		
		
//		int game2 = one.game("배틀그라운드", -1);
//		System.out.println("스트레스가 "+game2+"가 되었다.");
//		int game3 = one.game("배틀그라운드", 2);
//		System.out.println("스트레스가 "+game3+"가 되었다.");
//		int game4 = one.game("배틀그라운드", 4);
//		System.out.println("스트레스가 "+game4+"가 되었다.");
		int game5 = one.game("배틀그라운드", 5);
		System.out.println("스트레스가 "+game5+"가 되었다.");
		System.out.println(one);
	}

}
