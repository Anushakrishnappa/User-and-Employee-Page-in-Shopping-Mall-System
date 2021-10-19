package com.employeeManagement.service;

import java.util.List;

import com.employeeManagement.entities.Employee;
import com.employeeManagement.repository.EmployeeRepository;
import com.employeeManagement.repository.EmployeeRepositoryImpl;



public class EmployeeServiceImpl  implements EmployeeService{

	/**
     * Save User
     * @param user
     */
	public EmployeeRepository empRepo = new EmployeeRepositoryImpl();
    public void saveEmployee(Employee employee) {
    	
    	empRepo.saveEmployee(employee);
       
    }

    /**
     * Update User
     * @param user
     */
    public void updateEmployee(Employee employee) {
    	
    	empRepo.updateEmployee(employee);
       
    }

    /**
     * Delete User
     * @param id
     */
    public void deleteEmployee(int id) {

    	empRepo.deleteEmployee(id);
    }

    /**
     * Get User By ID
     * @param id
     * @return
     */
    public Employee getEmployee(int id) {

    	Employee existingemployeee = empRepo.getEmployee(id);
    	
    	return existingemployeee;
    }

    /**
     * Get all Users
     * @return
     */
    @SuppressWarnings("unchecked")
    public List < Employee > getAllEmployee() {

    	
    	List < Employee > listEmployee = empRepo.getAllEmployee();
    	
    	return listEmployee;
}
}
