package human.class1.ajax.service;

import java.util.List;

import human.class1.ajax.dto.EmpDTO;

public interface EmpService {
	
	public List<EmpDTO> listEmp();
	public int updateEmp(EmpDTO dto);
	public int deleteEmp(EmpDTO dto);
	public int insertEmp(EmpDTO dto);
}
