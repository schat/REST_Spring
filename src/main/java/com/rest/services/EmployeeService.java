package com.rest.services;

import org.springframework.stereotype.Service;  

import com.rest.domain.Employee;
 
@Service  
public class EmployeeService {  
  
     public Employee getEmpDetail(String empId) {  
    	 
          Employee emp = new Employee();  
  
          emp.setEmpId(empId);
          emp.setEmpName("Test Employee");
          emp.setEmpDept("Test Dept");
          emp.setSalary(80000.00);
            
          System.out.println(emp);
          return emp;  
     }  
  
}  