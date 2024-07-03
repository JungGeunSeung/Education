package traning;

import java.util.Scanner;

public class UpDown {

	Scanner scan = new Scanner(System.in);
	
	double random = Math.random();
	
	int ran = (int)random * 9 + 1;
	
	
	void game() {
		int cnt = 1;
		while(true) {
			int input = scan.nextInt();
			if (input > ran) {
				System.out.println("DOWN!!" + "(시도횟수 :" + cnt + ")");
				cnt++;
			} else if (input < ran) {
				System.out.println("UP!!" + "(시도횟수 :" + cnt+ ")");
				cnt++;
			} else if (input == ran) {
				System.out.println("정답입니다!"+ "(시도횟수 :" + cnt+ ")");
				return;
			}
		}
	}
}
