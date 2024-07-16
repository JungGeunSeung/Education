package chap09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderExam {

	public static void main(String[] args) {

		MemberDTO m1 = new MemberDTO();
		MemberDTO m2 = new MemberDTO();
		MemberDTO m3 = new MemberDTO();
		
		m1.setName("정근승");
		m1.setAge(25);
		m2.setName("조민정");
		m2.setAge(21);
		m3.setName("현준수");
		m3.setAge(26);

		// 하나하나 비교하는 메소드를 만듬
		MemberDTO cm1 = compareMemberDTO(m1, m2);
		MemberDTO cm2 = compareMemberDTO(cm1, m3);
		System.out.println(cm2);
		
		
		// 지금부터 생성된 객체들을 나이를 기준으로 정렬하여 출력하는 방법
		List list = new ArrayList();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		// 익명객체 : 상속이나 구현받은 클래스를 이름없이 바로 부모 타입이나 동일 타입의 변수에 담기 위해 사용 되는 객체이다.
		// 자바 스크립트로 따지면, addEventlisnner('click', function() {})이나 let a = () => {} 와 같다.
		// 익명객체 선언 방법
		// 이름이 없는 클래스를 선언 new () {}
		// new와 () 사이에 이 클래스가 상속받을 클래스나 인터페이스를 적어주고,
		// 그 클래스를 담을 같은타입이나 부모타입의 변수를 만들어서 담아 준다.
		Comparator comp = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				MemberDTO dto1 = (MemberDTO) o1;
				MemberDTO dto2 = (MemberDTO) o2;
				return dto1.getAge() - dto2.getAge();
			}
		};
		
		// Collections 라는 클래스가 있고, 거기에 static 으로 지원하는 메소드 sort가 있다.
		// 첫번째 전달인자로, 정렬할 ArrayList의 변수를 적어주고, 위에 만들어둔 익명객체 메소드를 실행하는 변수를 두번째 전달인자로 적어준다.
		Collections.sort(list, comp);
		System.out.println(list);
		
	}

	/** 기능 : MemberDTO 의 나이를 비교하여, 둘중 큰 값을 돌려주는 메소드
	 *  @param MemberDTO, MemberDTO
	 *  @return MemberDTO
	 * */
	static MemberDTO compareMemberDTO (MemberDTO dto1, MemberDTO dto2) {
		if (dto1.getAge() > dto2.getAge()) {
			return dto1;
		} else if (dto1.getAge() < dto2.getAge()) {
			return dto2;
		} else {
			System.out.println("둘의 나이값이 같습니다. 따라서 첫번째 전달인자를 다시 돌려드립니다.");
			return dto1;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
