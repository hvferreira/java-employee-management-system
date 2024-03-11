package com.employeemanagementsystem.employeemanagementsystem.service;

import com.employeemanagementsystem.employeemanagementsystem.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    void saveEmployee();
    Employee getEmployeeById(Long id);
    void deleteEmployeeById(Long id);
    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}
