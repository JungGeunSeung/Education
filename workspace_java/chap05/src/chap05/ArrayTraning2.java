package chap05;

public class ArrayTraning2 {

	public static void main(String[] args) {
		int[] qus1 = {1,5,2,4};
		
		System.out.println("---------------------------------------");
		System.out.println("문제 1 배열 뒤집어 출력하기");
		System.out.println();
		
		for (int i = (qus1.length-1); i >= 0; i--) {
			System.out.println(qus1[i]);
		}
			
		System.out.println("---------------------------------------");
		System.out.println("문제 2 첫번째 자리에 0 넣기");
		System.out.println();
		int[] qus2 = new int[qus1.length+1];
		qus2[0] = 0;
		for (int i =1; i < qus2.length; i++) {
			qus2[i] = qus1[(i-1)];
		}
		for (int i =0; i < qus2.length; i++ ) {
			System.out.println(qus2[i]);
		}
		System.out.println("---------------------------------------");
		System.out.println("문제 3 마지막 숫자를 첫번째에 넣기");
		System.out.println();
		
		int[] qus3 = qus1;
		qus1[0] = qus1[3];
		for (int i = 0; i < qus1.length; i++) {
			qus1[i] = qus3[i+1];
			System.out.println(qus1[i]);
		}
	}

}
