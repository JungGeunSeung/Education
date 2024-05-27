package sec01.exam01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {

		int score = 97;
		
		// if는 true만 출력한다.
		if (score >=90) {
			System.out.println("90점 이상입니다");
			
			if (score >= 95) {
				System.out.println("95점 이상입니다");
				
			}
		}
		if (score < 90) {
		}
		
		boolean up90 = score >= 90;
		if (up90) {
			System.out.println("up90");					
		}
		if (!up90) {
			System.out.println("!up90");					
		}
		if (up90) {
			System.out.println("참");
		// else는 위의 조건이 하나도 만족하지 않는 경우 무조건 실행
		} else {
			System.out.println("거짓");
		}
		
		if (score >= 90) {
			System.out.println("90점 이상입니다");
			System.out.println("학점은 A입니다");
		}
		if (score < 90 && score >=80) {
			System.out.println("90점미만 80점 이상입니다");
			System.out.println("학점은 B입니다");
		}
		
		// if, else if, else 이런식으로 묶여 있으면 그중 하나만 실행된다.
		if (score >= 90) {
			System.out.println("학점은 A입니다");
		} else if (score >=80) {
			System.out.println("학점은 B입니다");
		}
		
		//3은 짝수인가?
		
		int num = 3;
//		Scanner input = new Scanner (System.in);
//		num = input.nextInt();
		if (num % 2 == 1) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
			
		double rand = Math.random();
		System.out.println("rand : "+ rand);
		
		// 주사위 만들기
		int dice = (int)(Math.random()*6)+1;
		
		System.out.println(dice);
		
		//switch는 if중 하나의 플랫폼이라고 생각하면 되고, 주로 == 이나 .Equals 을 사용 할때 이용한다.
		switch (dice) {
		case 1:
			System.out.println(dice + "이 나왔습니다.");
			break; //break;를 쓰지 않으면 다음 case의 값도 나오기 때문에 꼭 써줘야 한다.
		case 2:
			System.out.println(dice + "이 나왔습니다.");
			break;
		case 3:
			System.out.println(dice + "이 나왔습니다.");
			break;
		case 4:
			System.out.println(dice + "이 나왔습니다.");
			break;
		case 5:
			System.out.println(dice + "이 나왔습니다.");
			break;
		default: //if의 else라고 생각하면 된다.
			System.out.println(dice + "이 나왔습니다.");
			break;
		}
		int month = 5;
		
		if (month >= 3 && month <= 5) {
			System.out.println("봄");
		} else if (month >= 6 && month <= 8) {
			System.out.println("여름");
		} else if (month >= 9 && month <= 11) {
			System.out.println("가을");
		} else {
			System.out.println("겨울");
		}
		
		// break가 없을때 다음 case도 실행되는 원리를 이용하여 이런식으로도 만들 수 있다.
		// or, and 를 사용한 것보단 직관적이고 개발자들 사이에서는 강조의 의미를 가지고 있다.
		System.out.println("----------------------------------------");
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}
		// switch는 char, byte, short, int ( 즉 int 이하)와 String만 허용된다.
		// boolean, long, float, double은 사용이 되지 않는다.
	}

}

















