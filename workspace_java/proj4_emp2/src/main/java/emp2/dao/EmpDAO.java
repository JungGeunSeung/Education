package emp2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import emp2.dto.EmpDTO;

public class EmpDAO {
	
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
            
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return list;
	}
}
