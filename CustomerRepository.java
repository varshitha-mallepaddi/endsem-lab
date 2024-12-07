package com.klef.jfsd.repository;

import org.springframework.stereotype.Repository;

import com.klef.jfsd.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
