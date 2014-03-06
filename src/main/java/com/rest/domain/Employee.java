package com.rest.domain;


public class Employee{  
  
     private Integer empId;  
     private String empName;  
     private String empDept;    
     private Double salary;
       
     public Employee()  
     { }  
  
     
      
     public Integer getEmpId() {
		return empId;
	}



	public void setEmpId(Integer empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getEmpDept() {
		return empDept;
	}



	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}



	public Double getSalary() {
		return salary;
	}



	public void setSalary(Double salary) {
		this.salary = salary;
	}



	@Override  
     public String toString() {  
          return "Employee [Employy Id =" + empId + ", Employee Name="  
                    + empName + ", Employee Department=" + empDept + ", Salary=" + salary + " ]";  
     }  
}  
