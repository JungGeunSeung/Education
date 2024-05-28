package sec01.exam01;

public class ForExam {

	public static void main(String[] args) {

		// 1식 증가하는걸 5번 할꺼임
		int sum = 0;
		sum += 1;
		sum += 1;
		sum += 1;
		sum += 1;
		sum += 1;
//		System.out.println("1씩 더했을때의 sum : " + sum);
		
		
		for (int n1 = 1; n1 <= 5; n1++) {
			sum = n1;
		}
//		System.out.println("1씩 더했을때의 for문 사용 sum : " + sum);
		
		//1~5까지의 합을 구할꺼임
		sum = 0;
		int i = 1;
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
//		System.out.println("1~5까지 더했을때 sum : " + sum);
		
		i++; // 증감식
		// sum + 1; 실행문
		sum = 0; //초기화식
		
		int i2 = 1;
		for (i2= 1; i2<= 5; i2++) {
			sum += i2;
		}
//		System.out.println("1~5까지 더했을때의 for문 사용 sum : " + sum);
		
		
		/*
		 * 반복문 만드는 원리
		 * 
		 * 반복 되는 것 찾기 ctrl + c,v 해도 바뀌지 않는 것
		 * 
		 * 반복 되지 않는 것 찾기
		 * 	조건1. 규칙성이 있는 패턴 찾기
		 *	조건2. 시작 조건을 찾기
		 *	조건3. 종료 조건을 찾기
		 *	조건4. 변수를 활용해서 반복되게 만들기
		 * 
		 * for : 반복 횟수를 아는 경우
		 * while : 반복 횟수를 모르는 경우
		 * 
		 * */
		
//		맨처음 한번만 초기화식 실행
//		조건이 참이면
//		실행블럭 실행
//		증감식 실행
//		다시 조건보고 실행
//		조건에 맞기까지 반복
//		 for (초기화식;조건식;증감식) {
//		 실행 블럭
//		}
		// 초기화 식 안에 선언된 변수는 for문이 끝나면 변수가 사라진다. 즉 다시 선언 할 수 있다.
		int sum2 = 0;
		for ( int e = 1 ; e <= 5 ; e++ ) {
			sum2 = sum2 + e;
//			System.out.println("실행블럭값 변화 sum2 : " + sum2 + ", e : " + e);
		}
		System.out.println("for문 사용 sum2 : " + sum2);
		
		int sum3 = 0;
		for ( int b = 1 ; b <= 50 ; b++ ) {
			sum3 = sum3 + 4;
//			System.out.println("실행블럭값 sum3 : " + sum3 + ", b : " + b);
		}
		System.out.println(sum3);
		
		System.out.println("--------------------------------------");
		
		//1~10까지 짝수만 출력
		// 증감식 이용하기
		// if문 이용하기 (%2n)
		
		// 1~10까지 한줄에 3개씩 출력되게 하기
		
		for (int a1 = 2; a1<=10; a1 += 2) {
			System.out.println("증감식 : " + a1);
		}
		
		System.out.println("--------------------------------------");
		for (int a1 = 1; a1<=10; a1++) {
			if (a1 % 2 == 0) {
				System.out.println("if문 : " + a1);
			}
			
		}
		
		System.out.println("--------------------------------------");
		System.out.println("for문을 이용한 한줄에 3개씩 출력 되게 하기");
		
		for (int a1 = 1; a1<=10; a1 ++) {
			for ( ; a1<=3 ; a1++ ) { // 1,2,3
				System.out.print(a1 + ",");
			}
			System.out.println();
			for ( ; a1<=6 ; a1++ ) { // 4,5,6
				System.out.print(a1 + ",");
			}
			System.out.println();
			for ( ; a1<=9 ; a1++ ) { // 7,8,9
				System.out.print(a1 + ",");
			}
			System.out.println();
			System.out.println(a1); // 10
		}
		
		System.out.println("--------------------------------------");
		
		// 1~100까지 3의 배수가 몇개 있는가?
		int a1;
		for (a1 = 1; a1 <=100; a1++) {
			if (a1 % 3 == 0) {
				System.out.print(a1 + " ");
			}
		}
		System.out.println();
		System.out.println("3의 배수의 총 갯수는 : " + (a1/3) + "개");
		
		System.out.println("--------------------------------------");
		int count = 0;
		for (int t = 1; t <=100; t++) {
			if ( t % 3 == 0 ) {
				count++;
			}
		}
		System.out.println("3의 배수의 총 갯수는 : " + count + "개");
		
		System.out.println("--------------------------------------");
		// 구구단 출력
//		int cnt = 1;
//		for (cnt = 1; cnt <=9; cnt++) {
//			System.out.println("2 * " + cnt + " = " + (cnt*2));
//		}
		// 구구단
		int cnt = 1;
		for ( int dan = 2; dan <= 9; dan++ ) {
			System.out.println("-----" + dan + "단" + "-----");
			for (cnt = 1; cnt <=9; cnt++) {
				System.out.println(dan + " * " + cnt + " = " + (cnt*dan));
			}
		}
		// 999구단
//		for (int dan2 = 1; dan2 <=9; dan2++) {
//			System.out.println("-----" + dan2 + "단" + "-----");
//			for ( int dan = 2; dan <= 9; dan++ ) {
//				for (cnt = 1; cnt <=9; cnt++) {
//					System.out.println(dan2 + " * " + dan + " * " + cnt + " = " + (cnt*dan*dan2));
//				}
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
