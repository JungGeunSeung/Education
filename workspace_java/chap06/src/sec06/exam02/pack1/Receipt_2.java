package sec06.exam02.pack1;

import sec06.exam02.pack2.Receipt_3;

public class Receipt_2 {

	// 다른 클래스 찾는 순서 : 현재 패키지 -> java.lang 패키지 -> import
	Receipt_2 () {
		Receipt_1 r1 = new Receipt_1(); // pack1 에 존재 하는 Receipt_1
		Receipt_3 r3 = new Receipt_3(); // pack2 에 존재 하기 때문에 밑에 import로 추가해준뒤 사용이 가능하다
		
		// import 에서 *로 가져온 클래스명이 현재 패키지에서 이름이 겹치더라고 우선순위 때문에, 현재 패키지를 뜻하게 된다.
		// 같은 이름의 클래스를 import할때 클래스 명까지 적어주면, 우선순위가 또다시 바뀐다.
		// 그래서 기존에 있던 이름이 겹치던 클래스명을 사용하러면, 패키지명과 클래스 명을 같이 적어서 사용해야한다.
		// ex) sec06.exam02.pack1.Receipt_2 = new sec06.exam02.pack1.Receipt_2();
	}
}
