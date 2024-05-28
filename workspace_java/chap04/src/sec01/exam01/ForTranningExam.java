package sec01.exam01;

import java.util.Scanner;

public class ForTranningExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// 3번 입력받아 음수양수를 판독해주는
//		for (int i = 1; i <=3; i++) {
//			System.out.println("숫자를 입력 해주세요.");
//			int a = input.nextInt();
//			if (a >= 0) {
//				System.out.println("양수");
//				} else {
//			System.out.println("음수"); }
//		
//		}
		
		// 입력받은 숫자가 0이 아닌 동안은 계속 반복
//		for (int a=1; a != 0 ;) {
//			System.out.println("숫자를 입력 해주세요. (종료 : 0)");
//			a = input.nextInt();
//			if (a >= 0) {
//					System.out.println("양수");
//				} else {
//					System.out.println("음수"); }
//		}
//		System.out.println("종료 되었습니다");
		System.out.println("0단계");
		for (int a = 1; a<=5; a++) {
			System.out.println("+");
		}
		
		System.out.println("----------------------------------");
		
		System.out.println("1단계");
		for (int a = 1; a<=5; a++) {
			System.out.print("+");
		}
		System.out.println();
		System.out.println("----------------------------------");
		
		System.out.println("2단계");
		for (int a = 1; a<=15; a++) {
			System.out.print("+");
			if (a % 5 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("----------------------------------");
		
		System.out.println("2-1단계");
		for (int a = 1; a<=5; a++) {
			System.out.print("+");
			System.out.print(" ");
		}
		
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.println("3단계");
		for (int a = 1; a<=5; a++) {
			System.out.println("");
			for (int b = 0; b != a; b++) {
				System.out.print("+");
			}
			
		}
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.println("4단계");
		int n = 5;
		for (int a = 1; a<=n; a++) {
			System.out.println("");
			for (int b = 0; b != a; b++) {
				System.out.print("+");
			}
			for (int b = 0; b < n-a ; b++) {
				System.out.print(".");
			}
		}
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.println("5단계");
		int n2 = 5;
		for (int a = 1; a<=n2; a++) {
			System.out.println();
			for (int b = 0; b < n2-a ; b++) {
				System.out.print(".");
			}
			for (int b = 0; b != a; b++) {
				System.out.print("+");
			}
		}
		
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.println("6단계");
		for (int a = 1; a <=5; a++) {
			System.out.println();
			for (int b=0; b < (5-a); b++) {
				System.out.print(".");
			}
			for (int c=1; c <= (2*a-1); c++) {
				System.out.print("+");
			}
		}
		
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.println("7단계");
		for (int a = 1; a <=5; a++) {
			System.out.println();
			for (int b=0; b < (5-a); b++) {
				System.out.print(".");
			}
			for (int c=1; c <= (2*a-1); c++) {
				System.out.print("+");
			}
			for (int b=0; b < (5-a); b++) {
				System.out.print(".");
			}
		}
//		여기서부터는 집에서 함
	}
}
