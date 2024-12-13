package com.Hw.rest;
import java.util.List;

import com.Hw.binding.Contact_Mech;
import com.Hw.binding.Order_Header;
import com.Hw.service.Contact_MechService;
import com.Hw.service.Order_HeaderService;

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
public class Order_HeaderRestController {

@Autowired
	private Order_HeaderService order_headerService;
	
	@PostMapping("/order_header")
	public ResponseEntity<String> createOrder_Header(@RequestBody Order_Header order_header)
	{
	  String status=order_headerService.upsert(order_header);
	return new ResponseEntity<>(status, HttpStatus.CREATED);	
	}
	
	@GetMapping("/order_header/{order_id}")
	public ResponseEntity<Contact_Mech>getContact_Mech(@PathVariable Integer order_id)
	{
		Order_Header order_header=order_headerService.getById(order_id);
		return new ResponseEntity<>(order_header,HttpStatus.OK);
		
	}
	
	@GetMapping("/order_headers")
	public ResponseEntity<List<Order_Header>> getAllOrderHeaders(){
		List<Order_Header>allOrder_Headers=order_headerService.getAllOrder_Headers();
	    return new ResponseEntity<>(allOrder_Headers,HttpStatus.OK);
	}
	
	@PutMapping("/order_header")
	public ResponseEntity<String>updateOrder_Header(@RequestBody Order_Header order_header){
		String status=order_header.upsert(order_header);
	    return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
	@DeleteMapping("/order_header/{order_id}")
	public ResponseEntity<String>deleteOrder_Header(@PathVariable Integer order_id)
	{
		String status=order_header.deleteById(order_id);
		return new ResponseEntity<>(status,HttpStatus.OK);
		}
}