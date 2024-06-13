package chap05;

import java.util.ArrayList;

public class ArrayExam {

	public static void main(String[] args) {
		// 기본타입에는 null을 넣을 수 없음
		// int a = null;
		
		// 배열
		// 한번에 여러 변수를 만드는 방법
		// 같은 타입만 선언할 수 있다.
		// 생성된 여러 변수들은 index로 관리 할 수 있다
		
		// 선언방법
		int[] score; //int로 이루어진 배열변수
		int score2[]; // C언어 스타일
		
		score = null;
		
		int score_0 = 90;
		int score_1 = 60;
		int score_2 = 70;
		// 배열을 생성할때 크기를 알려줘야 합니다.
		// 첫번째 [] : int[]는 배열인데 int만 들어가게 해달라
		// 두번째 [3] : 배열의 크기 한번에 만들 변수의 개수
		//				연달아서 타입의 크기만큼 메모리를 할당한다
		// 				첫번째 변수부터 index 0으로 시작한다.
		// 세번째 [0] : 배열로 만들어진 변수들 중 n번째 변수를 뜻함.
		int[] intArray = new int[3];
		intArray[0]= 90;
		intArray[1]= 60;
//		intArray[2]= 70;
		
		System.out.println("intArray[1] : "+intArray[1]);
		// 값을 넣지 않아도 기본값은 0 또는 false, null가 된다.
		System.out.println("intArray[2] : "+intArray[2]);
//		System.out.println("intArray[3] : "+intArray[3]); //배열의 정해진 개수를 벗어나 오류가 난다
		
		// 배열의 모든 값은 1로 바꾼다
		intArray[0]= 1;
		intArray[1]= 1;
		intArray[2]= 1;
		for (int a=0; a<3; a++) {
			intArray[a]= 1;
		}
		for (int i=0; i<3; i++) { //조건문 i<3대신에 intArray.length를 쓰면 크기를 알지 않아도 실행할수 있다.
			System.out.println(intArray[i]);
		}
		
		System.out.println(intArray); // 출력 : [I@59f95c5d
		System.out.println(intArray.length); //배열의 크기를 알려준다.
		// 한번 선언된 배열의 크기는 바꿀 수 없다.
		
		
		
		// 배열을 선언하는 2번째 방법
		// 값을 미리 알고 있을때
		// 배열의 크기는 알아서 계산 된다
		int[] intArray2 = new int[] {10, 20, 30, 40};
		for (int i=0; i<intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}
		
		// 배열을 선언하는 3번째 방법
		// 선언과 동시에 초기화 할때만 가능
		int[] intArray3 = {100, 200, 300, 400};
		for (int i=0; i<intArray3.length; i++) {
			System.out.println(intArray3[i]);
		}
		
		String[] stArray = new String[5];
		for (int a=0; a<stArray.length; a++) {
			stArray[a] = "정근승"+(a+1);
		}
		for (int a=0; a<stArray.length; a++) {
			System.out.println(stArray[a]);
		}
		
		// 1~10까지 배열에 넣고 배열의 총 합을 출력
		// 배열의 평균값 출력
		int[] intArray4 = new int[10];
		for (int a=0; a<intArray4.length; a++) {
			intArray4[a] = a+1;
		}
	
		int sum = 0;
		for(int a=0; a<intArray4.length; a++) {
			sum += intArray4[a];
		}
		System.out.println(sum);
	
		double avg = (double)sum/ intArray4.length;
		System.out.println(avg);
	
		int[] class1 = new int[22];
		int[] class2 = new int[22];
		int[] class3 = new int[22];
		int[] class4 = new int[22];
	
		// int[]을 변수들로 관리하는 배열이 된다는 뜻으로 [][]로 적는다.
		// [4]는 변수 "천안"의 크기로 관리되는 변수의 개수이다.
		int[][] 천안 = new int[4][22];
		
		System.out.println(천안); // [[I@9e89d68
		System.out.println(천안[0]); // [I@3b192d32
		System.out.println(천안[0][0]);
		
		int[] 클래스1 = 천안[0];
		int 학생1 = 클래스1[0]; // int 학생1 = 천안 [0][0]; 와 같다
		
		int[][] 수원 = new int[4][22];
		int[][] 서울 = new int[4][22];
	
		int[][][] 휴먼 = new int[3][4][22];
		// 변수명 휴먼은 변수명 서울,수원,천안을 관리하고 각 지역의 지점은 4개의 클래스를 관리하고
		// 클래스는 22명의 학생을 관리하는 3차원 배열이 된다.
		System.out.println(휴먼); //[[[I@16f65612
		
		System.out.println("휴먼.length : " + 휴먼.length);
		System.out.println("휴먼[0].length : " + 휴먼[0].length);
		System.out.println("휴먼[0][0].length : " + 휴먼[0][0].length);
	
		for (int a=0; a<천안.length; a++) {
			System.out.println("천안 " + (a+1) + "클래스");
			for (int b=0; b<천안[a].length; b++) {
				천안[a][b]= 천안[a][b] + (b+1);
				System.out.println(천안[a][b]);
			}
		}
	
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("문자열");
		list.add(true);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		//배열의 length
		System.out.println(list.size());
		System.out.println("배열리스트" + list);
	
		
		
		String[] study = {"박규태", "이제섭", "박경민", "김아영", "정근승",
				"현준수", "남현우","김승환","조민정","이정은"};
		System.out.println("총 "+study.length+"명");
		
		
		int[] vote = new int[study.length];
		
//		System.out.println("스터디의 조장은? : " + study[index]);
		for (int i=0; i<1000; i++) {
			double rand = Math.random() * study.length;
			int index = (int) rand;

			vote[index] += 1;
		}
		
		for (int i=0; i<vote.length ;i++) {
			System.out.println("index :" + (i+1) + " 특표수 : " + vote[i]);
		}
		
		// 6개의 lotto를 저장하는 배열
		
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length; i++) {
			
			lotto[i] = (int)(Math.random() * 45) +1;
			
		}
		for(int i=0;i<lotto.length; i++) {
			
			System.out.println("번호 " + lotto[i]);
			
		}
		
	}

}
