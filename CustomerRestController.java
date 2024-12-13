package com.Hw.rest;
import java.util.List;

import com.Hw.binding.Customer;
import com.Hw.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

@Autowired
	private CustomerService customerService;
	
	@PostMapping("/customer")
	public ResponseEntity<String> createCustomer(@RequestBody Customer customer)
	{
	  String status=customerService.upsert(customer);
	return new ResponseEntity<>(status, HttpStatus.CREATED);	
	}
	
	@GetMapping("/customer/{customer_id}")
	public ResponseEntity<Customer>getCustomer(@PathVariable Integer customer_id)
	{
		Customer customer=customerService.getById(customer_id);
		return new ResponseEntity<>(customer,HttpStatus.OK);
		
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		List<Customer>allCustomers=customerService.getAllCustomers();
	    return new ResponseEntity<>(allCustomers,HttpStatus.OK);
	}
	
	@PutMapping("/customer")
	public ResponseEntity<String>updateCustomer(@RequestBody Customer customer){
		String status=customerService.upsert(customer);
	    return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
	@DeleteMapping("/customer/{customer_id}")
	public ResponseEntity<String>deleteCustomer(@PathVariable Integer customer_id)
	{
		String status=customerService.deleteById(customer_id);
		return new ResponseEntity<>(status,HttpStatus.OK);
		}
}
