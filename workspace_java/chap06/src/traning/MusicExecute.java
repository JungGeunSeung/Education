package traning;

public class MusicExecute {

	public static void main(String[] args) {

		Music play = new Music();
		
		play.change("브링방방봉", "크리피넛", "힙합", 
					"실력을 발휘하기도 전에 상대가 자빠진거 같아 ...... 더보기", 258);
		
		play.print();
		
	}

}
