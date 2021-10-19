package com.example.Demo.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
private long id;
private String name;
private String dob;
private float salary;
private String address;
private String designation;
//
//@on
//private Shop shop;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public Employee()
{
	
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", salary=" + salary + ", address=" + address
			+ ", designation=" + designation + "]";
}

public Employee(long id, String name, String dob, float salary, String address, String designation) {
	super();
	this.id = id;
	this.name = name;
	this.dob = dob;
	this.salary = salary;
	this.address = address;
	this.designation = designation;
}



}
