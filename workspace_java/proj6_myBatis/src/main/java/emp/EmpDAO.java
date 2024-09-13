package emp;

import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class EmpDAO {
	private  SqlSessionFactory sqlMapper = null;
	
	// SqlMapConfig 를 읽어오는 소스
    public  SqlSessionFactory getInstance() {
        if(sqlMapper == null) {
            try {
                String res = "mybatis/SqlMapConfig.xml";
                Reader reader = Resources.getResourceAsReader(res);

                SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
                sqlMapper = ssfb.build(reader);

                reader.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        return sqlMapper;
    }
    
    public List<EmpDTO> selectEmp () {
    	List list = null;
    	
    	// SqlMapConfig.xml을 읽어옴
    	sqlMapper = getInstance();
    	
    	if(sqlMapper != null) {
    	// DB 접속
    	// 유 접속 시도
    	SqlSession sqlSession = sqlMapper.openSession();
    	
    	// emp.xml에 있는 mapper의 주소를 namespace.id(select의 id) 로 적어준다.
    	// selectList 는 알아서 list로 돌려주기 때문에 while 이나 for문이 필요 없다.
    	list = sqlSession.selectList("mapper.emp.selectAllEmp");
    	System.out.println("list.size : " + list.size());
    	} else {
    		System.out.println("DB 접속 실패");
    	}
    	return list;
    }
    
    public List selectAllEmpMap() {
    	List list = null;
    	
    	sqlMapper = getInstance();
    	
    	if(sqlMapper != null) {
        	SqlSession sqlSession = sqlMapper.openSession();
        	
        	list = sqlSession.selectList("mapper.emp.selectAllEmpMap");
        	System.out.println("list.size : " + list.size());
        	} else {
        		System.out.println("DB 접속 실패");
        	}
    	
    	
    	return list;
    }
    
    public EmpDTO selectOneEmp () {
    	EmpDTO dto = null;
    	
    	sqlMapper = getInstance();
    	
    	if(sqlMapper != null) {
        	SqlSession sqlSession = sqlMapper.openSession();
        	
        	try {
        		dto = (EmpDTO) sqlSession.selectOne("mapper.emp.selectOneEmp");
        		
        	}catch (Exception e) {
        		e.printStackTrace();
        	}
        	
        	System.out.println("dto : " + dto);
        	} else {
        		System.out.println("DB 접속 실패");
        	}
    	
    	
    	return dto;
    }
    
    public int totalEmp () {
    	int total = -1;
    	
    	sqlMapper = getInstance();
    	
    	if(sqlMapper != null) {
    		SqlSession sqlSession = sqlMapper.openSession();
    		
    		try {
    			total = (int) sqlSession.selectOne("mapper.emp.selectTotalEmp");
    			
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
    		
    		System.out.println("DAO의 total : " + total);
    	} else {
    		System.out.println("DB 접속 실패");
    	}
    	
    	
    	return total;
    }
    
    public String selectEnameEmp () {
    	String str = null;
    	
    	sqlMapper = getInstance();
    	
    	if(sqlMapper != null) {
    		SqlSession sqlSession = sqlMapper.openSession();
    		
    		try {
    			str = sqlSession.selectOne("mapper.emp.selectStrEmp");
    			
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
    		
    	} else {
    		System.out.println("DB 접속 실패");
    	}
    	
    	
    	return str;
    }
    
    public int updateEmp (EmpDTO dto) {
    	int result = -1;
    	
    	sqlMapper = getInstance();
    	
    	if(sqlMapper != null) {
    		// 자동 커밋 : sqlMapper.openSession();
    		// 수동 커밋 : sqlMapper.openSession(false);
    		SqlSession sqlSession = sqlMapper.openSession(true);
    		
    		try {
    			
    			result = (int) sqlSession.update("mapper.emp.updateEmp", dto);
//    			sqlSession.commit();
    			
    		}catch (Exception e) {
    			
    			e.printStackTrace();
//    			sqlSession.rollback();
    			
    		} finally {
        		sqlSession.close();
        	}
    		
    	} else {
    		System.out.println("DB 접속 실패");
    	} 
    	
    	
    	return result;
    }
    
    public EmpDTO selectEmpByEname (String ename) {
    	EmpDTO dto = null;
    	
    	sqlMapper = getInstance();
    	
    	if(sqlMapper != null) {
    		SqlSession sqlSession = sqlMapper.openSession();
    		
    		try {
    			dto = sqlSession.selectOne("mapper.emp.selectEmpByEname", ename);
    			
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
    		
    	} else {
    		System.out.println("DB 접속 실패");
    	}
    	
    	
    	return dto;
    }
}
