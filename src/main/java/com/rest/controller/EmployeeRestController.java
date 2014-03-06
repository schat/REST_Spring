package com.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.domain.Employee;
import com.rest.services.EmployeeService;

@Controller
public class EmployeeRestController {
	
	private EmployeeService employeeService;
	
	public void setEmployeeService(EmployeeService employeeService){
		this.employeeService = employeeService;
	}

    @RequestMapping(method = RequestMethod.GET, value = "/employee/getdetail")
    public @ResponseBody Employee getDetail(
    		@RequestParam(value="empId", required=false, defaultValue="1") Integer empId){
    	
    	return employeeService.getEmpDetail(empId);
    	
    }

}
