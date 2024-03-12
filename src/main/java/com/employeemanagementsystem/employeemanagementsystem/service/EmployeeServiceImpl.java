package com.employeemanagementsystem.employeemanagementsystem.service;

import com.employeemanagementsystem.employeemanagementsystem.model.Employee;
import com.employeemanagementsystem.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public void saveEmployee() {

    }

    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public void deleteEmployeeById(Long id) {

    }

    @Override
    public Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        return null;
    }
}
