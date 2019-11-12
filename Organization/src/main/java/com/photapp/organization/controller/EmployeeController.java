package com.photapp.organization.controller;

import com.photapp.organization.dto.EmployeeDTO;
import com.photapp.organization.repository.EmployeeRepository;
import com.photapp.organization.serivce.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/org")

public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmployeeRepository repository;

    @GetMapping("employee/all")
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.findAllEmployees();
    }
    @GetMapping("employee/id/{Id}")
    public EmployeeDTO getEmployee(@PathVariable final Integer Id) {
          return employeeService.findEmployee(Id);
    }
    @PostMapping("employee/create")
    public EmployeeDTO createEmployee(@RequestBody final EmployeeDTO employee) {
        return employeeService.create(employee);
    }
    @PutMapping("employee/{id}")
    public EmployeeDTO updateEmployee(@PathVariable final int id, @RequestBody final EmployeeDTO employee){
        return employeeService.updateEmployee(employee);
    }
}
