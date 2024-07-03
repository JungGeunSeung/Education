package traning;

import java.util.Scanner;

// 전원 상태 저장 필요
// 전원 켜기 끄기
// -각각 전원 상태 값을 변경
// 약풍, 강풍
public class Fan {
	int powerOn = 0;
	
	void fan(int x, int y) {
		powerOn = x;
		int wind = y;
		if( powerOn == 1 ) {
			System.out.println("전원을 킵니다.");
		} else if ( powerOn == 0 ) {
			System.out.println("전원을 끕니다.");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
		if (powerOn == 1 && wind > 0) {
			System.out.println("풍속을 "+ wind +"으로 설정합니다.");
		} else if ( powerOn == 1 && wind <= 0 ) {
			System.out.println("풍속의 설정이 잘못되었습니다.");
		} else {
			System.out.println("전원이 꺼져있어 풍속 변경이 불가능 합니다.");
		}
	}
	
	
	
	
	
	
	
}
