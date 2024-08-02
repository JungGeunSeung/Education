package sec01.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputExam {

	public static void main(String[] args) {

		String path = "c:\\temp\\test.txt";
		
		try (InputStream is = new FileInputStream(path);) {
			
			//bufer의 크기를 설정
//			int BUFER = 10;
			int BUFER = 1024 * 8;
			byte[] datas = new byte[BUFER];
			
			int result = 0; // 데이터를 읽은 횟수
			String data = ""; // 실제 읽은 데이터가 누적되게 하려 만든 변수
			
			// read : 읽은 바이트를 돌려준다. 없으면 -1이 된다.
			// result = is.read(datas);
//			while (result != -1) {
//				result = is.read(datas);
//				if (result != -1) {
//					data += new String(datas, 0 , result);
//					System.out.println(data);
//				}
//			}
//			System.out.println("------------");
//			System.out.println(data);
			
			// 위에 while을 좀더 간단하게 쓴 방법
			while ((result = is.read(datas)) != -1) {
				data += new String(datas, 0 , result);
			}
			System.out.println("------------");
			System.out.println(data);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
