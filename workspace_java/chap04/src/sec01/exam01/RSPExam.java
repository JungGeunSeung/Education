package sec01.exam01;

import java.util.Scanner;

public class RSPExam {

	public static void main(String[] args) {

		System.out.println("가위,바위,보 중 하나를 입력하시면 가위바위보를 할 수 있습니다");
		int rsp = (int) (Math.random()*3)+1;
		
		String gawi = "시스템은 가위를 냈습니다.";
		String bawi = "시스템은 바위를 냈습니다.";
		String bo = "시스템은 보를 냈습니다.";
		
		Scanner input = new Scanner(System.in);
		String user = input.nextLine();
		
		int result;
		if (user.equals("가위")) {
			result = 1;
		} else if (user.equals("바위")) {
			result = 2;
		} else {
			result = 3;
		}
//		System.out.println(result);
		
		if (rsp == 1) {
			if (result == 1 ) {
				System.out.println(gawi +"\n무승부입니다.");
			} else if (result == 2) {
				System.out.println(gawi +"\n사용자의 승리입니다.");
			} else if (result == 3) {
				System.out.println(gawi +"\n시스템의 승리입니다.");
			}
		}
		if (rsp == 2) {
			if (result == 1 ) {
				System.out.println(bawi +"\n시스템의 승리입니다.");
			} else if (result == 2) {
				System.out.println(bawi +"\n무승부입니다.");
			} else if (result == 3) {
				System.out.println(bawi +"\n사용자의 승리입니다.");
			}
		}
		if (rsp == 3) {
			if (result == 1 ) {
				System.out.println(bo +"\n사용자의 승리입니다.");
			} else if (result == 2) {
				System.out.println(bo +"\n시스템의 승리입니다.");
			} else if (result == 3) {
				System.out.println(bo +"\n무승부입니다.");
				}
		}
	}

}
