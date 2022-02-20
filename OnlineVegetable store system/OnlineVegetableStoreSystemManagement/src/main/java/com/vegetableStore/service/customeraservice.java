package com.vegetableStore.service;

import java.util.List;

import com.vegetableStore.model.customer;

public interface customeraservice {

	List<customer> getALLCustomers();
	static void savecustomer(customer customer) {
		
		customer getCustomerById(Long Id);
		void deleteCustomerById(long id);
		
		
	}
	customer getCustomerById();
	
	
}
