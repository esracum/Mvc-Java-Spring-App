package com.proje.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proje.model.Employee;

@Repository
public interface Application extends JpaRepository<Employee, Integer> {
    // JpaRepository zaten CRUD işlemleri için gerekli yöntemleri sağlar
}
