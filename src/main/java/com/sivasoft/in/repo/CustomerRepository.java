package com.sivasoft.in.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sivasoft.in.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
