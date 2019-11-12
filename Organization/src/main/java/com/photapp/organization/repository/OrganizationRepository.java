package com.photapp.organization.repository;

import com.photapp.organization.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
    List<Organization> findAll();

    Optional<Organization> findById(Integer id);
}

