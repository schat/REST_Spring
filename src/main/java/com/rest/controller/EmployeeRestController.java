package com.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.services.EmployeeService;

@Controller
public class EmployeeRestController {
	
	private EmployeeService employeeService;
	
	public void setEmployeeService(EmployeeService employeeService){
		this.employeeService = employeeService;
	}

    @RequestMapping(method = RequestMethod.GET, value = "/employee/getdetail/{empId}")
    public @ResponseBody
    String execute(@PathVariable("empId") String empId) {      

    	return employeeService.getEmpDetail(empId).toString();
    	
    }

}
