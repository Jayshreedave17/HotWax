package com.Hw.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hw.binding.Order_Header;

import com.Hw.repo.Order_HeaderRepository;


@Service
public class Order_HeaderServiceImpl implements Order_HeaderService{


	@Autowired
	private Order_HeaderRepository order_headerRepo;
	
	@Override
	public String upsert(Order_Header order_header) {
		// TODO Auto-generated method stub
		order_headerRepo.save(order_header);
		return "success";
	}

	@Override
	public Order_Header getById(Integer order_id) {
		// TODO Auto-generated method stub
		Optional<Order_Header>findById =order_headerRepo.findById(order_id);
		
		if(findById.isPresent())
		{
			return findById.get();
		}
		
		return null;
	}

	@Override
	public List<Order_Header> getAllOrder_Headers() {
		// TODO Auto-generated method stub
		return order_headerRepo.findAll();
		
	}

	@Override
	public String deleteById(Integer order_id) {
		// TODO Auto-generated method stub
		if(order_headerRepo.existsById(order_id))
		{
			order_headerRepo.deleteById(order_id);
			return "Delete Success";
		}
		else
		{
			return "No Record found";
			
		}

	
	}

}
