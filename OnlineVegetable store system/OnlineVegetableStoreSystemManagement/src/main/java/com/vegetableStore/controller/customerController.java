package com.vegetableStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.vegetableStore.model.customer;
import com.vegetableStore.service.customeraservice;

@Controller
public class customerController {

	@Autowired
	private customeraservice customerservice;
	@GetMapping("/")
	public String viewHomePage(Model model) {
		 
		model.addAllAttributes( customerservice.getALLCustomers());
		return "index";
			
	}
	
	@GetMapping("/showNewCustomerForm")
	public String showNewCustomerForm(Model model) {
		model.addAllAttributes(customerservice.getALLCustomers());
		return "new_customer";}
	
	
	@PostMapping("/saveCustomer")
	public String savecustomer(@ModelAttribute("customer") customer customer) {
		//save customer to database 
		customeraservice.savecustomer(customer);
		return "redirect:/";}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForupdate(@PathVariable(value="id") long id,Model model) {
		customer customer=customerservice.getCustomerById();
		return null; 
		//set customer as a model attribute to pre-populate the form
		
		model.addAllAttributes("customer", customer);
		return "update_customer";
		
	}
	@GetMapping("/DeleteCustomer/{id}")
	public String DeleteCustomer(@PathVariable(value="id") long id) {
		//call delete employee method 
		return "redirect:/";
		
	} 
	
	
	
	
	
}


