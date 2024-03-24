package com.javatech24.employeeservice.service;

import com.javatech24.employeeservice.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface EmpService {
    ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    String addEmployee(List<Employee> employee);
    String deleteAllData();

    String updateEmployee(Employee employee);
}
