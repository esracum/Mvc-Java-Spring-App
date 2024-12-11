package com.proje.dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.proje.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAll() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("FROM Employee", Employee.class).getResultList();
    }

    @Override
    public Employee getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Employee.class, id);
    }

   
	@Override
    public void saveOrUpdate(Employee employee) {
        Session session = entityManager.unwrap(Session.class);
        session.merge(employee);
    }

    
	@Override
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        Employee employee = session.get(Employee.class, id);
        if (employee != null) {
            session.remove(employee);
        }
    }
}
