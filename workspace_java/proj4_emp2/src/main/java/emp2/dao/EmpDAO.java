package emp2.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


import emp2.dto.EmpDTO;

public class EmpDAO {
	
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
	
	public List selectEmp(String empno2) {
		List list = new ArrayList();
		
		try {
            Context ctx= new InitialContext();
            DataSource dataSource =(DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");

            Connection con = dataSource.getConnection();
            
            String query = "SELECT * FROM emp2";
            
            if(empno2 != null && !(empno2.equals(""))) {
            	query += "where empno= " + empno2;
            }
            
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while( rs.next() ) {
                EmpDTO empDTO = new EmpDTO();

                int empno = rs.getInt("empno");
                empDTO.setEmpno(empno);

                String ename = rs.getString("ename");
                empDTO.setEname(ename);

                empDTO.setJob( rs.getString("job") );
                empDTO.setHireDate( rs.getDate("hiredate") );


                list.add(empDTO);
            }
            
            ps.close();
            con.close();
            
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return list;
	}
	
	public EmpDTO selectOne(int empno) {
		EmpDTO empdto = null;
		Connection con = getConnection();
		
		if(con == null) return null;
		
		try {
			String sql = "select * from emp2 where empno = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, empno);
	    	ResultSet rs = ps.executeQuery();
	    	if( rs.next() ) {
	    		empdto = new EmpDTO();
	    		empdto.setEmpno(rs.getInt("empno"));
	    		empdto.setEname(rs.getString("ename"));
	    		empdto.setJob(rs.getString("job"));
	    		empdto.setMgr(rs.getInt("mgr"));
	    		empdto.setHireDate(rs.getDate("hiredate"));
	    		empdto.setComm(rs.getInt("comm"));
	    		empdto.setDeptno(rs.getInt("deptno"));
	    		empdto.setSal(rs.getInt("sal"));
	    	}	    	
    		
	    	ps.close();
            con.close();
            
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return empdto; 
	}

	
	public int insertEmp (EmpDTO dto) {
		int result = -1;
		
		try {
            Context ctx= new InitialContext();
            DataSource dataSource =(DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");

            Connection con = dataSource.getConnection();
            
            String query = "INSERT INTO emp2 (empno, ename, sal, deptno, hiredate, job) "
            		+ "VALUES (?, ?, ?, ?, sysdate, ?)";
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, dto.getEmpno());
            ps.setString(2, dto.getEname());
            ps.setInt(3, dto.getSal());
            ps.setInt(4, dto.getDeptno());
            ps.setString(5, dto.getJob());

            result = ps.executeUpdate();
            
            ps.close();
            con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return result;
	}
	
public int update(EmpDTO dto) {
		
		int result = 0;
		try {
			Context ctx = new InitialContext();
            DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            Connection con = dataFactory.getConnection();
            
            String query = "update emp2 set empno=?,ename=?,job=?, mgr=?, hiredate=?, sal=?, comm=?, deptno=? where empno=?";
            
//            PreparedStatement ps = con.prepareStatement(query);
            // 원래 실행되는걸 LoggableStatement가 가로채서
            PreparedStatement ps = new LoggableStatement(con, query);
            
            ps.setInt(1, dto.getEmpno());
            ps.setString(2, dto.getEname());
            ps.setString(3, dto.getJob());
            ps.setInt(4, dto.getMgr());
            ps.setDate(5, dto.getHireDate());
            ps.setInt(6, dto.getDeptno());
            ps.setInt(7, dto.getSal());
            ps.setInt(8, dto.getComm());
            
            // 실제 실행되는 sql를 출력해 볼 수 있다.
            System.out.println(((LoggableStatement)ps).getQueryString());
            
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
			
			String query = "delete from emp2 where empno=?";
			
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
