package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutPutExam {

	public static void main(String[] args) {
		
		String path = "c:\\temp";
		String filename = "test.txt";
		
		OutputStream os = null;
		
		try { // 에러가 발생해서 내가 받아서 또 throw 할지 처리할지 고를수 있다.
			// 스트림 열기
			os = new FileOutputStream(path + "\\" + filename); // catch (FileNotFoundException e)
			
			String data = "abc\n한글\n123";
			
			byte[] datas = data.getBytes(); // String이 바이트 배열로 바뀐다.
			// 스트림 쓰기
			os.write(datas); // catch (IOException e)
			// 남은 byte 내보내기
			os.flush();
			// 스트림 닫기
//			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close(); // try문에 close가 에러가 발생할수 있으니, finally안에 써준다. os는 지역변수이기 때문에, try문 밖에다 뺐다.
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		// try 의 다른용법 좀더 편한 방법
		// try-with-resources
		// () 안에 AutoClosable 인터페이스를 구현한 클래스를 선언하면 알아서 close() 가 실행된다.
		try (OutputStream os2 = new FileOutputStream(path + "\\" + "test2.txt");) {
			String data = "abc\n한글\n123";
			
			byte[] datas = data.getBytes(); // String이 바이트 배열로 바뀐다.
			// 스트림 쓰기
			os2.write(datas); // catch (IOException e)
			// 남은 byte 내보내기
			os2.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
