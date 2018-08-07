package com.visa.training.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.visa.training.domain.Employee;

@Transactional
@Component
public class EmployeeDao {
	@Autowired
	EntityManager em;

	public Employee findDao(int eid) {
		return em.find(Employee.class, eid);
	}

	public Employee createDao(Employee e) {
		System.out.println(e.getEid());
		em.persist(e);
		return e;
	}

	public static void main(String[] args) {
		EmployeeDao emp = new EmployeeDao();
		Employee e = new Employee();
		e.setEmail("sai007nikhil@gmail.com");
		e.setEid(101);
		e.setGender("Male");
		e.setName("Sai Nikhil");
		e.setNumber("8008996622");
		emp.createDao(e);
		System.out.println(emp.findDao(e.getEid()));
	}
}
