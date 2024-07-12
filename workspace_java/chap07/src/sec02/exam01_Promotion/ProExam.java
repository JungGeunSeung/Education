package sec02.exam01_Promotion;

public class ProExam {

	public static void main(String[] args) {

		P3_1 p3_1 = new P3_1();
		
		// P2_1 p2_1 = (P2_1)p3_1 // 형변환 연산자 생략 가능
		P2_1 p2_1 = p3_1; // 자동 타입변환
		
		P1 p1 = p2_1;
		
		p1 = p3_1;
		
		
		// P1 pp1 = (P1)( (P2_1) new P3_1() ); // P3_1를 P2_1로 형변환하고 이걸 또다시 P1 타입으로 형변환 한것이다.
		P1 pp1 = new P3_1();
		
//		ctrl + shift + o 자동 임포트
//		ctrl + shift + x 대문자 변환
//		ctrl + shift + y 소문자 변환
	}

}
