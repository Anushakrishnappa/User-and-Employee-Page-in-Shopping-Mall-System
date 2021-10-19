package com.example.Demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.entities.Employee;
import com.example.Demo.entities.User;
import com.example.Demo.repository.IEmployeeRepository;
import com.example.Demo.servie.IEmployeeService;

@RestController
@RequestMapping("/employee")
@Component
public class EmployeeController {

	
	@Autowired
	private IEmployeeService iEmployeeService;
	
	@Autowired
	private IEmployeeRepository iEmployeeRepository;
	
	
	  @PostMapping("/addEmployee")
	    public Employee addEmployee(@Validated @RequestBody Employee employee) {
		  
	        return iEmployeeService.addEmployee(employee);
	    }
	  
	  @PostMapping("/updateEmployee")
	    public Employee updateEmployee(@Validated @RequestBody Employee employee) {
		  
	        return iEmployeeService.updateEmployee(employee);
	    }
	  
	  @PostMapping("/searchEmployee")
	    public Employee searchEmployee(@Validated @RequestBody Employee employee) {
		  
	        return iEmployeeService.searchEmployee(employee.getId());
	    }
	  
	  @PostMapping("/deleteEmployee")
	    public Employee deleteEmployee(@Validated @RequestBody Employee employee) {
		  
	        return iEmployeeService.deleteEmployee(employee.getId());
	    }
	  
	  
	  @GetMapping("/getAllEmployees")
	    public List<Employee> getAllEmployees() {
	        return iEmployeeRepository.findAll();
	    }
}
