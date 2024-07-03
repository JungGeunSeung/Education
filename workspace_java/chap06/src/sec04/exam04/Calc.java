package sec04.exam04;

public class Calc {

	int plus (int x, int y) {
		return x + y;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double avg = sum / 2;
		return avg;
	}
	
	void execute () {
		double result = avg(7,10);
		println("실행결과 : "+ result);
	}
	
	void println(String msg) {
		System.out.println(msg);
	}
	
}
