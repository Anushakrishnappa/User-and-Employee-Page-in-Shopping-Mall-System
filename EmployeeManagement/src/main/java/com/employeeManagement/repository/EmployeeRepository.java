package com.employeeManagement.repository;

import java.util.List;

import com.employeeManagement.entities.Employee;


public interface EmployeeRepository {

	List<Employee> getAllEmployee();

	Employee getEmployee(int id);

	void deleteEmployee(int id);

	void updateEmployee(Employee employee);

	void saveEmployee(Employee employee);

}
