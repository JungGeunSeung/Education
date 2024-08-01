package sec01.exam13;

public class StringExam {

	public static void main(String[] args) {

		String s1 = "영일이삼사오육칠팔구";
		
		// .charAt() : 전달인자로 int값을 주면 해당 변수의 index번호순으로 String의 값을 리턴한다.
		// char 타입으로 받을수 있다.
		char c = s1.charAt(3);
		System.out.println("c : " + c);
		
		// .length() : String의 문자 길이를 알려준다.
		int i = s1.length();
		System.out.println("길이 : " + i);
		
		// .indexOf() : 전달인자가 있으면 해당하는 위치의 인덱스번호를 리턴 (여러개 있으면 맨처음 나온걸로 된다.)
		// 만약 값이 없으면 -1이 리턴된다.
		int i2 = s1.indexOf("이");
		System.out.println("i2 : " + i2);
		
		System.out.println("해당하는 글자가 없으면 : " + s1.indexOf("아"));
		
		i2 = s1.indexOf("사오");
		System.out.println("i2 : " + i2);
		
		String blog = "blog.naver.com";
		String cafe = "cafe.naver.com";
		
		if (blog.indexOf("blog") >= 0) {
			System.out.println("blog는 블로그 주소입니다.");
		} else {
			System.out.println("blog는 블로그 주소가 아닙니다.");
		}
		
		if (cafe.indexOf("blog") >= 0) {
			System.out.println("cafe는 블로그 주소입니다.");
		} else {
			System.out.println("cafe는 블로그 주소가 아닙니다.");
		}
		
		// 이메일주소를 판단하는 문제
		
		String email = "abcd@naver.com";
		String notemail = "abcdef";
		
		if (email.indexOf("@") >= 0 && email.indexOf(".") >= 0 ) {
			System.out.println("이메일인증 완료");
		} else {
			System.out.println("정확한 이메일을 적어주세요.");
		}

		if (notemail.indexOf("@") >= 0 && notemail.indexOf(".") >= 0 ) {
			System.out.println("이메일인증 완료");
		} else {
			System.out.println("정확한 이메일을 적어주세요.");
		}
		
		// indexOf 구현
		char c2 = 'd';
		boolean flag = false;
		for (int i3=0; i3<email.length(); i3++) {
			char c3 = email.charAt(i3);
			if (c3 == c2) {
				flag = true;
				System.out.println(i3);
				break;
			}
			
			}
		if (!flag) {
			System.out.println(-1);
		}
		
		// .replace() : 두개의 전달인자를 받고, 첫번째 전달인자의 내용을 두번째 전달인자로 바꿔준다. (전부바꿔준다)
		System.out.println(s1.replace("삼사", "34"));
		
		// .substring() : 전달인자 한개 또는 두개를 받는데 한개를 받을시 그 위치에 있는 String을 마지막 index까지 리턴한다.
		// 전달인자가 두개 일 경우, 첫번째는 시작 인덱스, 두번째는 받은 값 인덱스 바로 앞 까지 의 String 리턴한다.
		// 두번째 전달인자가 길이보다 크면 StringIndexOutOfBoundsException 발생
		String s4 = s1.substring(1, 4);
		System.out.println("s4 : " + s4);
		
		String ssn = "123456-1234567";
		
		String ssn1 = ssn.substring(7, 8);
		if (ssn1.equals("1") || ssn1.equals("3")) {
			System.out.println("남성의 주민번호");
		} else {
			System.out.println("여성의 주민번호");
		}
		
		// .trim() : 앞뒤에 공백을 제거해준다. (중간은 불가)
		String oldstr = "  글  씨   띄어쓰기  ";
		String newstr = oldstr.trim();
		System.out.println(newstr);
		
		
		// split() : 전달인자로 된 문자열을 기준으로 배열로 리턴해준다.
		String menu = "돼지국밥,마라탕,제육,냉면";
		String[] menu2 = menu.split(",");
		for(String m : menu2) {
			System.out.println(m);
		}
		
		// 정규표현식으로 글씨를 잘라서 배열로 만들어준다.
		// . comma는 정규 표현식에서 사용하는 예약문자라서 [.] \\. 으로 써줘야 한다.
		String[] urls = blog.split("[.]");
		System.out.println(urls.length);
		System.out.println(urls[1]);
		
		String search = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=이케아";
		
		// 이렇게 하는건가?
		String params = search.replace("&","=");
		String[] params2 = params.split("=");
		for (int j = 0; j < params2.length; j++) {
			System.out.println(params2[j]);
		}
		
		
		// 이렇게 하는건가? 2
		String[] params3 = search.split("&");
		for (int j = 0; j < params3.length; j++) {
			String params4 = params3[j].replace("=", ":");
			System.out.println(params4);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
