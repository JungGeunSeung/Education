package traning;

import java.util.Scanner;

public class TvExecute {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Tv tv = new Tv();
		
		
		while(true) {
			System.out.println("티비의 상태? 0.취소 1.킨다");
			int input = scan.nextInt();
			if (input == 0) { break; }
			tv.power(input);
			while (true) {
				System.out.println("티비 조작법");
				System.out.println("1 : 소리키우기 2 : 소리줄이기 11 : 채널올리기 22 : 채널내리기");
				System.out.println("3 : 현재 티비상태 보기 그 외 숫자 : 해당 채널로 이동  0 : 티비 끄기");
				int input2 = scan.nextInt();
				if(input2 == 11) {
					tv.moveUp();
				} else if (input2 == 22) {
					tv.moveDown();
				} else if (input2 == 1) {
					tv.up();
				} else if (input2 == 2) {
					tv.down();
				} else if (input2 == 3) {
					tv.info();
				} else {
					tv.channel(input2);
				}
				
				if (input2 == 0) {break;}
			}
		} // while 종료 괄호
		
		
		
		
		
		
	} // main 종료 괄호
} // class 종료 괄호
