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
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("구구단 한단씩 옆으로 출력하기");
		
		//구구단 옆으로 출력하기
		for (int a =2; a <=9; a++) {
			System.out.println(" ---- " + a + "단" + " ---- ");
			for(int b =1; b <=9; b++) {
				System.out.print(a + "*" + b + "=" + (a*b) + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("구구단 옆으로 3단씩 출력하기");
		System.out.println();
		
		//구구단 옆으로 3단씩 출력하기
		int a=1;
		int b=2;
		int c=1;
		int d=3;
		for (int dan =1; dan <=3; dan++) {
			for (a=1; a<=9; a++) {
				for (b=c; b<=d; b++) {
					System.out.print(b + "x" + a + "=" + (a*b) + " ");
				}
				System.out.println();
			}
		System.out.println();
		c += 3;
		d += 3;
		}
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("주사위 2개를 굴려서 나올 수 있는 모든 조합을 출력");
		System.out.println();
		
		int cnt = 1;
		for ( int dan = 1; dan <= 6; dan++ ) {
			for (cnt = 1; cnt <=6; cnt++) {
				System.out.println("주사위A의 " + dan + "과 " + "주사위B의 " + cnt + " = " + (cnt+dan));
			}
		}
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("주사위 2개의 합이 별로 나올 수 있는 조합");
		System.out.println();
		int aa=1;
		int bb=1;
		int cc=1;
		int dd=1;
		int ff=2;
		for (dd =1; dd<=6; dd++) {
			System.out.print("합이 "+(dd+1)+" 일 때 : ");
			for (aa = 1; aa<=dd; aa++) {
				//여기에 for문 하나 더 들어가야댐.
				for (bb=1; bb<=1;bb++) {
					bb*=dd;
					System.out.print("+" + bb);
				}
		System.out.println();
			}
		}
		
		
	}
}
