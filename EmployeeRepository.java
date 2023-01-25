package com.EmoplyeeDetails.reposiotry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmoplyeeDetails.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {



}
