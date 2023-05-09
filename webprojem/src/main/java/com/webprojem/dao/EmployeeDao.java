package com.webprojem.dao;

import java.util.List;

import com.webprojem.domain.Employee;

public interface EmployeeDao {
	
	List<Employee> findAll();
	
	void save(Employee employee);
	
	Employee findById(Long id);
	
	void update(Employee employee);
	
	void delete(Long id);
	
	int deleteAll();
	
	List<Employee> findByName(String name);

}
