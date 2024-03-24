package com.javatech24.employeeservice.repository;

import com.javatech24.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//    ArrayList<Employee> findAllEmployee();

    Employee findByName(String employeeName);
}
