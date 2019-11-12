package com.photapp.organization.controller;

import com.photapp.organization.entity.Organization;
import com.photapp.organization.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/org")

public class OrganizationController {

    @Autowired
    OrganizationRepository repository;

    @GetMapping("organization/all")
    public List<Organization> getAllOrganization() {
        return repository.findAll();
    }
    @GetMapping("organization/id/{Id}")
    public Optional<Organization> getOneOrganization(@PathVariable final Integer Id) {
        System.out.println(Id);
        return repository.findById(Id);
    }
    @PostMapping("organization/create")
    public Organization createOrganization(@RequestBody final Organization organization) {
        Organization createdOrganization = repository.save(organization);
        return createdOrganization;
    }
}
