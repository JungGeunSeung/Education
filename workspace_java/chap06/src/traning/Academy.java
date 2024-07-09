package traning;

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
	int idx = 0;

	Academy(String academyName) {
		this.name = academyName;
	}

	void join(Student aList) {
		for (int i = 0; i < student.length; i++) {
			if (student[i] == null) {
				student[i] = aList;
				System.out.println(aList.name + "을 " + this.name + "에 추가합니다.");
				break;
			}
		}
		
		// 배열의 길이를 넘지 않도록
		if (idx < this.student.length) {
			this.student[idx++] = aList;
		} else {
			System.out.println(this.name + "의 등록 가능한 학생수를 넘었습니다.");
		}
	}

	void viewList(Academy x) {
		System.out.println("학원이름 : " + x.name);
		System.out.println("============================");
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) {
				System.out.println(i+ ". " + student[i]);
			}
		}
	}

	Student student(int idx) {
		return this.student[idx];
	}
}
