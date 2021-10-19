package com.employeeManagement.service;

import java.util.List;

import com.employeeManagement.entities.Employee;


public interface EmployeeService {

	List<Employee> getAllEmployee();

	Employee getEmployee(int id);

	void saveEmployee(Employee newUser);

	void updateEmployee(Employee user);

	void deleteEmployee(int id);

}
