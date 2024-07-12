package sec02.exam01_Promotion;

public class AnimalExam {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		
		Animal adog = new Dog();
		Animal acat = new Cat();
//		adog = acat; // 같은 Animal 타입이다.
		
		adog.sound(); // 위에서 adog변수는 dog클래스로 형변환하여 Animal타입이 됐기 때문에 
					  // Dog 클래스에서 제정의한 sound는 Animal 클래스에 있는 sound와 다르기 때문에 Dog클래스에 sound가 호출된다.
		acat.sound();
		
		dog.walk(); // 타입변환 하지 않은 dog은 dog에만 있는 메소드 walk를 쓴다.
		cat.catpunch(); // 타입변환 하지 않은 cat은 cat에만 있는 메소드 catpunch를 쓴다.
		
		// 즉 형변환 하는 이유는 자식 객체가 부모타입으로 형변환 할때 자식 객체만 가지고 있는걸 다 버리고
		// 새로운 부모타입의 객체를 생성해서 override한게 있으면 이 객체는 자식이 override 한 메소드로 바뀌어 있는다.
	}
	
}
