package sec01.exam01;

public class OperaterExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
//		a = 11;
//		a = 10 + 1;
		int b = a + 1;
		
		a = a + 1;
		a += 1; 
		a++; //셋 다 같다.
		
		a = 10;
		a++;
		System.out.println("a : "+ a);
		
		a = a - 1;
		a -= 1; 
		a--; //셋 다 같다.
		
		a = 10;
		a--;
		System.out.println("a : "+ a); // a=9
		
		System.out.println("++a : "+ ++a); // a=10
		
		System.out.println("a++ : "+ a++); // a=10
		
		System.out.println("a : "+ a); // a=11
		
		System.out.println(a++ + ++a);
		// (11 + (a가 12가 된 상태)+1) 해서  11 + 13 = 24
		
		boolean c = true;
		System.out.println("c : "+ c);
		c = !c;
		System.out.println("!c : "+ c);
		
		double d = 7;
		System.out.println(d / 3);
//		System.out.println(d / 0); 0으로 나누면 double은 infinity, int는 / by zero 라고 출력 에러 뜬다.
		
		int f = 15;
		int p = 5;
		System.out.println("몫 : " + (f / p));
		System.out.println("나머지 : " + (f % p));
		
		int m = 10000;
		int co = 4500;
		System.out.println(m / co);
		System.out.println(m % co);
		
		double sele = 0.15;
		int honey = 5000;
		int lip = 10000;
		double sh = honey * sele;
		int shr = honey - (int)sh;
		double sl = lip * sele;
		int slr = lip - (int)sl;
		
		System.out.println(shr+"원");
		System.out.println(shr+slr+"원");
		
		
//		1. 예측과 결과가 같은지 확인 - 개발
//		2. 숫자를 바꿔도 잘 나온느지 두어번 해보기 - 테스트
		System.out.println("-----------------------------");
		int me = 7234;
		
		int n1 = me / 5000;
		int n11 = me % 5000;
		int n2 = n11 / 1000;
		int n22 = n11 % 1000;
		int n3 = n22 / 500;
		int n33 = n22 % 500;
		int n4 = n33 / 100;
		int n44 = n33 % 100;
		int n5 = n44 / 50;
		int n55 = n44 % 50;
		int n6 = n55 / 10;
		int n7 = n55 % 10;
		
		System.out.println("5천원짜리 "+ n1 +"장");
		System.out.println("천원짜리 "+ n2 +"장");
		System.out.println("500원짜리 "+ n3 +"장");
		System.out.println("100원짜리 "+ n4 +"장");
		System.out.println("50원짜리 "+ n5 +"장");
		System.out.println("10원짜리 "+ n6 +"장");
		System.out.println("1원짜리 "+ n7 +"장");
		
		System.out.println("-----------------------------");
		
		String left = "수박";
		String right = "멜론";
		System.out.println("left : " + left);
		System.out.println("right : " + right);

		System.out.println("left과 right의 결과값을 바꾸어라.");
		
		String middle = left;
		left = right;
		right = middle;
		System.out.println("left : " + left);
		System.out.println("right : " + right);
		
		System.out.println("-----------------------------");
		System.out.println(3 > 5);
		boolean bool = 3 > 5;
		System.out.println(bool);
		
		System.out.println(0.1 == 0.1f); //결과 false
		// 같은 타입으로 변경해서 비교하자
		
		System.out.println(" 3 == 3 : " + (3 == 3));
		System.out.println(" 3 != 3 : " + (3 != 3));
		
		String str1 = "정근승";
		String str2 = "정근승";
		System.out.println(str1 == str2);
		// 글씨는 ==를 쓰지 말자.
//		str1.equals(str2); String 변수나 ""에 .equals()로 변경하여 사용 ()안에 글씨와 비교해라.
		System.out.println( str1.equals(str2) );
		
		
		// bit 연산 방법 (실제로도 많이 쓰니까 연습해라)
		System.out.println( 10 & 3);
		System.out.println( 10 | 3);
		
		int i1 = 3;
		int i2 = 5;
		int i3 = 7;
		
		
		System.out.println("i3이 가장 큰 값인가? " + ( i3 >= i1 && i3 >= i2));
		
		boolean result = i3 > i2;
		System.out.println(result ? "i3이 크다" : "i3이 작거나 같다");
		
		int value = 356;
		System.out.println(value/100*100);
		
		int va1 = 5;
		int va2 = 2;
		double va3 = (double) va1 / (double) va2 ;
		int va4 = (int) (va3 *va2);
		System.out.println(va4);
		
		
	}

}
