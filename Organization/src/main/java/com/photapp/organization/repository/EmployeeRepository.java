package com.photapp.organization.repository;

import com.photapp.organization.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAll();

    Optional<Employee> findById(Integer id);

    Employee findByUserName(String username);
}
