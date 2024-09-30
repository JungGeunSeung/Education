package file.download;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/download.do")
public class FileDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//파일 이름을 파라메터로 받을수 있다.
		String fileName = request.getParameter("fileName");
		// 파일 경로를 파악하여 file 클래스타입에 변수에 저장
		File downfile = new File("D:\\workspace\\temp\\upload\\" + fileName);
	
		
		// 브라우저 캐시를 사용하지 않도록 설정한다.
		response.setHeader("Cache-Control", "no-cache");
		// 현재 응답이 첨부파일이라는걸 알려준다.
        response.addHeader("Content-disposition", "attachment; fileName="+ fileName);
		
       
        // 내 PC 에 있는 파일을 읽는 흐름을 연다.
		FileInputStream fis = new FileInputStream(downfile);
		// 흐름에서 자바 메모리로 담을 배열의 크기 설정
		byte[] buf = new byte[1024 * 1]; // ★실무에서는 보통 8kB 정도이다.
		
		// 브라우저로 내보낼 수 있는 흐름을 열어서 준비
		OutputStream os = response.getOutputStream();
		
		while(true) {
			
			// 파일에서 바가지 크기만큼 읽어서 바가지에 담아둔다.
			// 그리고 읽은 만큼 돌려준다
			int count = fis.read(buf);
			
			// 읽을게 없으면 -1
			// 반복문 종료
			if(count == -1) {
				break;
			}
			
			// 내보내는 흐름에 바가지의 내용을 보낸다
			// 첫번째 전달인자 : 내보내는 내용
			// 두번째 전달인자 : 바가지 처음부터
			// 세번째 전달인자 : 읽은 만큼
			os.write(buf, 0, count);
		}
		
		
		os.close();
		fis.close();
		
		
	}

}
