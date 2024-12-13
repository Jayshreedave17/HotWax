package com.Hw.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hw.binding.Contact_Mech;
import com.Hw.binding.Customer;
import com.Hw.binding.Product;
import com.Hw.repo.Contact_MechRepository;
import com.Hw.repo.CustomerRepository;
import com.Hw.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{


	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public String upsert(Product product) {
		// TODO Auto-generated method stub
		productRepo.save(product);
		return "success";
	}

	@Override
	public Product getById(Integer product_id) {
		// TODO Auto-generated method stub
		Optional<Product>findById =productRepo.findById(product_id);
		if(findById.isPresent())
		{
			return findById.get();
		}
		
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
		
	}

	@Override
	public String deleteById(Integer product_id) {
		// TODO Auto-generated method stub
		if(productRepo.existsById(product_id))
		{
			productRepo.deleteById(product_id);
			return "Delete Success";
		}
		else
		{
			return "No Record found";
			
		}

	}

}
