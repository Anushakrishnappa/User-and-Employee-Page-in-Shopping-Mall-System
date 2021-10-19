package com.example.Demo.servieImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.entities.Employee;
import com.example.Demo.repository.IEmployeeRepository;
import com.example.Demo.servie.IEmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {

	
	@Autowired
     IEmployeeRepository iEmployeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return iEmployeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return iEmployeeRepository.save(employee);
	}

	@Override
	public Employee searchEmployee(long id) {

		Employee cus = iEmployeeRepository.findById(id).get();

		return cus;
	}

	@Override
	public Employee deleteEmployee(long cusId) {
		Employee cus = iEmployeeRepository.findById(cusId).get();	
		iEmployeeRepository.deleteById(cusId);
		return cus;
	}

	
}
