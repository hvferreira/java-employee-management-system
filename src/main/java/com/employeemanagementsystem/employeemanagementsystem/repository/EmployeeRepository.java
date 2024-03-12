package com.employeemanagementsystem.employeemanagementsystem.repository;

import com.employeemanagementsystem.employeemanagementsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository extends JpaRepository<Employee,long> {
}
