package com.photapp.organization.authentication;

import com.photapp.organization.entity.Employee;
import com.photapp.organization.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrgUserDetailsService implements UserDetailsService {

    @Autowired
    EmployeeRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Employee employee = repository.findByUserName(username);
 /*       ModelMapper modelMapper = new ModelMapper();
        LoginRequestModel userDetails = modelMapper.map(employee, LoginRequestModel.class);*/
        System.out.println("UserName ->" + employee.getUserName());
        return new User(employee.getUserName(),employee.getPassword(),true, true, true, true,
                new ArrayList<>());
    }
}
