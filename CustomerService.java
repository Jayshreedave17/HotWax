package com.Hw.service;

import java.util.List;
import com.Hw.binding.Customer;

public interface CustomerService {

public String upsert(Customer customer);
	
	public Customer getById(Integer customerId);
	
	public List<Customer> getAllCustomers();
	
	public String deleteById(Integer customerId);
	
	
	

}








	
	
