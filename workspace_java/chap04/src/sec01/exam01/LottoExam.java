package sec01.exam01;

public class LottoExam {

	public static void main(String[] args) {

		double rand = Math.random();
		// 0이상 1미만
		/*
		 * 0 <= rand && rand < 1
		 * 0. ~ 0.99999999
		 * 0 * 45 <= rand * 45 < 1*45
		 * int로 바꾸면 0 ~ 44 까지 나온다
		 * 여기에 1을 더하면
		 * 1 ~ 45까지 random한 숫자가 나온다
		 */
		
		int number = (int)(rand * 45);  // 0 ~ 44
		++number;						// 1 ~ 45
//		number = (int)(rand * 45) + 1; // 위에 코드를 한줄로
		
		number = ((int)(rand *100)) % 45 + 1;
		System.out.println(number);
		
		int v1 = 0;
		if (true) {
			int v2 = 0;
			if (true) {
				int v3 = 0;
				v1 = 1;
				v2 = 1;
				v3 = 1;
			}
			v1 = v2;
		}
		System.out.println(v1);
	}

}
