package com.employee.crud.controller;

import com.employee.crud.entity.Employee;
import com.employee.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity getAllEmployee() {
        return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.OK);
    }

    @PostMapping("/employees")
    public ResponseEntity addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.CREATED);
    }

    @PutMapping("/employees/{employeeId}")
    public ResponseEntity updateEmployeeById(@PathVariable int employeeId, @RequestBody Employee employee) {
        employeeService.updateEmployeeById(employeeId, employee);
        return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/employees/{employeeId}")
    public ResponseEntity deleteEmployeeById(@PathVariable int employeeId) {
        employeeService.deleteEmployeeById(employeeId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}

