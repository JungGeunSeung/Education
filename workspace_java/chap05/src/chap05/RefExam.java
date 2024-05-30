package chap05;

public class RefExam {

	public static void main(String[] args) {

		int a;
//		System.out.println(a);
		
		String c = "정근승";
		// =을 기준으로 먼저 실행됨
		// "정근승"이 Heap 영역에 비어있는 번지에 들어간다
		// stack area의 C에 그 번지가 기록된다.

		
		System.out.println("c : "+ c);
		System.out.println("c == null : "+(c == null));
		System.out.println("c != null : "+c != null);
		
		c = null;	//주소값을 비워서 연결 끊기
		System.out.println("c : "+ c);
		System.out.println("c == null : "+c == null);
		System.out.println("c != null : "+c != null);
	
		String d;
		// 기본타입과 마찬가지로
		// 값을 할당하지 않으면 사용할수 없다.
		//		System.out.println(d);
		c = "정근승";  
		d = "정근승";
		System.out.println(c == d); // 결과 : true
		// 이건 String 특별 대우
		// 메모리를 효율적으로 사용하기 위해 같은 글씨가 할당 되면 자바가 임의적으로 같은 힙영역 번지를
		// 할당해 준다.
		
		c = new String("정근승"); // 새로운 주소에 할당
		System.out.println(c == d); // 결과 : false
		// c가 가지고 있는 주소와 d의 주소값이 다르다
		
		System.out.println("c.equals(d) : "+c.equals(d));
		
		c = null;
//		System.out.println("c.equals(d) : "+c.equals(d));
		String e = c + "abc";
		System.out.println(e);
	
	
	
	
	
	
	
	
	
	
	}

}
