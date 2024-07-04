package traning;

import java.util.Scanner;

public class Tv {

	Scanner scan = new Scanner(System.in);

	int power;
	int volume;
	int channel;
	boolean abc;

	Tv () {
		power = 0;
		volume = 5;
		channel = 0;
	}
	
	Tv (int x, int y, int z) {
		power = x;
		volume = y;
		channel = z;
	}
	
	
	void power(int x) {

		if (x == 1) {
			System.out.println("티비를 켭니다");
			power = 1;
		} else if (x == 0) {
			System.out.println("티비를 끕니다");
			power = 0;
		} else {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
		}
	}

	void up() {
		if (volume > 0 && volume < 10) {
			System.out.println("볼륨을 올립니다. +1");
			volume++;
			System.out.println("현재볼륨 :" + volume);
		} else if (volume == 0) {
			System.out.println("음소거");
		} else {
			System.out.println("현재 최대 볼륨입니다.");
		}
	}

	void down() {
		if (volume > 0 && volume < 10) {
			System.out.println("볼륨을 내립니다 -1");
			volume--;
			System.out.println("현재볼륨 :" + volume);
		} else if (volume == 0) {
			System.out.println("음소거");
		}

	}

	void channel(int x) {

		System.out.println("채널을 변경합니다.");
		channel = x;
		System.out.println("현재 채널 :" + channel);
	}

	void moveUp() {

		System.out.println("채널을 올립니다");
		channel++;
		System.out.println("현재 채널 :" + channel);
	}

	void moveDown() {

		System.out.println("채널을 내립니다");
		channel++;
		System.out.println("현재 채널 :" + channel);
	}

	void info() {
		System.out.println("---------------------");
		System.out.println("현재 티비 상태");
		if (power == 0) {
			System.out.println("티비 전원 : OFF");
		} else {
			System.out.println("티비 전원 : ON");
			System.out.println("볼륨 : " + volume);
			System.out.println("채널 : " + channel);
		}
	}

}
