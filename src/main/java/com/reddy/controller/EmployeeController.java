package com.reddy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping(value = "/")
	public String getEmployeeDetails() {

		return "Hi Reddy..!";
	}

}
