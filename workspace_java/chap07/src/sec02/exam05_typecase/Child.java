package sec02.exam05_typecase;

public class Child extends Parent {

	public String field1 = "child의 field1";
	
	@Override
	public void method1 (String field1) {
		System.out.println("Child의 method1 실행");
		this.field1 = field1;
		System.out.println("전달인자 field1 : " + field1);
		System.out.println("필드 field1 : " + this.field1);
	}
	
}
