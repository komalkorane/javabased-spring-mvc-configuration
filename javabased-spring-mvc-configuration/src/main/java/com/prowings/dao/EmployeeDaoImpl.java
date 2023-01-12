package com.prowings.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prowings.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public void createEmployee(Employee employee) {
		
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(employee);
		txn.commit();
		
	}

	
	
	
	
	
}
