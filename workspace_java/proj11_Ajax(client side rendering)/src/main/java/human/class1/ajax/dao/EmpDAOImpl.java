package human.class1.ajax.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import human.class1.ajax.dto.EmpDTO;

@Repository
public class EmpDAOImpl implements EmpDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	@Autowired
	EmpDTO empDTO;

	@Override
	public List<EmpDTO> selectEmp() {
		// 모든 리스트 출력
		List<EmpDTO> result = sqlSession.selectList("mapper.ajax.selectEmp");
		return result;
	}
	
	@Override
	public int updateEmp(EmpDTO dto) {
		// 수정
		this.empDTO = dto;
		int result = -1;
		result = sqlSession.update("mapper.ajax.updateEmp", empDTO);
		return result;
		
	}
	
	@Override
	public int deleteEmp(EmpDTO dto) {
		// 삭제
		this.empDTO = dto;
		int result = -1;
		result = sqlSession.delete("mapper.ajax.deleteEmp", empDTO);
		
		return result;
		
	}
	
	@Override
	public int insertEmp(EmpDTO dto) {
		// 추가
		int result = -1;
		this.empDTO = dto;
		result = sqlSession.insert("mapper.ajax.insertEmp", empDTO);
		
		return result;
		
	}
}
