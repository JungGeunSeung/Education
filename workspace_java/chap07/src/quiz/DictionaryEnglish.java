package quiz;

public class DictionaryEnglish {

	// 전달인자로 단어를 받으면 해당하는 단어의 번역을 출력
	// translate(전달인자)

	String[] korean = new String[] { "사랑", "우정", "분노", "슬픔" };
	String[] english = new String[] { "love", "friendship", "angry", "sad" };
	

	String trans(String word) {
		for (int i = 0; i < korean.length; i++) {
			if (word.equals(korean[i])) {
				return english[i];
			}
		}
		return "해당 단어가 없음";

	}

}
