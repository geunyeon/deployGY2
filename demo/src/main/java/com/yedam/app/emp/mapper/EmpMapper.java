package com.yedam.app.emp.mapper;

import java.util.List;

import com.yedam.app.emp.service.EmpVO;

public interface EmpMapper {
	
	//전체조회
	public List<EmpVO> selectAllEmpList();
	
	public EmpVO selectEmpInfo(int empId);
	
	public int insertEmpInfo(EmpVO empVO);
}
