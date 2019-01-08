package com.system.wms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.wms.service.StaffLoginService;

@Controller
public class StaffController {
	@Autowired
	StaffLoginService staffService;
	
	
	@RequestMapping("hello")
	public String hello() {
		staffService.doLogin("123", "123");
		return "NewFile";
	}
}
