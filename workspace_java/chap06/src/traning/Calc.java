package traning;

public class Calc {
	// 1. 두 수를 받아 연산 결과를 돌려줌
	// 2. 전달인자로 숫자,글씨,숫자 순으로 받고
	// 예를 들어 메소드명(3,"+",5) 로 하면 가운데 글씨를 판단해서 연산 결과를 돌려줌
	
	int plus (int x, int y) {
		return x + y;
	}
	
	int minus (int x, int y) {
		return x - y;
	}
	
	int multi (int x, int y) {
		return x * y;
	}
	
	double divide (int x, int y) {
		if (y == 0) {
			System.out.println("두번째 전달인자가 잘못 되었습니다. 다시입력해주세요");
			return 0;
		} else {
		return (double)x / y;
		}
	}
	
	int calc (int x, String y, int z) {
		if(y == "+") {
			return plus(x,z);
		} else if(y == "-") {
			return minus(x,z);
		} else if(y == "*") {
			return multi(x,z);
		} else if(y == "/") {
			return (int)divide(x,z);
		} else {
			System.out.println("문자를 인식하지 못했습니다. 다시 시도해주세요.");
			return x;
		}
	}
	
	
	
	
	
	
}
