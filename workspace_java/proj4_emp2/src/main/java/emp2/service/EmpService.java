package emp2.service;

import java.util.List;

import emp2.dao.EmpDAO;
import emp2.dto.EmpDTO;

public class EmpService {
	
	EmpDAO empDAO = new EmpDAO();
	
	public List getEmp(String a) {
		
		List result = this.empDAO.selectEmp(a);
		
		return result;
	}
	
	public EmpDTO get(int empno) {
		EmpDTO dto1 = new EmpDTO();
		
		dto1 = this.empDAO.selectOne(empno);
		
		return dto1;
	}
	
	public int joinEmp (EmpDTO dto) {
		
		int insertCount = this.empDAO.insertEmp(dto);
		
		return insertCount;
	}
	
	public int update(EmpDTO dto) {
		EmpDAO empDAO = new EmpDAO();
		return empDAO.update(dto);
	}
	
	public int delete(int tno) {
		
		EmpDAO empDAO = new EmpDAO();
		return empDAO.delete(tno);
	}
	
	// 전달받은 EmpDTO를 DAO로 보내고, DAO가 리턴한 EmpDTO를 반환한다.
	public EmpDTO loginCheck(EmpDTO dto) {
		
		EmpDAO dao = new EmpDAO();
		EmpDTO result = dao.selectLogin(dto);
		
		return result;
	}
}
