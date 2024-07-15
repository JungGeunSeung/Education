package sec01.exam02;

import java.util.ArrayList;
import java.util.List;

public class RemoConExam {

	public static void main(String[] args) {

		Television tv = new Television();
		Audio audio = new Audio();
		
		tv.turnOn();
		tv.setVolume(5);
		tv.turnOff();
		
		audio.turnOn();
		audio.setVolume(5);
		audio.turnOff();
		
		audio.setVolume(15);
		
		RemoteControl rc;
		rc = new Audio();
		rc = new Television();
		
		List list = new ArrayList();
		
		
	}

}
