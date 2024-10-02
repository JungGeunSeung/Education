package human.class1.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import human.class1.ajax.dao.EmpDAOImpl;
import human.class1.ajax.dto.EmpDTO;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDAOImpl empDAO;

	public List<EmpDTO> listEmp() {

		List<EmpDTO> list = empDAO.selectEmp();
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
