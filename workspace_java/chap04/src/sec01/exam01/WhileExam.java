package sec01.exam01;

import java.util.Scanner;

public class WhileExam {
	public static void main(String[] args) {
		
		int i =1;
		while (i <=10) {
			System.out.println(i);
			i++;
		}
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("메뉴를 골라라");
//		System.out.println("1:커피, 2:차, 3:,음료, 0:종료");
//		int menu = scan.nextInt();
//		if (menu == 1) {
//			System.out.println("커피 주께");
//		} else if (menu == 2) {
//			System.out.println("차 주께");
//		} else if (menu == 3) {
//			System.out.println("음료 주께");
//		} else if (menu == 0) {
//			System.out.println("잘가");
//			
//		}
//		if (menu != 0) {
//			System.out.println("메뉴를 골라라");
//			System.out.println("1:커피, 2:차, 3:,음료, 0:종료");
//			menu = scan.nextInt();
//			if (menu == 1) {
//				System.out.println("커피 주께");
//			} else if (menu == 2) {
//				System.out.println("차 주께");
//			} else if (menu == 3) {
//				System.out.println("음료 주께");
//			} else if (menu == 0) {
//				System.out.println("잘가");
//			}
//		}
//	
//		int menu = -1;
//		// while은 몇번 반복할지 모를때 적당하다.
//		// 끝나는 조건을 만들어주지 않으면, 영원히 돌아간다.
//		while (menu != 0) {
//			System.out.println("메뉴를 골라라");
//			System.out.println("1:커피, 2:차, 3:,음료, 0:종료");
//			menu = scan.nextInt();
//			
//			if (menu == 1) {
//				System.out.println("커피 주께");
//			} else if (menu == 2) {
//				System.out.println("차 주께");
//			} else if (menu == 3) {
//				System.out.println("음료 주께");
//			} else if (menu == 0) {
//				System.out.println("잘가");
//				
//			}
//		}
		
		int menu2;
		do {
			System.out.println("메뉴를 골라라");
			System.out.println("1:커피, 2:차, 3:,음료, 0:종료");
			menu2 = scan.nextInt();
			
			if (menu2 == 1) {
				System.out.println("커피 주께");
			} else if (menu2 == 2) {
				System.out.println("차 주께");
			} else if (menu2 == 3) {
				System.out.println("음료 주께");
			} else if (menu2 == 0) {
				System.out.println("잘가");
				
			}
		} while ( menu2 != 0 );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
