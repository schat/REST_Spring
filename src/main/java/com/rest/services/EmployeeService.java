package com.rest.services;

import com.rest.domain.Employee;

public class EmployeeService {  
  
     public Employee getEmpDetail(Integer empId) {  
    	 
          Employee emp = new Employee();  
  
          emp.setEmpId(empId);
          emp.setEmpName("Test Employee");
          emp.setEmpDept("Test Dept");
          emp.setSalary(80000.00);
            
          return emp;  
     }  
  
}  