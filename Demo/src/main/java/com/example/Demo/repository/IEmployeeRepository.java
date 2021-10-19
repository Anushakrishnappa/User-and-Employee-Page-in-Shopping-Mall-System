package com.example.Demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.entities.*;


@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
//	public Employee addEmployee(Employee employee);
//	public Employee updateEmployee(Employee employee);
//	public Employee searchEmployee(long id);
//	public boolean  deleteEmployee(long id);
}
