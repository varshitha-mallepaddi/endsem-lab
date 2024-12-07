package com.klef.jfsd.service;

import com.klef.jfsd.model.Customer;

public interface CustomerService {
	
	Customer updateCustomer(Long id, String name, String address);
    Customer getCustomerById(Long id);

}
