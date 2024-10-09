package kr.or.human.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.human.dao.EmpDAO;
import kr.or.human.dto.EmpDTO;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDAO empDAO;
	
	@Override
	public List<EmpDTO> listEmp() {
		List<EmpDTO> list = empDAO.selectEmp();
		return list;
	}

	@Override
	public EmpDTO listEmpOne(int empno) {
		EmpDTO list = empDAO.selectEmpOne(empno);
		return list;
	}
	
	public int updateEmp(EmpDTO dto) {
		int result = -1;
		result = empDAO.updateEmp(dto);
		return result;
	}
	
	public int deleteEmp(EmpDTO dto) {
		int result = -1;
		result = empDAO.deleteEmp(dto);
		return result;
	}
	
	public int insertEmp(EmpDTO dto) {
		int result = -1;
		result = empDAO.insertEmp(dto);
		return result;
	}

}
