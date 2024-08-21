package org.zerock.w1.todo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.zerock.w1.todo.dto.TodoDTO;

public class TodoDAO {
	
	private Connection getConnection () {
		
		Connection con = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe";
        String user = "scott2_5";
        String password = "tiger";
        
        try {
        	Class.forName(driver);
        	
        	con = DriverManager.getConnection(url, user, password);
        	} catch(Exception e) {
        		e.printStackTrace();
        	}
		return con;
	}

	public List<TodoDTO> selectAll() {
			System.out.println("DAO 실행");
			
			List<TodoDTO> list = new ArrayList<TodoDTO>();
			
			String driver = "oracle.jdbc.driver.OracleDriver";
	        String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe";
	        String user = "scott2_5";
	        String password = "tiger";
	        
	        try {
	        	Class.forName(driver);
	        	
	        	Connection con = DriverManager.getConnection(url, user, password);
	        	
	        	String query = "select * from tbl_todo order by tno asc";
	        	PreparedStatement ps = con.prepareStatement(query);
	        	
	        	ResultSet rs = ps.executeQuery();
	        	
	        	while(rs.next()) {
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
	        	
	        	rs.close();
	        	ps.close();
	        	con.close();
	        	
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
	        
	        return list;
		}
	
	public TodoDTO selectOne(int tno) {
		TodoDTO todoDTO = null;
		// DB 접속
		Connection con = getConnection();
		
		// 접속 되지 않는 다면 null 리턴하여 메소드 종료
		if(con == null) return null;
		
		try {
			
			// sql 준비
			String sql = "select * from tbl_todo where tno = ?";
		
			PreparedStatement ps = con.prepareStatement(sql);
	    	// ?를 값으로 채워줌
			// 첫번째 전달인자는 ?의 순서
			// 글씨라면 setString 알아서 ''로 감싸준다.
			ps.setInt(1, tno);
			
			// sql 실행 및 결과 확보
	    	ResultSet rs = ps.executeQuery();
	    	
	    	//결과 활용
	    	
	    	// rs.next() : 첫번째 줄
	    	if( rs.next() ) {
	    		todoDTO = new TodoDTO();
	    		todoDTO.setTno(rs.getInt("tno"));
	    		todoDTO.setTitle(rs.getString("title"));
	    		todoDTO.setDueDate( rs.getDate("duedate").toLocalDate());
	    		todoDTO.setFinished( rs.getString("finished").equals("Y") ? true : false );
	    	}	    	
	    	
    		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return todoDTO;
		
		
		
		
		
		
	}

	public int insert(TodoDTO dto) {
		
		// DB에  접속하는 메소드 만들기
		// 하지만 전에는 DB에 접속하면 끊고 다시 실행하면 다시 접속 하는 낭비적인 방법을 썼다면
		// 이번에는 connection pull 이라는 방법을 이용하여, DB에 접속상태를 유지 하는 방법을 한다.
		int result = 0;
		try {
			// Servers 폴더의 context.xml에서
			// name이 jdbc/oracle인 resource를 가져와서 DataSource로 저장하기
			Context ctx = new InitialContext();
            DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            // DB 접속 : 커넥션풀 사용해서
            Connection con = dataFactory.getConnection();
            
            // DB에 접속해 뭘 할 건지 변수에 담기
            String query = "INSERT INTO tbl_todo (tno, title, duedate, finished)"
            		+ "VALUES (seq_todo.NEXTVAL,?,?,?)"; // 뒤에 물음표 는 값을 넣기에는 불편하여 밑에서 넣는다
            
            // 오라클 언어로 변경하는 함수
            PreparedStatement ps = con.prepareStatement(query);
            
            // setType(0,"") : 첫번째 전달인자 - 순서, 두번째 전달인자 - 적을 데이터
            // 첫번째 전달인자로 적혀진 순서가 위에 query변수에 ? 순서로 맞춰서 들어간다.
            ps.setString(1, dto.getTitle());
            
            java.sql.Date date = Date.valueOf(dto.getDueDate());
            ps.setDate(2, date);
            
            String finished = dto.isFinished() ? "Y" : "N";
            ps.setString(3, finished);
            
            // 테이블을 조회할땐 executeQuery() 이지만 insert는 Update 이다
            result = ps.executeUpdate();
            
            ps.close();
            con.close();
            
            
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		
		
		return result;
	}

	public int update(TodoDTO dto) {
		
		int result = 0;
		try {
			Context ctx = new InitialContext();
            DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            Connection con = dataFactory.getConnection();
            
            String query = "update tbl_todo set title=?,dueDate=?,finished=? where tno=?";
            
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1, dto.getTitle());
            
            java.sql.Date date = Date.valueOf(dto.getDueDate());
            ps.setDate(2, date);
            
            String finished = dto.isFinished() ? "Y" : "N";
            ps.setString(3, finished);
            
            int tno = dto.getTno();
            ps.setInt(4, tno);
            
            result = ps.executeUpdate();
            
            ps.close();
            con.close();
            
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int delete(int tno) {
		
		int result = 0;
		try {
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = dataFactory.getConnection();
			
			String query = "delete from tbl_todo where tno=?";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, tno);
			
			result = ps.executeUpdate();
			
			ps.close();
			con.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}













