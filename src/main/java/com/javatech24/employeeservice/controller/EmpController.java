package com.javatech24.employeeservice.controller;


import java.util.ArrayList;
import java.util.List;

import com.javatech24.employeeservice.entity.Employee;
import com.javatech24.employeeservice.service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class EmpController {

    @Autowired
    private EmpServiceImpl empServiceImpl;

    @PostMapping("/insertEmployee")
    public String saveEmployee(@RequestBody List<Employee> employee) {
       return  empServiceImpl.addEmployee(employee);

    }

    @GetMapping("/findall")
    public ArrayList<Employee> getAllEmployee() {
        return empServiceImpl.findAllEmployee();
    }

    @GetMapping("/findbyid/{id}")
    public Employee getEmployeeUsingId(@PathVariable long id) {
        return empServiceImpl.findAllEmployeeByID(id);
    }

    @DeleteMapping("/delete")
    public String delete() {
        return empServiceImpl.deleteAllData();
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee employee){
       return  empServiceImpl.updateEmployee(employee);
    }
}

