package com.Hw.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hw.binding.Order_Item;

import com.Hw.repo.Order_ItemRepository;


@Service
public class Order_ItemServiceImpl implements Order_ItemService{


	@Autowired
	private Order_ItemRepository order_itemRepo;
	
	@Override
	public String upsert(Order_Item order_item) {
		// TODO Auto-generated method stub
		order_itemRepo.save(order_item);
		return "success";
	}

	@Override
	public Order_Item getById(Integer orderItemId) {
		// TODO Auto-generated method stub
		Optional<Order_Item>findById =order_itemRepo.findById(orderItemId);
		
		if(findById.isPresent())
		{
			return findById.get();
		}
		
		return null;
	}

	@Override
	public List<Order_Item> getAllOrder_Items() {
		// TODO Auto-generated method stub
		return order_itemRepo.findAll();
		
	}

	@Override
	public String deleteById(Integer orderItemId) {
		// TODO Auto-generated method stub
		if(order_itemRepo.existsById(orderItemId))
		{
			order_itemRepo.deleteById(orderItemId);
			return "Delete Success";
		}
		else
		{
			return "No Record found";
			
		}

	}

	
}
