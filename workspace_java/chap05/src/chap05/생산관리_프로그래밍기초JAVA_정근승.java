package chap05;

import java.util.ArrayList;
import java.util.Scanner;

public class 생산관리_프로그래밍기초JAVA_정근승 {

	public static void main(String[] args) {
		
		// 정근승
		
		// 메뉴
		// 커피, 음료
		String[] menu = new String[] {"1.커피","2.음료","3.종료"};
		//커피
		// 아메리카노 카페라떼 바닐라라떼 아샷추
		String[] coffee = new String[] {"아메리카노","카페라떼","바닐라라떼","에스프레소","커피주문 마치기"};
		//음료
		// 아이스티, 딸기스무디, 펄 프라페, 수박주스
		String[] drink = new String[] {"아이스티","딸기스무디","펄 프라페","수박주스","음료주문 마치기"};
		//커피 추가옵션
		String[] option = new String[] {"연하게","샷추가","시럽추가","휘핑추가","추가옵션 마치기"};
		
		
		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		int menu_input = 0;
		int coffee_input = 0;
		int drink_input = 0;
		int option_input = 0;
		
		int[] coffee_price = {2000, 3000, 3500, 3000};

		int[] drink_price = {2000, 3000, 3500, 3000};

		int option_1 = 500;

		
		ArrayList coffee_list = new ArrayList();
		ArrayList drink_list = new ArrayList();
		ArrayList option_list = new ArrayList();
		
		
		// 배열의 인덱스 값을 저장할 변수와 인덱스 값이 여러개 일때 는 전부 출력할 수 있게 하는법....?
		
		System.out.println("---------------------------------------");
		System.out.println("어서오세요 자바카페 입니다.");
		System.out.println("---------------------------------------");
		while(true) {
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("---------------------------------------");
			
			for (int i =0; i<menu.length; i++) {
				System.out.print(menu[i] + " ");
			};
			System.out.println();
			
			menu_input = scan.nextInt();
			while (menu_input == 1) {
				System.out.println("원하시는 커피를 선택해주세요.");
				System.out.println("---------------------------------------");
				
				for (int i =0; i<coffee.length; i++) {
					System.out.print((i+1) + "." + coffee[i] + " ");
				};
				System.out.println();
				coffee_input = scan.nextInt();
					if (coffee_input == 1) {
						System.out.println(coffee[0] + "를 주문합니다.");
						coffee_list.add(coffee_input);
						total += coffee_price[coffee_input-1];
						while(true) { //옵션 while
						System.out.println("---------------------------------------");
						System.out.println("원하시는 옵션을 선택하세요");
						System.out.println("---------------------------------------");
						for (int i =0; i<option.length; i++) {
							System.out.print((i+1) + "." + option[i] + " ");
						};
						System.out.println();
						option_input = scan.nextInt();
							if (option_input == 1) {
								System.out.println(option[0] + "를 추가합니다.");
								option_list.add(option_input);
							}
							else if (option_input == 2) {
								System.out.println(option[1] + "를 추가합니다.");
								option_list.add(option_input);
								total += option_1;
							}
							 else if (option_input == 3) {
								System.out.println(option[2] + "를 추가합니다.");
								option_list.add(option_input);
								total += option_1;
							}
							 else if (option_input == 4) {
								System.out.println(option[3] + "를 추가합니다.");
								option_list.add(option_input);
								total += option_1;
							}
							 else if (option_input == 5) {
								System.out.println("옵션을 선택을 종료합니다.");
								break;
							} else {
								System.out.println("잘못된 선택방식입니다. 다시 선택해주세요");
								continue;
							}
						}; // 옵션 종료 while
					} else if (coffee_input == 2) {
						System.out.println(coffee[1] + "를 주문합니다.");
						coffee_list.add(coffee_input);
						total += coffee_price[coffee_input-1];
						while(true) { //옵션 while
							System.out.println("---------------------------------------");
							System.out.println("원하시는 옵션을 선택하세요");
							System.out.println("---------------------------------------");
							for (int i =0; i<option.length; i++) {
								System.out.print((i+1) + "." + option[i] + " ");
							};
							System.out.println();
							option_input = scan.nextInt();
								if (option_input == 1) {
									System.out.println(option[0] + "를 추가합니다.");
									option_list.add(option_input);
								}
								else if (option_input == 2) {
									System.out.println(option[1] + "를 추가합니다.");
									option_list.add(option_input);
									total += option_1;
								}
								 else if (option_input == 3) {
									System.out.println(option[2] + "를 추가합니다.");
									option_list.add(option_input);
									total += option_1;
								}
								 else if (option_input == 4) {
									System.out.println(option[3] + "를 추가합니다.");
									option_list.add(option_input);
									total += option_1;
								}
								 else if (option_input == 5) {
									System.out.println("옵션을 선택을 종료합니다.");
									break;
								} else {
									System.out.println("잘못된 선택방식입니다. 다시 선택해주세요");
									continue;
								}
							}; // 옵션 종료 while
					} else if (coffee_input == 3) {
						System.out.println(coffee[2] + "를 주문합니다.");
						coffee_list.add(coffee_input);
						total += coffee_price[coffee_input-1];
						while(true) { //옵션 while
							System.out.println("---------------------------------------");
							System.out.println("원하시는 옵션을 선택하세요");
							System.out.println("---------------------------------------");
							for (int i =0; i<option.length; i++) {
								System.out.print((i+1) + "." + option[i] + " ");
							};
							System.out.println();
							option_input = scan.nextInt();
								if (option_input == 1) {
									System.out.println(option[0] + "를 추가합니다.");
									option_list.add(option_input);
								}
								else if (option_input == 2) {
									System.out.println(option[1] + "를 추가합니다.");
									option_list.add(option_input);
									total += option_1;
								}
								 else if (option_input == 3) {
									System.out.println(option[2] + "를 추가합니다.");
									option_list.add(option_input);
									total += option_1;
								}
								 else if (option_input == 4) {
									System.out.println(option[3] + "를 추가합니다.");
									option_list.add(option_input);
									total += option_1;
								}
								 else if (option_input == 5) {
									System.out.println("옵션을 선택을 종료합니다.");
									break;
								} else {
									System.out.println("잘못된 선택방식입니다. 다시 선택해주세요");
									continue;
								}
							}; // 옵션 종료 while
					} else if (coffee_input == 4) {
						System.out.println(coffee[3] + "를 주문합니다.");
						coffee_list.add(coffee_input);
						total += coffee_price[coffee_input-1];
						while(true) { //옵션 while
							System.out.println("---------------------------------------");
							System.out.println("원하시는 옵션을 선택하세요");
							System.out.println("---------------------------------------");
							for (int i =0; i<option.length; i++) {
								System.out.print((i+1) + "." + option[i] + " ");
							};
							System.out.println();
							option_input = scan.nextInt();
								if (option_input == 1) {
									System.out.println(option[0] + "를 추가합니다.");
									option_list.add(option_input);
								}
								else if (option_input == 2) {
									System.out.println(option[1] + "를 추가합니다.");
									option_list.add(option_input);
									total += option_1;
								}
								 else if (option_input == 3) {
									System.out.println(option[2] + "를 추가합니다.");
									option_list.add(option_input);
									total += option_1;
								}
								 else if (option_input == 4) {
									System.out.println(option[3] + "를 추가합니다.");
									option_list.add(option_input);
									total += option_1;
								}
								 else if (option_input == 5) {
									System.out.println("옵션을 선택을 종료합니다.");
									break;
								} else {
									System.out.println("잘못된 선택방식입니다. 다시 선택해주세요");
									continue;
								}
							}; // 옵션 종료 while
					} else if (coffee_input == 5) {
						System.out.println("커피주문을 종료합니다.");
						break;
					} else { 
						System.out.println("잘못된 입력 방식입니다. 다시 입력해주세요.");
					}
				
			} // 커피주문 while 종료 괄호
			
			while (menu_input == 2) {
					System.out.println("원하시는 음료를 선택해주세요.");
					System.out.println("---------------------------------------");
					
					for (int i =0; i<drink.length; i++) {
						System.out.print((i+1) + "." + drink[i] + ", ");
					};
					System.out.println();
					drink_input = scan.nextInt();
						if (drink_input == 1) {
							System.out.println(drink[0] + "를 주문합니다.");
							drink_list.add(drink_input);
							total += drink_price[drink_input-1];
							while(true) { //옵션 while
								System.out.println("---------------------------------------");
								System.out.println("원하시는 옵션을 선택하세요");
								System.out.println("---------------------------------------");
								for (int i =0; i<option.length; i++) {
									System.out.print((i+1) + "." + option[i] + " ");
								};
								System.out.println();
								option_input = scan.nextInt();
									if (option_input == 1) {
										System.out.println(option[0] + "를 추가합니다.");
										option_list.add(option_input);
									}
									else if (option_input == 2) {
										System.out.println(option[1] + "를 추가합니다.");
										option_list.add(option_input);
										total += option_1;
									}
									 else if (option_input == 3) {
										System.out.println(option[2] + "를 추가합니다.");
										option_list.add(option_input);
										total += option_1;
									}
									 else if (option_input == 4) {
										System.out.println(option[3] + "를 추가합니다.");
										option_list.add(option_input);
										total += option_1;
									}
									 else if (option_input == 5) {
										System.out.println("옵션을 선택을 종료합니다.");
										break;
									} else {
										System.out.println("잘못된 선택방식입니다. 다시 선택해주세요");
										continue;
									}
								}; // 옵션 종료 while
						} else if (drink_input == 2) {
							System.out.println(drink[1] + "를 주문합니다.");
							drink_list.add(drink_input);
							total += drink_price[drink_input-1];
							while(true) { //옵션 while
								System.out.println("---------------------------------------");
								System.out.println("원하시는 옵션을 선택하세요");
								System.out.println("---------------------------------------");
								for (int i =0; i<option.length; i++) {
									System.out.print((i+1) + "." + option[i] + " ");
								};
								System.out.println();
								option_input = scan.nextInt();
									if (option_input == 1) {
										System.out.println(option[0] + "를 추가합니다.");
										option_list.add(option_input);
									}
									else if (option_input == 2) {
										System.out.println(option[1] + "를 추가합니다.");
										option_list.add(option_input);
										total += option_1;
									}
									 else if (option_input == 3) {
										System.out.println(option[2] + "를 추가합니다.");
										option_list.add(option_input);
										total += option_1;
									}
									 else if (option_input == 4) {
										System.out.println(option[3] + "를 추가합니다.");
										option_list.add(option_input);
										total += option_1;
									}
									 else if (option_input == 5) {
										System.out.println("옵션을 선택을 종료합니다.");
										break;
									} else {
										System.out.println("잘못된 선택방식입니다. 다시 선택해주세요");
										continue;
									}
								}; // 옵션 종료 while
						} else if (drink_input == 3) {
							System.out.println(drink[2] + "를 주문합니다.");
							drink_list.add(drink_input);
							total += drink_price[drink_input-1];
							while(true) { //옵션 while
								System.out.println("---------------------------------------");
								System.out.println("원하시는 옵션을 선택하세요");
								System.out.println("---------------------------------------");
								for (int i =0; i<option.length; i++) {
									System.out.print((i+1) + "." + option[i] + " ");
								};
								System.out.println();
								option_input = scan.nextInt();
									if (option_input == 1) {
										System.out.println(option[0] + "를 추가합니다.");
										option_list.add(option_input);
									}
									else if (option_input == 2) {
										System.out.println(option[1] + "를 추가합니다.");
										option_list.add(option_input);
										total += option_1;
									}
									 else if (option_input == 3) {
										System.out.println(option[2] + "를 추가합니다.");
										option_list.add(option_input);
										total += option_1;
									}
									 else if (option_input == 4) {
										System.out.println(option[3] + "를 추가합니다.");
										option_list.add(option_input);
										total += option_1;
									}
									 else if (option_input == 5) {
										System.out.println("옵션을 선택을 종료합니다.");
										break;
									} else {
										System.out.println("잘못된 선택방식입니다. 다시 선택해주세요");
										continue;
									}
								}; // 옵션 종료 while
						} else if (drink_input == 4) {
							System.out.println(drink[3] + "를 주문합니다.");
							drink_list.add(drink_input);
							total += drink_price[drink_input-1];
							while(true) { //옵션 while
								System.out.println("---------------------------------------");
								System.out.println("원하시는 옵션을 선택하세요");
								System.out.println("---------------------------------------");
								for (int i =0; i<option.length; i++) {
									System.out.print((i+1) + "." + option[i] + " ");
								};
								System.out.println();
								option_input = scan.nextInt();
									if (option_input == 1) {
										System.out.println(option[0] + "를 추가합니다.");
										option_list.add(option_input);
									}
									else if (option_input == 2) {
										System.out.println(option[1] + "를 추가합니다.");
										option_list.add(option_input);
										total += option_1;
									}
									 else if (option_input == 3) {
										System.out.println(option[2] + "를 추가합니다.");
										option_list.add(option_input);
										total += option_1;
									}
									 else if (option_input == 4) {
										System.out.println(option[3] + "를 추가합니다.");
										option_list.add(option_input);
										total += option_1;
									}
									 else if (option_input == 5) {
										System.out.println("옵션을 선택을 종료합니다.");
										break;
									} else {
										System.out.println("잘못된 선택방식입니다. 다시 선택해주세요");
										continue;
									}
								}; // 옵션 종료 while
						} else if (drink_input == 5) {
							System.out.println("음료주문을 종료합니다.");
							break;
						} else { 
							System.out.println("잘못된 입력 방식입니다. 다시 입력해주세요.");
						}
					
				} // 음료주문 while 종료 괄호
			
			if (menu_input == 3) {
				System.out.println("주문을 종료합니다");
				System.out.println("---------------------------------------");
				System.out.println("총 주문된 메뉴는");
				for (int i =0; i<coffee_list.size(); i++) {
					System.out.println(coffee[(int)coffee_list.get(i)-1]);
				};
				for (int i =0; i<drink_list.size(); i++) {
					System.out.println(drink[(int)drink_list.get(i)-1]);
				};
				for (int i =0; i<option_list.size(); i++) {
					System.out.println(option[(int)option_list.get(i)-1]);
				};
				System.out.println("---------------------------------------");
				System.out.println("총 가격는 " + total + "원 입니다.");
				break;
			};
		} // 전체 while 종료 괄호
	}
}
