package com.webprojem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webprojem.domain.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private EntityManager entityManger;

	@Override
	public List<Employee> findAll() {
		TypedQuery<Employee> query = entityManger.createQuery("from Employee",Employee.class);
		return query.getResultList();
	}

	@Transactional
	@Override
	public void save(Employee employee) {
		entityManger.persist(employee);
	}

	@Override
	public Employee findById(Long id) {
		Employee employee = entityManger.find(Employee.class, id);
		return employee;
	}

	@Transactional
	@Override
	public void update(Employee employee) {
		
		entityManger.merge(employee);
		
	}

	@Override
	public void delete(Long id) {
		Employee employee = entityManger.find(Employee.class, id);
		
		entityManger.remove(employee);
		
	}

	@Override
	public int deleteAll() {
		Query query = entityManger.createQuery("DELETE FROM Employee");
		return query.executeUpdate();
	}

	@Override
	public List<Employee> findByName(String name) {
		
		TypedQuery<Employee> query = entityManger.createQuery("from Employee where name=:employee_name", Employee.class);
		query.setParameter("employee_name", name);
		
		return query.getResultList();
	}

}
