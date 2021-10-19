package com.example.Demo.servie;

import com.example.Demo.entities.*;

public interface IEmployeeService {
	
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee searchEmployee(long id);
	public Employee  deleteEmployee(long id);

}
