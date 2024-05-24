package sec01.exam01;

public class TypePromotionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String q1 = "1.내가 운전하는 자동차가 있다/없다";
		boolean a1 = false;
		String q2 = "2.우리집에 있는 스마트폰의 개수";
		byte a2 = 5;
		String q3 = "3.내이름";
		String a3 = "정근승";
		String q4 = "4.1평은 3.3제곱미터입니다. 5평에 대한 제곱미터 값은?";
		double a4 = 3.3;
		
		System.out.println(q1);
		System.out.println(a1);
		System.out.println(q2);
		System.out.println(a2);
		System.out.println(q3);
		System.out.println(a3);
		System.out.println(q4);
		System.out.println(a4*5);
	}

}
