package sec01.exam01;

public class Parent {
	//필드 ////////////////////////////////////////////////////////
	String name = "Parent의 name";
	
	
	
	//생성자 /////////////////////////////////////////////////////
//	Parent () {
//		System.out.println("Parent 생성자 실행");
//	}
//	
//	Parent (String s) {
//		System.out.println("Parent 생성자 오버로딩 실행");
//		System.out.println(s);
//	}
	
	
	//메소드 ////////////////////////////////////////////////////
	String getName() {
		System.out.println("parent의 getName 실행");
		return this.name;
	}
	
	void setName (String name) {
		this.name = name;
	}
	
}
