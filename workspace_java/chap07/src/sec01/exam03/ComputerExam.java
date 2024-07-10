package sec01.exam03;

public class ComputerExam {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		
		double result = com.areaCircle(20);
		System.out.println("Coputer의 계산결과 : " + result);
		
		Calc calc = new Calc();
		
		double result2 = calc.areaCircle(20);
		System.out.println("Calc의 계산결과 : " + result2);
		
		Calc calc1 = com;
		
		double result3 = calc1.areaCircle(10);
		System.out.println(result3);
	}

}
