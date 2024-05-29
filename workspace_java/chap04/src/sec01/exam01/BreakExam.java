package sec01.exam01;

public class BreakExam {

	public static void main(String[] args) {
		
		
		System.out.println("게임을 시작합니다.");
		
		int count = 0;
		while (true) {
			int dice = (int)(Math.random()*6) +1;
			System.out.println(dice);
			count++;
			if (dice == 6) {
				break; //반복문을 종료 할때 사용한다 조건에 상관이 없다.
			}
		}
		System.out.println("총 " + count + "번 실행 되었습니다.");
		System.out.println("게임이 종료 되었습니다.");
		
		for (int i =1; i <=10; i++) {
			System.out.println(i);
			
			if (i == 7) { // == 과 !=는 범위가 좁기때문에 오류가 발생하면 못멈출수도 있다. 그래서 >= 이나 <=를 쓰는게 좋다.
				break;
			}
			System.out.println("한 턴 종료");
		}
		System.out.println("for문 종료");
		
		
		for (int i=0; i<5; i++) {
			System.out.println("I : " + i);
			for (int j =0; j<3; j++ ) {
				System.out.println("J : " + j);
				
				if (j >= 1) {
					break; // j에 대한 for문만 종료 된다. 즉 break를 품고 있는 반복문만 종료 된다.
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i <10; i++) {
			if(i % 2 != 0) {
				continue; // continue 실행후 다음 실행문은 무시하게 된다.
			}
			System.out.println("짝수 : " + i);
		}
		
	}

}
