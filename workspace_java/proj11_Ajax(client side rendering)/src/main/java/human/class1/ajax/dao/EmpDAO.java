package human.class1.ajax.dao;

import java.util.List;

import human.class1.ajax.dto.EmpDTO;

public interface EmpDAO {
	public List<EmpDTO> selectEmp();
	public int updateEmp(EmpDTO dto);
	public int insertEmp(EmpDTO dto);
	public int deleteEmp(EmpDTO dto);
}
