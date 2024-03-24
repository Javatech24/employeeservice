package com.javatech24.employeeservice.service;

import com.javatech24.employeeservice.entity.Employee;
import com.javatech24.employeeservice.repository.EmployeeRepository;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public ArrayList<Employee> findAllEmployee() {
        return (ArrayList<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee findAllEmployeeByID(long id) {
        Optional<Employee> opt = employeeRepository.findById(id);
        if (opt.isPresent())
            return opt.get();
        else
            return null;
    }


    public String addEmployee(List<Employee> employee) {
        employeeRepository.saveAll(employee);
        return "Employee Add Successfully";

    }

    @Override
    public String deleteAllData() {
        employeeRepository.deleteAll();
        return "all em[loyess deleted";
    }

    public String updateEmployee(Employee employee) {
        Employee existingEmployee = employeeRepository.findByName(employee.getName());
        if (existingEmployee != null) {
            existingEmployee.setCity(employee.getCity());
        }
        employeeRepository.save(employee);
        return "employee updated in DB";
    }
}
