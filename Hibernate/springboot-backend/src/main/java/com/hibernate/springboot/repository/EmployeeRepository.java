package com.hibernate.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
