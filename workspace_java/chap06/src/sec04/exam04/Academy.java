package sec04.exam04;

public class Academy {

	// 학원 클래스 만들기
	// 학원 이름 : 천안
	// 필드 배열[10] 또는 ArrayList

	// 생성자
	// 학원이름 필수

	// 메소드
	// join(학원생) : 필드에 등록
	// viewList() : 등록된 학원생들의 이름과 나이

	String name;
	Student[] student = new Student[10];

	Academy(String academyName) {
		name = academyName;
	}

	void join(Student aList) {
		for (int i = 0; i < student.length; i++) {
			if (student[i] == null) {
				student[i] = aList;
				break;
			}
		}
	}

	void viewList(Academy x) {
		System.out.println("학원이름 : " + x.name);
		System.out.println("============================");
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) {
				System.out.println(student[i]);
			}
		}
	}


}
