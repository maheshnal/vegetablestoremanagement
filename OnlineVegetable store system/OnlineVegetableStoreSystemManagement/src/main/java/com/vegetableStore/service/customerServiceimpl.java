package com.vegetableStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vegetableStore.model.customer;

@Service

public class customerServiceimpl  implements customeraservice{

	@Autowired
	
	private com.vegetableStore.repository.customerRepository  customerRepository;
	@Override
	public List<customer> getALLCustomers() {
		return customerRepository.findAll();
		
	}

	public void savecustomer(customer customer) {
		this.customerRepository.save(customer);
	}
	public customer getCustomerById1(long Id) {
		 
		Optional<customer> optional=customerRepository.findById(Id);
				customer customer=null;
		
		if(optional.isPresent()) {
			customer =optional.get();
		}else{
			throw new RuntimeException(" customer not found for id::" + Id);
			
		}
		return customer;
			
		
	}
	


	public customer getCustomerById(long Id) {
		this.customerRepository.deleteById(Id);
		return null;
	}

	@Override
	public customer getCustomerById() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}
