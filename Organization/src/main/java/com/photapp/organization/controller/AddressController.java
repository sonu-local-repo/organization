package com.photapp.organization.controller;

import com.photapp.organization.entity.Address;
import com.photapp.organization.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RequestMapping("api/v1/org")
public class AddressController {
    @Autowired
    AddressRepository repository;

    @GetMapping("address/all")
    public List<Address> getAllOrganization() {
        return repository.findAll();
    }
    @GetMapping("address/id/{Id}")
    public Optional<Address> getOneOrganization(@PathVariable final Integer Id) {
        System.out.println(Id);
        return repository.findById(Id);
    }
    @PostMapping("address/create")
    public Address createOrganization(@RequestBody final Address employee) {
        Address createdAddress = repository.save(employee);
        return createdAddress;
    }
}
