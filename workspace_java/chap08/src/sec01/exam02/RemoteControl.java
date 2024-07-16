package sec01.exam02;

public interface RemoteControl {

	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void search(String word) {
		System.out.println(word + "의 내용을 검색합니다.");
	}
}
