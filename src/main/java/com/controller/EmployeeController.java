package com.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.module.UserInfo;

@RestController
public class EmployeeController {
	@RequestMapping("/employee")
	public List<UserInfo> getEmpInfo() {
		return Arrays.asList(
				new UserInfo("Ajit", "Gurung", "A"),
				new UserInfo("Bipin", "Gurung", "B"),
				new UserInfo("Dipak", "Gurung", "C")
		
				);
		
		
	}
	

}
