package org.zerock.w1.todo.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;

@WebServlet("/db")
public class DbOneController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("DB doGet 실행");
		
		
		String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe";
        String user = "scott2_5";
        String password = "tiger";
        
        // 시스템에 현재시간게임
        long start = System.currentTimeMillis();
        
        try {
        	// Class.forName : String을 이용해서 class를 생성한다
        	// 드라이버 : 서로 다른 것들 (java, oracle)이 소통 할 수 있게 하는 것
        	// 오라클 드라이버 로딩
        	Class.forName(driver);
        	
        	// DB 접속
        	// DriverManager.getConnection : 1 - 주소, 2 - 아이디, 3- 비밀번호
        	Connection con = DriverManager.getConnection(url, user, password);
        	
        	// SQL 준비
        	String query = "select * from tbl_todo where";
        	// 오라클 언어로 바꿔주는 함수
        	PreparedStatement ps = con.prepareStatement(query);
        	
        	// SQL 실행 및 결과 확보
        	ResultSet rs = ps.executeQuery();
        	// ResultSet 에 테이블의 모든 select 가 들어가 있다.
        	
        	// rs.next() : 다음줄이 있는가? true/false로 리턴됨.
        	// next()가 실행된 이후에는 rs가 한 줄로 바뀜
        	List<TodoDTO> list = new ArrayList<TodoDTO>();
        	while(rs.next()) {
        		// 전달인자로 컬럼명을 적고 그 내용을 형변환 해서 가지고 온다.
        		int tno = rs.getInt("tno");
        		String title = rs.getString("title");
        		String finished = rs.getString("finished");
        		LocalDate duedate = rs.getDate("duedate").toLocalDate();
        		
        		
        		TodoDTO dto = new TodoDTO();
        		dto.setTno(tno);
        		dto.setTitle(title);
        		dto.setDueDate(duedate);
        		dto.setFinished( finished.equals("Y") ? true : false );
        	
        		list.add(dto);
        	}
        	for(int i=0; i<list.size(); i++) {
        		TodoDTO dto2 = list.get(i);
        		response.getWriter().println(dto2.getTno() + "," + dto2.getTitle() + "," + dto2.getDueDate() + "," + dto2.isFinished());
        	}
        	
        	rs.close();
        	ps.close();
        	con.close();
        	
        } catch (Exception e) {
        	e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("걸린시간 : " + (end - start));
	}

}
