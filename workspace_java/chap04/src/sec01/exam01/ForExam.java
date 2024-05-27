package sec01.exam01;

public class ForExam {

	public static void main(String[] args) {

		// 1식 증가하는걸 5번 할꺼임
		int sum = 0;
		sum += 1;
		sum += 1;
		sum += 1;
		sum += 1;
		sum += 1;
		System.out.println(sum);
		
		//1~5까지의 합을 구할꺼임
		sum = 0;
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		System.out.println(sum);
		
		//이번에는 1,2,3..에 해당하는걸 변수에 넣어 보자
		sum = 0;
		int i = 1;
		for (i= 1; i<= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
