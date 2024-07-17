package sec01.exam01;

public class ExceptionTheory {
	public static void main(String[] args) {
		
		// 예외 : 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인해 발생하는 프로그램 오류
		// 자바는 예외가 발생할 가능성이 높은 코드를 컴파일 할때 예외 처리 유무를 확인합니다. 만약 예외 처리 코드가 없다면
		// 컴파일 되지 않는다.
		// 일반예외(Exception), 실행예외(Runtime Exception)
		
		// 예외 종류
		// NullPointerException : 참조타입이 참조하고 있는 객체가 없을때
		// ArrayIndexOutBoundsException : 배열에서 인덱스 범위를 초과할 경우
		// NumberFormatException : 문자열을 숫자로 변경할때 불가능하면 발생함
		// ClassCastException : 클래스간 타입을 변환 할수 없을때 발생함
		
		// 예외 처리 코드 작성법
		// try {
		//      예외 발생 가능 코드
		// } catch(발생하는 예외 e) {
		//      예외 처리
		// } finally { // 생략가능
		//      항상 실행;
		// }
		
		
		
	}
}
