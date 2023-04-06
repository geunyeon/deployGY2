package com.yedam.app.emp.service;

import java.util.List;

public interface EmpService {
	
	public EmpVO getEmpInfo(int empId);
	
	public int insertEmpInfo(EmpVO empVO);
	
	public List<EmpVO> getAllList();
}
