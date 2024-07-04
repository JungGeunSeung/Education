package traning;

public class Login {

	String id;
	String pw;		
	Login (String x, String y) {
		id = x;
		pw = y;
	}
	
	void comparsion (String x, String y) {
		if(x == id && y==pw) {
			System.out.println("로그인에 성공했습니다.");
		} else {
			System.out.println("로그인에 실패했습니다.");
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
