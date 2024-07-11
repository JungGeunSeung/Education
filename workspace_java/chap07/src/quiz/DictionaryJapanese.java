package quiz;

public class DictionaryJapanese extends DictionaryEnglish {

	String[] japanese = new String[] { "愛(아이)", "友情(유조우)", "怒り(이카리)", "悲しみ(카나시미)" };
	
	@Override
	String trans(String word) {
		for (int i = 0; i < korean.length; i++) {
			if (word.equals(korean[i])) {
				return japanese[i];
			}
		}
		return "해당 단어가 없음";

	}
	
}
