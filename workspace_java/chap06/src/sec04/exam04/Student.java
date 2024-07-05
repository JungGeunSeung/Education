package sec04.exam04;

public class Student {

	String name;
	int age;
	String addr;
	int gender;
	String major;
	boolean hasGlasses;

	int intel = 0; // 지식
	int stress = 0; // 스트레스 수치
	int hp = 100; // 체력
	int hungry = 0; // 배고픔

	Student (String x, int y) {
		name = x;
		age = y;
	}
	
	Student (String x) {
		this(x, 0);
	}
	
	// 공부하는 메소드
	int study(String subject) {
		System.out.println(subject + "을(를) 공부했다.");

		intel += 5;
		stress += 10;
		hp--;
		hungry++;

		return intel;
	}
	
	int study(int hour) {
		System.out.println(hour + "시간 공부했다.");
		
		intel += 5;
		stress += (hour / 2);
		hp--;
		hungry++;
		
		return intel;
	}

	// 식사하는 메소드
	int eating(String food) {
		System.out.println(food + "을(를) 먹었다.");

		hp++;
		hungry--;
		stress -= 5;

		return hungry;
	}

	// 수면 메소드
	int sleep(int hour) {
		System.out.println(hour + "시간동안 수면했다.");

		hp += 50;
		hungry += 5;
		stress -= 10;
		if (hp > 100) {
			hp = 100;
		}
		if (stress < 0) {
			stress = 0;
		}
		return hp;
	}

	// 게임 메소드
	int game(String aaa) {
		System.out.println(aaa + "을 했다.");
		study(aaa);
		intel -= 2;
		stress -= 3;
		return stress;
	}

	// 게임 메소드 오버로딩
	int game(String aaa, int hour) {
		if (hour <= 0) {
			System.out.println("잘못 입력되었습니다.");
		} else {
			study(hour);
			for (double i = 0; i <= hour; i += 0.5) {
				int h = (int) i;
				int m = 0;
				if (i - h == 0.5) {
					m = 30;
				}
					if (h == 0 && m != 0) {
						System.out.println("게임한지" + m + "분이 지났다.");
					} else if (m == 0 && h !=0) {
						System.out.println("게임한지" + h + "시간이 지났다.");
					} else if (m != 0 && h !=0) {
						System.out.println("게임한지" + h + "시간 " + m + "분이 지났다.");
					}
					if (i == hour) {
						System.out.println("여기까지 하자");
					} else {
						System.out.println("한번만 더하자");
					}
			}
			if (hour <= 2) {
				System.out.println(hour + "시간 동안 게임을 했다");
				System.out.println("오늘은 좀 안됐다 그만하자. 스트레스 + 5");
				stress += 5;
			} else if (hour > 2 && hour <= 4) {
				System.out.println(hour + "시간 동안 게임을 했다");
				System.out.println("적당하게 즐긴거 같다. 스트레스 -10");
				stress -= 10;
			} else if (hour > 4) {
				System.out.println(hour + "시간 동안 게임을 했다");
				System.out.println("오늘 신나게 했다. 스트레스 -20");
				stress -= 20;
			}
		}

		return stress;
	}

	// 마우스 우클릭 -> source -> Generate toString()
	// 필드에 존재하는 변수들을 한번에 return해주는 기능이다.
	// 나중에 객체를 생성하고 객체의 변수를 출력하면 밑에 있는 return값으로 나오게 된다
	@Override
	public String toString() {
		return "학생정보 [이름 : " + name + "] [나이 : " + age + "]";
	}

}
