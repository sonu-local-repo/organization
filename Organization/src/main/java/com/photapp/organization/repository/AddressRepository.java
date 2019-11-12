package com.photapp.organization.repository;

import com.photapp.organization.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address, Integer> {

    List<Address> findAll();

    Optional<Address> findById(Integer id);
}
