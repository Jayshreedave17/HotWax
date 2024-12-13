package com.Hw.service;

import java.util.List;
import com.Hw.binding.Order_Header;
import com.Hw.binding.Order_Item;

public interface Order_ItemService {

public String upsert(Order_Item order_item);
	
	public Order_Item getById(Integer orderItemId);
	
	public List<Order_Item> getAllOrder_Items();
	
	public String deleteById(Integer orderItemId);
	
	
	

}








	
	
