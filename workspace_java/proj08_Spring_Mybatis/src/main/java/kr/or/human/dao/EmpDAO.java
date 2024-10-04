package kr.or.human.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.human.dto.EmpDTO;

// 인터페이스 안에 있는 메소드의 이름과 emp.xml안에 mapper안에 있는 태그들의 id가 같다면 자동으로 실행해준다.
@Mapper
public interface EmpDAO {
	
	List<EmpDTO> selectEmp();

	int updateEmp(EmpDTO dto);
	int deleteEmp(EmpDTO dto);
	int insertEmp(EmpDTO dto);
	EmpDTO selectEmpOne(int empno);
	
}
