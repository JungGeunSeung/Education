package human.class1.file;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class FileController {
	
	@RequestMapping("uploadform")
	public String uploadform() {
		
		return "uploadForm";
	}
	
	@RequestMapping("upload")
	public String upload(MultipartHttpServletRequest req) {
		
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		System.out.println("title : " + title);
		System.out.println("content : " + content);
		
		// 파일을 담을수 있는 클래스
		MultipartFile mf = req.getFile("file1");
		
		
		long filesize = mf.getSize();
		System.out.println("filesize : " + filesize);
		
		String fileName = mf.getOriginalFilename();
		System.out.println("fileName : " + fileName);
		
		
		try {
			// 저장할 경로
			String path = "C:\\Users\\bijou\\Documents\\Education\\temp\\upload\\"; 
			String safeFileName = path + System.currentTimeMillis() + "_" + fileName;
			File file = new File (safeFileName);
			mf.transferTo(file);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "uploadForm";
	}
	
	// 다중 파일 업로드 하는법
	@RequestMapping("uploads")
	public String uploads(MultipartHttpServletRequest req) {
		
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		System.out.println("title : " + title);
		System.out.println("content : " + content);
		
		// 파일을 담을수 있는 클래스
//		MultipartFile mf = req.getFile("file1");
		List<MultipartFile> fileList = req.getFiles("file1");
		
		for (MultipartFile mf : fileList) {
			long filesize = mf.getSize();
			System.out.println("filesize : " + filesize);
			
			String fileName = mf.getOriginalFilename();
			System.out.println("fileName : " + fileName);
			try {
				// 저장할 경로
				String path = "C:\\Users\\bijou\\Documents\\Education\\temp\\upload\\"; 
				String safeFileName = path + System.currentTimeMillis() + "_" + fileName;
				File file = new File (safeFileName);
				mf.transferTo(file);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "redirect:uploadform";
	}
}
