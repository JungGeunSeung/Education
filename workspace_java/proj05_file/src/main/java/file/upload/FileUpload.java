package file.upload;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/upload.do") // .으로 시작하는건 중요한 의미가 있을수 있다.
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 2341123413L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String encoding = "utf-8";
		request.setCharacterEncoding(encoding);
		
		// 파일경로를 DB에다 저장하고, 실제 파일을 file에 저장한다.
		
		try {
			// File : 파일 또는 디렉토리(폴더)를 관리하는 클래스
			File currentDirPath = new File("D:\\workspace\\temp\\upload");
			
			// 파일 세팅
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setRepository(currentDirPath); // 경로를 지정한다.
			factory.setSizeThreshold(1024 * 1024); // 임시 파일의 크기를 byte단위로 설정한다. 1MB

			
			ServletFileUpload upload = new ServletFileUpload(factory);
			// 업로드 파일의 최대 크기를 지정한다.
			upload.setFileSizeMax(1024*1024*100); // 100MB
			
			// request를 분석해서
			// 요청 파라메터들을 flieitem을 뽑고 그걸 List에 담아서 돌려준다.
			List<FileItem> items = upload.parseRequest(request);
			for (int i = 0; i < items.size(); i++) {
				
				
				FileItem fileItem = (FileItem) items.get(i);

				// .isFormField() : form 요소 인지 판별하는 메소드 
				if (fileItem.isFormField()) {
					// getFieldName : 파라메터 Key
					// getString : 파라메터 value
					System.out.println(fileItem.getFieldName() + "=" + fileItem.getString(encoding));
				} else {
					// 첨부파일 영역
					// getSize : 파일의 사이즈를 구하는 메소드
					if (fileItem.getSize() > 0) {
						// getName : 업로드한 파일명을 구하는 메소드
						String fileName = fileItem.getName();

						// 파일이름이 겹치는걸 방지해 밀리초 단위의 시간을 넣어 겹치지 않게 한다.
						fileName = System.currentTimeMillis() + "_" + fileName; 
						
						
						
						
						
						
						
						// 파일명까지 경로를 쓴다.
						File uploadFile = new File(currentDirPath + "\\" + fileName);
						System.out.println(uploadFile);
						// \\ = File.separator = System.getProperty("file.separator") 이 3개를 전부 똑같이 사용가능하다.
						// File uploadFile = new File(currentDirPath + File.separator + fileName);
						// File uploadFile = new File(currentDirPath + System.getProperty("file.separator") + fileName);
						
						// 파일을 저장한다.
						fileItem.write(uploadFile);
						
					} // end if
				} // end if
			} // end for
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
