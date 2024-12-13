package com.Hw.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hw.binding.Customer;

import com.Hw.repo.CustomerRepository;


@Service
public class CustomerServiceImpl implements CustomerService{


	@Autowired
	private CustomerRepository customerRepo;
	
	@Override
	public String upsert(Customer customer) {
		// TODO Auto-generated method stub
		customerRepo.save(customer);
		return "success";
	}

	@Override
	public Customer getById(Integer customerId) {
		// TODO Auto-generated method stub
		Optional<Customer>findById =customerRepo.findById(customerId);
		if(findById.isPresent())
		{
			return findById.get();
		}
		
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
		
	}

	@Override
	public String deleteById(Integer customerId) {
		// TODO Auto-generated method stub
		if(customerRepo.existsById(customerId))
		{
			customerRepo.deleteById(customerId);
			return "Delete Success";
		}
		else
		{
			return "No Record found";
			
		}

	}

}
