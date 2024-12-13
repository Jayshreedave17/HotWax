package com.Hw.service;

import java.util.List;
import com.Hw.binding.Order_Header;

public interface Order_HeaderService {

public String upsert(Order_Header order_header);
	
	public Order_Header getById(Integer order_id);
	
	public List<Order_Header> getAllOrder_Headers();
	
	public String deleteById(Integer order_id);

	
	
	
	

}








	
	
