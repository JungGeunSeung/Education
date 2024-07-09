package traning;

public class CalcExecute {

	public static void main(String[] args) {

		Calc calc = new Calc();
		
		int plus = calc.calc(13, "+", 4);
		System.out.println("plus : "+ plus);
		
		int minus = calc.calc(13, "-", 4);
		System.out.println("minus : "+ minus);
		
		int multi = calc.calc(13, "*", 4);
		System.out.println("multi : "+ multi);
		
		int divide = calc.calc(13, "/", 4);
		System.out.println("divide : "+ divide);
		
		int result = calc.calc(1, null, 1);
		
		int error = calc.calc(13, "더하기", 4);
	}

}
