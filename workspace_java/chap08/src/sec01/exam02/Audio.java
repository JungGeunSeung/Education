package sec01.exam02;

public class Audio implements RemoteControl {

	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			System.out.println("설정 가능한 최대 소리는 " + RemoteControl.MAX_VOLUME + " 입니다.");
			volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
			System.out.println("설정 가능한 최소 소리는 " + RemoteControl.MIN_VOLUME + " 입니다.");
		}
		this.volume = volume;
		System.out.println("현재 소리 볼륨 : " + this.volume);
		
	}

}
