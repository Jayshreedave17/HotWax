package com.Hw.service;

import java.util.List;
import com.Hw.binding.Product;

public interface ProductService {

public String upsert(Product product);
	
	public Product getById(Integer product_id);
	
	public List<Product> getAllProducts();
	
	public String deleteById(Integer product_id);
	
	
	

}








	
	
