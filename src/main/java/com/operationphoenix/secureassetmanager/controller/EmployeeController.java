package com.operationphoenix.secureassetmanager.controller;

import com.operationphoenix.secureassetmanager.entity.Employee;
import com.operationphoenix.secureassetmanager.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService= employeeService;

    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();

    }

    @GetMapping("/{id}")
    public Employee getEmployeeById (@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee (@Valid @RequestBody Employee employee){

         Employee savedEmployee= employeeService.saveEmployee(employee);

         return ResponseEntity
                 .status(HttpStatus.CREATED)
                 .body(savedEmployee);

    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);

        return "Employee deleted successfully";

    }

    @PutMapping("/{id}")
    public Employee updateEmployee(
            @PathVariable Long id,
            @Valid @RequestBody Employee employee){

        return employeeService.updateEmployee(id, employee);
    }



}
