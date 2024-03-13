package com.employeemanagementsystem.employeemanagementsystem.controller;

import com.employeemanagementsystem.employeemanagementsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService EmployeeService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        return EmployeeService.findPaginated(1, "firstName", "asc", model);
    }
}
