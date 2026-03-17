package com.capgemini.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeServices employeeServices;
	
	@RequestMapping("/allemp")
	public String getAllEmployees(HttpServletRequest request) {
		List<Employee> listofEmployees=employeeServices.getAllEmployee();
		for(Employee emp:listofEmployees) {
			System.out.println("Emp : "+emp.getEmpName());
		}
		request.setAttribute("emplist", listofEmployees);
		return "home.jsp";
		
	}
	
	@GetMapping("/addemp")
	public String createEmp() {
		return "register_emp.jsp";
	}
}
