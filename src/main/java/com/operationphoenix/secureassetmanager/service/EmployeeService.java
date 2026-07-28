package com.operationphoenix.secureassetmanager.service;

import com.operationphoenix.secureassetmanager.entity.Employee;
import com.operationphoenix.secureassetmanager.exception.EmployeeNotFoundException;
import com.operationphoenix.secureassetmanager.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;

    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();

    }

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee not found"));

    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);

    }

    public Employee updateEmployee(Long id, Employee updatedEmployee){

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()-> new EmployeeNotFoundException("Employee not found"));

        employee.setFirstName(updatedEmployee.getFirstName());
        employee.setLastName(updatedEmployee.getLastName());
        employee.setEmail(updatedEmployee.getEmail());
        employee.setDepartment(updatedEmployee.getDepartment());
        employee.setJobTitle(updatedEmployee.getJobTitle());
        employee.setHireDate(updatedEmployee.getHireDate());
        employee.setStatus(updatedEmployee.getStatus());

        return employeeRepository.save(employee);

    }
}
