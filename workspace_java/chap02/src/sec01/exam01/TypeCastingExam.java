package sec01.exam01;

import java.util.Scanner;

public class TypeCastingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		long b = (long) a;  // int인 a를 long 타입으로 바꾸어라
							// long이 long 타입에 들어가는건 문제가 안된다
		long c = a;  // 작은거에서 큰걸로 바뀔때는 손실이 없으므로
					 // 형변환을 생략할 수 있다
					 // 자동 형변환
					 // 묵시적, 암시적 형변환이라고 불린다
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		System.out.println("c :" + c);
		
		a= (int)c;  // 큰타입에서 작은타입으로 바뀔때는 손실이 있을 수 있다
					// 형변환을 생략할 수 없다 명시적, 강제 형변환 이라고 한다
		System.out.println("a :" + a);
		
		long d = 3000000000L;
		int a2 = (int)d;
		System.out.println("a2 :" + a2);
		
		double d2 = 3.14;
		int i = (int)d2;
		System.out.println("i :" + i);
		// 소수점을 버리고 정수만 출력하는 경우가 많이 있다
		
//		int result = 43;
		double result = 43;		
		int count = 10;
		System.out.println(result / count);
		System.out.println("(double)count :"+ (double)count );
		System.out.println(result / (double)count);
		
		int i2 = 2100000000;
		int i3 = i2 * 2;  // int끼리 연산해서 java가 문제 없다고 생각한다 
		System.out.println("i3 :" + i3); //결과가 -94967296. 넘쳐서 비트값이 달라져 그렇다.
		
		System.out.println( 3 + "문자");
		System.out.println( 3 + 4 + "문자");
		System.out.println( "" + 3 + 4 + "문자");
		System.out.println( "" + (3 + 4) + "문자");
		
		
		System.out.println("-----------------------------");
		
		System.out.print("첫번째줄"); //html의 inline 처럼 옆에 출력 된다
		System.out.print("두번째줄");
		System.out.println();
		System.out.println("-----------------------------");
		System.out.printf("i3의 값은 : %d", i3);
		System.out.println();
		System.out.printf("i2의 값은 : %d, i3의 값은 : %d", i2, i3); //옆 양식으로 ,로 구분하여 %d의
																 // 들어갈 값을 차례대로 적는다
		
		System.out.println();
		System.out.println("-----------------------------");
		
		System.out.println("아무거나 입력하세요");
		Scanner scan = new Scanner(System.in); //입력 받으려고 준비중
		String input = scan.nextLine();
		System.out.println("input의 값은 " + input);
	}

}
