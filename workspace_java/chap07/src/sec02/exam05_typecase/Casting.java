package sec02.exam05_typecase;

import java.util.ArrayList;

public class Casting {

	// 강제타입변환 Casting
	// 부모타입을 자식타입으로 변환하는 것을 말한다.
	// 자식 타입이 부모 타입으로 자동 타입 변환한 후 다시 자식 타입으로 변환 할때 강제 타입 변환을 사용한다.
	// 자식타입 변수 = (자식타입) 부모타입; 형변환 괄호 생략 불가능
	public static void main (String[] args) {
		Child child = new Child();
		child.method1("자식");
		System.out.println("결과 child : " + child.field1);
		
		Parent p  = new Child();
		p.method1("부모");
		System.out.println("결과 p : " + p.field1); // field는 override 되지 않기 때문에 parent의 필드가 출력 되었다.
		// 자식이 부모의 필드를 건들이는 메소드가 아니면, 자식이 어떤 필드를 가지고 있던 형변환 되면 부모의 필드만 남는다.
		
		Child child2 = (Child)p;
		System.out.println("결과 child2 : " + child2.field1);
		
		/////////////////////////////////////////////
		
		Parent p1 = new Child();
		Parent p2 = new Child101();
		
//		p1 = p2;
		Child c = (Child)p1;
//		Child c2 = (Child)p2; // 오류난다 p2의 형변환 타입은 Child101타입이였기 때문에 Child타입으로 다시 갈수 없다
		
		// 클래스의 객체 타입확인
		// instanceof
		// 왼쪽에는 객체가 오고 오른쪽에는 클래스타입이 온다
		// 좌항의 객체가 우항의 인스턴스이면, 즉 우항의 타입으로 객체가 생성되었다면 true를 리턴한다.
		boolean result = p2 instanceof Child;
		System.out.println(result);
		if (result) {
			Child c2 = (Child) p2;
		} else {
			Child101 c2 = (Child101) p2;
		}
		
		// 자바가 가지고 있는 상위 클래스 Object class
		// 그래서 Parent class를 담을 수 있다.
		Object obj = new Parent();
		
		// Arraylist에 p1을 담고 다시 Parent타입으로 강제 형변환 해야한다.
		// ArrayList는 무슨 타입이던 담을수 있지만, 한번 담은 타입으로 결정 된다.
		ArrayList list = new ArrayList();
		list.add(p1);
		Object obj1 = list.get(0);
		Parent p3 = (Parent) obj1;
		
	}
}
