package sec01.exam01;

import java.util.Scanner;

public class TimeTableExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("구구단을 시작할 숫자를 입력해주세요.");
		int xn = input.nextInt();;
		System.out.println("구구단을 몇번 곱할지 입력해주세요.");
		int sn = input.nextInt();;
		
		for (int a1 = xn; a1 <= xn; a1++) {
			for (int b1 = 1; b1 <= sn; b1++ ) {
				System.out.println(a1 + " X " + b1 + " = " + (a1*b1));
			}
		}
	}

}
