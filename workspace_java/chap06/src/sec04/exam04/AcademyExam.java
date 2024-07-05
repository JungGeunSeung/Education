package sec04.exam04;

public class AcademyExam {

	public static void main(String[] args) {

		Academy acade1 = new Academy("천안 휴먼교육센터");
		Student s1 = new Student("정근승", 25);
		Student s2 = new Student("조민정", 21);
		Student s3 = new Student("현준수", 26);
		Student s4 = new Student("이정은", 26);
		
		acade1.join(s1);
		acade1.join(s2);
		acade1.join(s3);
		acade1.join(s4);
		
		acade1.viewList(acade1);
	}
	
}
