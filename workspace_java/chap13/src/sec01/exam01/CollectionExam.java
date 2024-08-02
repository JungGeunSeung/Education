package sec01.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionExam {

	public static void main(String[] args) {

		List list = new ArrayList();
		System.out.println( list.isEmpty() ); // 리스트가 비어있는지 확인하는 .isEmpty()
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println( list.isEmpty() );
		
		int b = (int) list.get(1); // 기본배열을 타입과 크기를 정하지만. 상위객체인 List는 모든 타입을 받을 수있기때문에
		int c = (Integer) list.get(1); // 형변환 을 해줘야 한다.
		System.out.println(b + "," + c);
		System.out.println( list.size());
		
		list.add(1, 123); // 전달인자를 두개 주면 인덱스 위치에 값을 넣는다. 따라서 기존에 있던 값들은 뒤로 밀려 인덱스
						  // 번호가 증가한다.
		
		System.out.println(list); // List도 toString이 자동으로 되어 있다.
		
		list.remove(1); // 해당 인덱스 값을 지운다. 다른 값들은 인덱스 번호가 감소 된다.
		
		// List를 초기화 하는 방법
		list.clear();
		list = new ArrayList();
		
		Map map = new HashMap(); //HashMap 이 뭐노....
		
		map.put("k1", 10);
		map.put("abc", list);
		
		int k1 = (int)map.get("k1");
		System.out.println(k1);
		
		System.out.println( map.get("k2")); // key가 존재 하지 않으면, null 하지만 null도 저장가능하다.
		
		list = new ArrayList();
		map = new HashMap();
		map.put("제목", "한숨");
		map.put("가수", "이하이");
		
		list.add(map);
		System.out.println(list);
		
		// map을 초기화 해주지 않으면, list는 힙영역을 번지를 참조하기 때문에, 얕은복사가 이루어진다.
		// 얕은복사는 call by reference, shallow copy, thin copy 라고도 불린다.
		map = new HashMap();
		map.put("제목", "소나기");
		map.put("가수", "아이오아이");
		
		list.add(map);
		System.out.println(list);
		
		// 제네릭 generic : 모든 타입(추가할 자료형)이 들어갈수 있기 때문에 제한을 하는법
		
		List<String> list2 = new ArrayList<String>(); // <> 꺽쇠 안에 타입을 적어준다. ArrayList 뒤에는 생략가능하지만 왠만하면 써준다.
		list2.add("글씨");
		list2.add(null);
		
		String str = list2.get(0); // 타입을 제한해줬기 때문에 위에서는 형변환을 했어야 했지만 제네릭을 쓰면 자동 형변환이 된다.
		// list2.get(0); 여기에서 get을 따라가보면 앞에 E 가 써져있는데 이건 클래스를 만들때 클래스이름뒤에 써줘서 타입을 동적으로 제한을 두는 역할을 한다.
		// 따라서 제네릭을 쓰는 이유중 하나이다.
		// 리턴타입이나 전달인자의 타입을 선언할때 변경할 수 있게 하는 기술
		
		// 제네릭은 클래스만 사용 가능하다
		// 제네릭에는 Int가 들어올수 없기때문에 Integer 로 적어줘야 한다.
		Map<String, Integer> map2 = new HashMap<>();
		// 타입에 제한을 두개로 두면 key에는 String, value에는 Int만 들어갈 수 있다.
		map2.put("key1", 123);
		System.out.println(map2);
		
		
		
		
		
		
	}
}
