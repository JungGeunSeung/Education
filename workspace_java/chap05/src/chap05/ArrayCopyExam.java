package chap05;

public class ArrayCopyExam {

	public static void main(String[] args) {

		// 커피 1호점에서 판매하는 메뉴
		String[] coffee = new String[3];
		coffee[0] = "따아";
		coffee[1] = "라떼";
		coffee[2] = "말차";
		
		// --------------------------------------------
		// 커피 2호점에서 1호점과 똑같은 커피를 판매할껍니다.
		/*
		 * 얕은 복사 shallow copy, thin copy, call by reference
		 * stack 영역의 값(주소)만 복사 한다.
		 * 특징: 원본이 바뀌면 복사한 값도 똑같이 바뀐다.
		 * */
		String[] coffee2 = coffee;
		for (int i = 0; i<coffee2.length; i++) {
			System.out.println(coffee2[i]);
		}
		coffee2[1] = "연유라떼";
		System.out.println("coffee2를 coffee로 복사하고, coffee2[1]의 값을 바꾸고 coffee를 출력");
		for (int i = 0; i<coffee.length; i++) {
			System.out.println(coffee2[i]);
		}
		// coffee와 coffee2의 스택영역의 값이 같기 때문에, coffee2를 바꿔도 coffee의 주소는 같기때문에
		// 값이 같이 바뀐다. (관리자 권한을 2명이 가지고 있어서 하나의 배열 힙영역을 서로 건드리는게 가능하다)
	
		// --------------------------------------------
		/* 깊은 복사 deep copy, deep clone, call by value
		 * heap 영역의 새로운 주소에 자리를 마련하고 변수에 주소를 넣는다.
		 * 그리고 원본(coffee)의 값들을 복사해서 채워 넣는다.
		 * 그래서 원본과 동일하게 생기지만, 전혀 다른 주소를 가지게 된다. 
		 * 즉 coffee3의 값을 바꿔도 원본이 바뀌지 않음.
		 * */
		System.out.println("coffee3의 값을 일부변경하고 출력");
		String[] coffee3 = new String[coffee.length];
		
		for (int i=0; i<coffee.length; i++) {
			coffee3[i] = coffee[i];
		}		
		coffee3[2] = "아샷추";
		for (int i = 0; i<coffee3.length; i++) {
			System.out.println(coffee3[i]);
		}
		// coffee3에 "사라다빵"을 추가하려면?
		coffee3 = new String[coffee.length+1];
		for (int i = 0; i<coffee.length; i++) {
			coffee3[i] = coffee[i];
		}
		coffee3[3] = "사라다빵";
		System.out.println("4번째 메뉴를 추가한 출력");
		for (int i = 0; i<coffee3.length; i++) {
			System.out.println(coffee3[i]);
		}
		
		// coffee3에 중간에 메뉴를 추가해야 한다면?
		
		//향상된 for문
		System.out.println("향상된 for문");
		for (String text : coffee3) {
			System.out.println(text);
		}
		
		// 모든 자식의 배열의 크기가 같을수 밖에 없다.
		int[][] a1= new int[10][100];
		// 자식별로 배열의 크기를 정할 수 있다.
		int[][] a2=  {
				{1,2},
				{1,2,3}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
