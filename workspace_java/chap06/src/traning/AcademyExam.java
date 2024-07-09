package traning;

public class AcademyExam {

	public static void main(String[] args) {

		Academy acade1 = new Academy("천안 휴먼교육센터");
		Student s1 = new Student("정근승", 25);
		Student s2 = new Student("조민정", 21);
		Student s3 = new Student("현준수", 26);
		Student s4 = new Student("이정은", 26);
		Student s5 = new Student("이제섭", 30);
		Student s6 = new Student("김아영", 27);
		Student s7 = new Student("박규태", 30);
		Student s8 = new Student("김소원", 32);
		Student s9 = new Student("안동현", 30);
		Student s10 = new Student("김성령", 25);
		Student s11 = new Student("맹채윤", 25);
		
		
		acade1.join(s1);
		acade1.join(s2);
		acade1.join(s3);
		acade1.join(s4);
		acade1.join(s5);
		acade1.join(s6);
		acade1.join(s7);
		acade1.join(s8);
		acade1.join(s9);
		acade1.join(s10);
		acade1.join(s11);
		
		
		acade1.viewList(acade1);
		
		System.out.println(acade1.student(0));
	
	}
	
}
