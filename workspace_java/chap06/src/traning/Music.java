package traning;

public class Music {
	String title;
	String singer;
	String category;
	String lyrics;
	int time;
	
	void changeT (String x) {
		title = x;
	}
	
	void changeS (String x) {
		singer = x;
	}
	
	void changeC (String x) {
		category = x;
	}
	
	void changeL (String x) {
		lyrics = x;
	}
	
	void changeTime (int x) {
		time = x;
	}
	
	
	
	
	/** 첫번째 전달인자 : 제목
	 *  두번째 전달인자 : 가수명
	 *  세번째 전달인자 : 장르
	 *  네번째 전달인자 : 가사
	 *  다섯번째 전달인자 : 플레이시간
	 * */
	void change (String x, String y, String z, String t, int g) {
		changeT(x);
		changeS(y);
		changeC(z);
		changeL(t);
		changeTime(g);
	}
	
	void print () {
		System.out.println("제목 : " + title);
		System.out.println("가수 : " + singer);
		System.out.println("장르 : " + category);
		System.out.println("가사 : " + lyrics);
		System.out.println("시간 : " + time);
	}
	
	
	
	
	
	
	
	
}
