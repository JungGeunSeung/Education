package kr.or.human.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.human.dto.EmpDTO;

public interface EmpService {
	
	List<EmpDTO> listEmp();
	int updateEmp(EmpDTO dto);
	int deleteEmp(EmpDTO dto);
	int insertEmp(EmpDTO dto);
	EmpDTO listEmpOne(int empno);
}
