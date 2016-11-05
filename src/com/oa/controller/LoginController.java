package com.oa.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Scope("prototype")
public class LoginController {
	
	
	@RequestMapping("/checkLogin")
	public String Login(
			@RequestParam(value="student_name")String studentName,
			@RequestParam(value="student_password")String studentPassword
			){
		
		return "index";
	}
}
