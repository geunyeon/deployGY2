package com.yedam.app.emp.service;

import java.util.Date; 

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmpVO {
	
	int employeeId;
	String firstName;
	String lastName;
	String email;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	Date hireDate;
	// date 기본 출력 포맷 ? yyyy/MM/dd
	
	String jobId;
	int departmentId;
	
}
