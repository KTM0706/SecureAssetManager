package com.operationphoenix.secureassetmanager.repository;

import com.operationphoenix.secureassetmanager.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
