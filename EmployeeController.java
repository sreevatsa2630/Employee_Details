package com.EmoplyeeDetails.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EmoplyeeDetails.model.Employee;
import com.EmoplyeeDetails.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee(){
		return service.getAllEmployee();
	}
	
	@GetMapping("/findEmployee/{employeeId}")
	public Optional<Employee> findemployeeById(@PathVariable int employeeId){
		return service.getEmployeeById(employeeId);
	}
	

	
	@DeleteMapping("/deleteEmployee/{employeeId}")
	public String deleteEmployeeById(@PathVariable int employeeId) {
	return service.deleteEMployeeById(employeeId);
	}
}
