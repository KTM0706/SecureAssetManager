package com.operationphoenix.secureassetmanager.config;


import com.operationphoenix.secureassetmanager.entity.Employee;
import com.operationphoenix.secureassetmanager.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DataLoader {

//    @Bean
//    CommandLineRunner loadData(EmployeeRepository employeeRepository){
//
//        return args -> {
//
//            Employee employee = new Employee();
//
//            employee.setFirstName("Keamogetswe");
//            employee.setLastName("Mafora");
//            employee.setEmail("keamogetswemafora@gmail.com");
//            employee.setDepartment("Cyber Security");
//            employee.setJobTitle("Security Analyst");
//            employee.setHireDate(LocalDate.now());
//            employee.setStatus("Active");
//
//            employeeRepository.save(employee);
//            System.out.println("employee saved successfully");
//
//        };
//
//    }

}
