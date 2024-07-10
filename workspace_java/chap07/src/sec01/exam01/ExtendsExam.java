package sec01.exam01;

public class ExtendsExam {

	public static void main(String[] args) {

		Child c = new Child();
		
		c.printName();
		System.out.println("c.name : "+c.name);
		String str = c.getName();
		System.out.println("str : "+str);
		
		c.setName("자식이 보낸 이름");
		System.out.println("c.name : "+c.name);
		
		
		
		
		
	}

}
