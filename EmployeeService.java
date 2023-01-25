package com.EmoplyeeDetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmoplyeeDetails.model.Employee;
import com.EmoplyeeDetails.reposiotry.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public String saveEmployee(Employee employee) {
		repository.save(employee);
		return "New Employee Added";
	}
	
	public List<Employee> getAllEmployee(){
		return repository.findAll();
		}
	
	public Optional<Employee> getEmployeeById(int employeeId) {
		return repository.findById(employeeId);
	}
	
	
	
	public String deleteEMployeeById(int employeeId) {
		repository.deleteById(employeeId);
		return "Employee Deleted";
	}
	}
