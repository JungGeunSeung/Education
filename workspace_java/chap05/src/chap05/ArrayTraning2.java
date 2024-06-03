package chap05;

import java.util.Scanner;

public class ArrayTraning2 {

	public static void main(String[] args) {
		int[] qus1 = {1,5,2,4};
		
		System.out.println("---------------------------------------");
		System.out.println("[문제 1] 배열 뒤집어 출력하기");
		System.out.println();
		
		for (int i = (qus1.length-1); i >= 0; i--) {
			System.out.println(qus1[i]);
		}
			
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("[문제 2] 첫번째 자리에 0 넣기");
		System.out.println();
		int[] qus2 = new int[qus1.length+1];
		qus2[0] = 0;
		for (int i =1; i < qus2.length; i++) {
			qus2[i] = qus1[(i-1)];
		}
		for (int i =0; i < qus2.length; i++ ) {
			System.out.println(qus2[i]);
		}
		
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("[문제 3] 마지막 숫자를 첫번째에 넣기");
		System.out.println();
		
		int[] qus3 = new int[qus1.length];
		qus3[0] = qus1[3];
//		for (int i=0; i<qus3.length; i++) { 
//			System.out.println(qus3[i]);
//		}
		for (int i = 0; i < qus3.length-1; i++) {
			qus3[i+1] = qus1[i];
		}
		for (int i = 0; i < qus3.length; i++) {
			System.out.println(qus3[i]);
		}
		
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("[문제 4] 홀/짝수의 개수를 구하여라");
		System.out.println();
		
		int[] array = {3, 4, 7, 5, 1, 4, 6, 4, 5};
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i<array.length; i++) {
			if (array[i] % 2 == 0) {
				count1++;
			} else {
				count2++;
			}
		}
		System.out.println("짝수 : " + count1 + "개");
		System.out.println("홀수 : " + count2 + "개");
		
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("[문제 5] 주어진 수보다 큰 숫자의 개수");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i <array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println("이 숫자중, 원하시는 숫자를 고르시면, 고르신 수보다 높은 값이 있는 개수를 구합니다.");
		
//		int big = scan.nextInt();
		int big = 4;
		int count3 = 0;
		for (int i =0; i < array.length; i++) {
			if (array[i] > big) {
				count3++;
			}
		}
		System.out.println(big + " 보다 큰 수의 개수는 "+count3);
		
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("[문제 6] array의 배열의 값들중 2번째로 높은 값을 구하여라");
		System.out.println();
		
		int max = 0;
		int max2 = 0;
		
		for (int i =0; i<array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < max && array[i] > max2 ) {
				max2 = array[i];
			}
		}
		
		System.out.println("두번째 최대값은? : " + max2);
		
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("[문제 7] 내림차순으로 정렬해라.");
		System.out.println();
		int[] array2 = new int[array.length];
		int count4 = 0;
		for (int i =(array.length-1); i <= array.length && i >= 0; i--) {
			array2[count4] = array[i];
			if (count4 < array.length) {
				
				System.out.print(array2[count4]+", ");
			}
			count4++;
		}
		System.out.println();
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("[문제 8] 로또 6개의 번호를 출력 (조건: 중복되는 숫자는 제외)");
		System.out.println();
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length; i++) {
			int rand = 0;
			boolean dup;
			do {
				rand = (int)(Math.random() * 45) +1;
				dup = false;
				for (int j =0; j<lotto.length; j++) {
					if (rand == lotto[j]) {
						dup = true;
						break;
					}
				}
			} while(dup);
		lotto[i] = rand;
		}
		
		for(int i=0;i<lotto.length; i++) {
			System.out.println("번호 " +(i+1)+": "+ lotto[i]);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("[문제 9] 자리예약");
		System.out.println();
		// 자리가 10개 있는 소극장 예약 시스템 구축
		// 예약 자리를 입력받고, 가능 or 불가능 출력
		// 10개의 자리의 예약 가능 여부 출력
		// 예약 가능한 자리만 출력
		
		int[] reser = new int[11];
		reser[0] = 1;
		System.out.println("소극장에 오신걸 환영합니다.");
		System.out.println("--------------------------------");
		System.out.println("원하시는 메뉴를 선택해 주세요.");
		System.out.println("--------------------------------");
		System.out.println("1. 예약하기 2.모든자리 예약확인하기 3. 예약가능한 자리만 출력 그외.종료하기");
		while (true) {
			int input1 = scan.nextInt();
			if (input1 == 1) {
				System.out.println("1 ~ 10 까지 원하시는");
				System.out.println("예약 자리를 선택해 주세요.");
				System.out.println("0은 종료");
				while (true) {
				int input = scan.nextInt();
				if (input >=1 && input <=10) {
					if (reser[input] != 0) {
				        System.out.println("이미 예약이 완료된 자리입니다.");
				        System.out.println("다시 선택해 주세요.");
				    } else if (input >=1 && input <=10) {
				        reser[input] = input;
				        System.out.println("예약이 완료 되었습니다.");
				        System.out.println("다음 자리를 선택하시거나 0를 입력하시면 종료 됩니다.");
				    } else if (input <= -1 && input >=11) {
				    	System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				    }
				}
				if (input == 0) {
					System.out.println("자리선택을 종료합니다.");
					System.out.println("--------------------------------");
					System.out.println("원하시는 메뉴를 선택해 주세요.");
					System.out.println("--------------------------------");
					System.out.println("1. 예약하기 2.모든자리 예약확인하기 3. 예약가능한 자리만 출력 그외.종료하기");
					break;
				}
				}
			} else if (input1 == 2) {
				System.out.println("모든 자리의 예약을 확인합니다.");
				for (int i=0; i<reser.length; i++) {
					if(i >=1 && i <= reser.length-1) {
						if (reser[i] == 0) {
							System.out.println((i)+"번 자리 : 예약 가능");
						} else {
							System.out.println((i)+"번 자리 : 예약 불가");
						}
					}
				}
				System.out.println("--------------------------------");
				System.out.println("원하시는 메뉴를 선택해 주세요.");
				System.out.println("--------------------------------");
				System.out.println("1. 예약하기 2.모든자리 예약확인하기 3. 예약가능한 자리만 출력 그외.종료하기");
				} else if (input1 == 3) {
					System.out.print("남은자리 : ");
					for (int i=0; i<reser.length; i++) {
						if (reser[i] == 0) {
							System.out.print(i+", ");
						}
					}
					System.out.println();
					System.out.println("--------------------------------");
					System.out.println("원하시는 메뉴를 선택해 주세요.");
					System.out.println("--------------------------------");
					System.out.println("1. 예약하기 2.모든자리 예약확인하기 3. 예약가능한 자리만 출력 그외.종료하기");
				} else if (input1 <= -1 && input1 >= 5) {
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				}
				else {
					System.out.println("소극장을 나가 시스템을 종료합니다.");
					break;
				}
			
			} // 제일 큰 while 종료 중괄호
		
		System.out.println();
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("[문제 10] 비밀번호 8자리 설정하기");
		System.out.println();
		
		int[] pw = new int[8];
		for ( int i=0; i<pw.length ; i++) {
			int rand = (int)(Math.random()*9);
			if (rand >=1 && rand<=9) {
				pw[i] = rand;
			}
		}
		System.out.print("임시 비밀번호 : ");
		for (int i=0; i<pw.length ; i++) {
			System.out.print(pw[i]);
		}
		System.out.println();
		char[] pw2 = new char[8];
		for (int i=0; i<pw2.length ; i++) {
			char rand = 0;
			rand = (char)(Math.random()*26+97);
			pw2[i]=rand;
		}
		System.out.print("임시 비밀번호(소문자만) : ");
		for (int i=0; i<pw2.length ; i++) {
			System.out.print(pw2[i]);
		}
		System.out.println();
		char[] pw3 = new char[8];
		char num = 0;
		char a=0;
		char A=0;
		
		for (int i=0; i<pw3.length ; i++) {
			num = (char)(Math.random()*10+48);
			a = (char)(Math.random()*26+65);
			A = (char)(Math.random()*26+97);
		}
		System.out.print("임시 비밀번호 : ");
		for (int i=0; i<pw3.length ; i++) {
			System.out.print(pw3[i]);
		}
		
		
		
	}

}
