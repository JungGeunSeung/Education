package emp2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import emp2.dto.EmpDTO;

public class EmpPageDAO {
	
	public List selectEmpPage(int start, int end) {
		List list = new ArrayList();
		
		try {
			Context ctx= new InitialContext();
            DataSource dataSource =(DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");

            Connection con = dataSource.getConnection();
            
            String query =  " select * ";
		            query += " from ( ";
		            query += "    select rownum rnum, empno, ename, job, mgr, hiredate, sal, comm, deptno";
		            query += "    from ( ";
		            query += "        select empno, ename, job, mgr, hiredate, sal, comm, deptno ";
		            query += "        from emp2 ";
		            query += "        order by ename ";
		            query += "    ) ";
		            query += " ) ";
		            query += " where rnum >= ? and rnum <= ?";
            
		    PreparedStatement ps = new LoggableStatement(con, query);
//		    PreparedStatement ps = con.prepareStatement(query);
		    
		    System.out.println(((LoggableStatement)ps).getQueryString());
		    
		    ps.setInt(1, start);
		    ps.setInt(2, end);
		    
		    ResultSet rs = ps.executeQuery();
		    
		    while( rs.next() ) {
                EmpDTO empDTO = new EmpDTO();

                int empno = rs.getInt("empno");
                empDTO.setEmpno(empno);

                String ename = rs.getString("ename");
                empDTO.setEname(ename);

                empDTO.setJob( rs.getString("job") );
                empDTO.setHireDate( rs.getDate("hiredate") );
                empDTO.setRnum(rs.getInt("rnum"));
                empDTO.setDeptno(rs.getInt("deptno"));
                empDTO.setSal(rs.getInt("sal"));
                empDTO.setComm(rs.getInt("comm"));
                empDTO.setMgr(rs.getInt("mgr"));
                

                list.add(empDTO);
            }
            
		    rs.close();
            ps.close();
            con.close();
		    
		    
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return list;
	}
	
	public int totalEmpPage() {
		
		int result = -1;
		
		try {
			Context ctx= new InitialContext();
            DataSource dataSource =(DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");

            Connection con = dataSource.getConnection();
            
            String query =  "select count(*) cnt from emp2 ";
            
		    PreparedStatement ps = new LoggableStatement(con, query);
		    
		    System.out.println(((LoggableStatement)ps).getQueryString());
		    
		    ResultSet rs = ps.executeQuery();
		    
		    while( rs.next() ) {
                result = rs.getInt("cnt");
            }
            
		    rs.close();
            ps.close();
            con.close();
		    
		    
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}
