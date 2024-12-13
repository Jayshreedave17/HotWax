package com.Hw.rest;

import java.util.List;

import com.Hw.binding.Customer;
import com.Hw.binding.Order_Item;
import com.Hw.service.CustomerService;
import com.Hw.service.Order_ItemService;

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
public class Order_ItemRestController {


@Autowired
	private Order_ItemService order_itemService;
	
	@PostMapping("/order_item")
	public ResponseEntity<String> createOrder_Item(@RequestBody Order_Item order_item)
	{
	  String status=order_itemService.upsert(order_item);
	return new ResponseEntity<>(status, HttpStatus.CREATED);	
	}
	
	@GetMapping("/order_item/{orderItemid}")
	public ResponseEntity<Order_Item>getOrder_Item(@PathVariable Integer orderItemId)
	{
		Order_Item order_item=order_itemService.getById(orderItemId);
		return new ResponseEntity<>(order_item,HttpStatus.OK);
		
	}
	
	@GetMapping("/order_items")
	public ResponseEntity<List<order_items>> getAllOrder_Items(){
		List<Order_Items>allOrder_Items=order_itemsService.getAllOrder_Items();
	    return new ResponseEntity<>(allOrder_Items,HttpStatus.OK);
	}
	
	@PutMapping("/order_item")
	public ResponseEntity<String>updateCustomer(@RequestBody Order_Item order_item){
		String status=order_itemService.upsert(order_item);
	    return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
	@DeleteMapping("/order_item/{orderItemId}")
	public ResponseEntity<String>deleteCustomer(@PathVariable Integer orderItemId)
	{
		String status=order_ItemService.deleteById(orderItemId);
		return new ResponseEntity<>(status,HttpStatus.OK);
		
		}
}
