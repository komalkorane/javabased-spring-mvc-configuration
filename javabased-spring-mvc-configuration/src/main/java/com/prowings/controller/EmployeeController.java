package com.prowings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prowings.model.Employee;
import com.prowings.service.EmployeeService;

@Controller
public class EmployeeController {
	
	
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/createNewEmployee", method = RequestMethod.POST)
	public String createEmployee(@ModelAttribute("employee") Employee employee) {

		employeeService.createEmployee(employee);
		
		return "employeeView";
	}

}
