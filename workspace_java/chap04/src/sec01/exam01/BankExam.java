package sec01.exam01;

import java.util.Scanner;

public class BankExam {

	public static void main(String[] args) {

		// 은행 계좌의 잔고 관리 시스템
		// 1.입금 2.출금 3.조회 4.종료
		// 입금은 잔액에 더하기
		//			*0또는 음수는 실행되지 않게 ( 메세지 출력도 )
		// 출금은 잔액에서 빼기
		//			* 잔액보다 큰 금액은 실행 되지 않게 ( 메세지 출력도 )
		// 조회는 잔고 출력
		// 종료는 종료
		// 종료할때까지 입.출.조 할수 있게
		Scanner scan=new Scanner(System.in);
		int num=0;
		int deposit = 0;
		int withdraw = 0;
		int check = 0;
		System.out.println("안녕하세요. JAVA 은행입니다.");
		while (true) {
			System.out.println("------------------------------------------");
			System.out.println("| 1.입금 | 2.출금 | 3.조회 | 4.종료 |");
			System.out.println("번호를 입력해주세요.");
			System.out.println("------------------------------------------");
			num=scan.nextInt();
			if (num == 1) {
				System.out.println("입금하실 금액을 입력해주세요.");
				deposit =scan.nextInt();
				if (deposit >0) {
					System.out.println(deposit + "원을 입금 합니다.");
					check = check + deposit;
					System.out.println("현재 총 금액은 " + check + "원 입니다.");
				} else {
					System.out.println("금액을 다시 확인해주세요.");
				}
			}
			if (num == 2) {
				System.out.println("출금하실 금액을 입력해주세요.");
				withdraw =scan.nextInt();
				if (withdraw >0 && withdraw<check) {
					check = check - withdraw;
					System.out.println(withdraw + "원을 출금 합니다.");
					System.out.println("남은 잔액은 " + (check) + "원 입니다.");
				} else {
					System.out.println("금액을 다시 확인해주세요.");
				}
			}
			if (num == 3) {
				System.out.println("현재 잔액을 조회합니다.");
				System.out.println("현재 잔액 " + check + "원");
			} else if (num == 4) {
				break;
			}
		}
		System.out.println("은행 시스템을 종료합니다.");
	}
	

}
