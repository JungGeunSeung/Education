package sec01.exam01;

public class VarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 선언 : 자료의 종류(타입type) 한칸 띄고 이름
		int score; //선언부
		score = 90; //할당, 값은 넣는다.
		
//		int value;
//		value = 30;
		int value = 30; //선언과 동시에 초기화
		
		value = 31;
		
//		score + value
//		90    +  31
		value = score + value;
		
		int val;
		// 당연히 선언을 하지 않은 변수는 사용할 수 없다.
		// 선언만 하고 값을 넢지 않는 변수는 사용 할 수 없다.
//		int val2 = val +10;
		//같은 이름의 변수를 선언 할 수 없다.
//		int val;
		
		System.out.println(value);
		
		int var1 = 10;
		int var2 = 20;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);

		int x = 10;
		int y = x;
		
		
		int j = 1;
		{
			// 변수는 자손 중괄호 {}에도 영향을 미친다.
//			int j = 2;
			System.out.println(j);
		}
		{
			// 변수는 선언된 중괄호 {}가 끝나면 사라진다.
			int i = 0;
		}
		{
			int i = 0; //메소드블럭 밖에서는 같은 이름으로 선언 가능하다.
	
	
		
		}
}
















