package com.klef.jfsd.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.model.Customer;
import com.klef.jfsd.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
    private CustomerRepository customerRepository;

	@Override
	public Customer updateCustomer(Long id, String name, String address) {
		Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isPresent()) {
            Customer customer = optionalCustomer.get();
            customer.setName(name);
            customer.setAddress(address);
            return customerRepository.save(customer);
        }
        throw new RuntimeException("Customer not found with id: " + id);
	}

	@Override
	public Customer getCustomerById(Long id) {
		 return customerRepository.findById(id).orElse(null);
	}

	
	

}
