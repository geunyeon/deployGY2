package com.yedam.app.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;

@Controller
public class EmpController {

	//경로 등록 따로 겟포스트방식 설정안해줘도됨
	// 컨트롤러 = 어느페이지에 보여줄건지만 정해줌.
	// 서비스 = 다양한 기능
//	@RequestMapping,@GetMapping
	
	@Autowired
	EmpService empService;
	
	@RequestMapping(value="/empList", method=RequestMethod.GET)
//	@GetMapping("empList")
	public String empAllList(Model model) {
		model.addAttribute("empList",empService.getAllList());
		return "empList";
	}
	
	@GetMapping("/empInsert")
	public String inputEmpInfo() {
		return "empInsert";
	}
	@PostMapping("/empInsert")
	public String inputEmpProcess(EmpVO empVO) {
		//name을 필드로 가지는 VO를 매개변수로 등록하면 자동으로 파라미터 설정
		empService.insertEmpInfo(empVO);
		
		
		//return redirect -> 경로를 설정
		return "redirect:empList";
	}
	
}
