package sec04.exam01;

public class CalcExam {

	public static void main(String[] args) {
		
		Calc.powerOn();
		
		Calc calc = new Calc();
		calc.powerOff();
		
		
		System.out.println(calc); // class가 위치하고 있는 패키지 위치와 @뒤는 힙영역의 위치이다
		
		int sum = calc.plus(5, 6);
		System.out.println("더하기 결과 " + sum);
		double divide = calc.divide(2, 0);
		System.out.println("나누기 결과 " + divide);
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int sum1 = calc.plus2(a);
		
		System.out.println("배열 전부 더하기 "+ sum1);
	}

	
	
	
	
	
	
	
	
	
} // class 종료 괄호
