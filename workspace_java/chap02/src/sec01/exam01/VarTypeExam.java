package sec01.exam01;

public class VarTypeExam {

	public static void main(String[] args) {

		byte b = 127;
//		b = 128; 허용범위를 넘었다.
		
		char c = 97;
		
		System.out.println(c);
		c = 97 + 5;
		System.out.println(c);
		char c1 = 'a'; // 문자 하나만 저장하는 용도 , 홀따옴표 ''로 감싼다.
		
		long balance = 3000000000L; // 명확하게 long으로 지정하려면 숫자 뒤에 L(l)을 붙여준다

		String s = "문자열";
		System.out.println(s);
		
		// \n은 newline의 약자로 Enter 효과이다.
		// \t은 tap의 약자로 tap 효과이다.
		
		float f = 0.1234567890123456789F;
		System.out.println(f);
		//float은 자바에선 소수점 7자리까지만 정확하게 출력 된다.
		
		double d = 0.1234567890123456789;
		System.out.println(d);
		// double은 자바에선 소수점 16자리까지만 정확하게 출력 된다.
		
		boolean b1 = true;
		boolean b2 = false;
	}

}
