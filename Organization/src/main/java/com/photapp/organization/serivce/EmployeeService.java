package com.photapp.organization.serivce;

import com.photapp.organization.dto.EmployeeDTO;
import com.photapp.organization.entity.Employee;
import com.photapp.organization.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;


    public List<EmployeeDTO> findAllEmployees() {
        List<Employee> employees =  repository.findAll();
        ModelMapper modelMapper = new ModelMapper();
        List<EmployeeDTO> employeeModels = modelMapper.map(employees, new TypeToken<List<EmployeeDTO>>(){}.getType());
        return employeeModels;
    }

    public EmployeeDTO findEmployee(Integer id) {
        Employee employee = repository.findById(id).get();
        if (employee == null) {
            return null;
        }

        ModelMapper modelMapper = new ModelMapper();
        EmployeeDTO employeeModel= modelMapper.map(employee, EmployeeDTO.class);
        employeeModel.setFirstName(employee.getFirstName());
        return employeeModel;
    }


    public EmployeeDTO create(EmployeeDTO employeeModel) {
        ModelMapper modelMapper = new ModelMapper();
        Employee employee = modelMapper.map(employeeModel, Employee.class);
        Employee newEmployee = repository.save(employee);
        return modelMapper.map(newEmployee, EmployeeDTO.class);
    }

    public EmployeeDTO updateEmployee(EmployeeDTO employee) {
        ModelMapper mapper = new ModelMapper();
        int id = employee.getId();
        Employee employeeEntity = repository.getOne(id);
        mapper.map(employee, employeeEntity);
        employeeEntity = repository.save(employeeEntity);
        return mapper.map(employeeEntity, EmployeeDTO.class);
    }
}
