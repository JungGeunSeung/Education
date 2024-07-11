package quiz;

public class TransExam {

	public static void main(String[] args) {

		DictionaryEnglish en = new DictionaryEnglish();
		DictionaryJapanese jp = new DictionaryJapanese();
		
		String en1 = en.trans("사랑");
		System.out.println("사랑 "+en1);
		
		String en2 = en.trans("우정");
		System.out.println("우정 "+en2);
		
		String en3 = en.trans("분노");
		System.out.println("분노 "+en3);
		
		String en4 = en.trans("슬픔");
		System.out.println("슬픔 "+en4);

		String en5 = en.trans("단어");
		System.out.println("단어 "+en5);
		
		System.out.println("--------------------------");
		String jp1 = jp.trans("사랑");
		System.out.println("사랑 "+jp1);
		
		String jp2 = jp.trans("우정");
		System.out.println("우정 "+jp2);
		
		String jp3 = jp.trans("분노");
		System.out.println("분노 "+jp3);
		
		String jp4 = jp.trans("슬픔");
		System.out.println("슬픔 "+jp4);
		
		String jp5 = jp.trans("단어");
		System.out.println("단어 "+jp5);
	}

}
