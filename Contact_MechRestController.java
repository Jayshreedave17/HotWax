
package com.Hw.rest;
import java.util.List;

import com.Hw.binding.Contact_Mech;
import com.Hw.service.Contact_MechService;

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
public class Contact_MechRestController {

@Autowired
	private Contact_MechService contact_mechService;
	
	@PostMapping("/contact_mech")
	public ResponseEntity<String> createCustomer(@RequestBody Contact_Mech contact_mech)
	{
	  String status=contact_mechService.upsert(contact_mech);
	return new ResponseEntity<>(status, HttpStatus.CREATED);	
	}
	
	@GetMapping("/contact_mech/{contactmech_id}")
	public ResponseEntity<Contact_Mech>getContact_Mech(@PathVariable Integer contactMechId)
	{
		Contact_Mech contact_mech=contact_mechService.getById(contactMechId);
		return new ResponseEntity<>(contact_mech,HttpStatus.OK);
		
	}
	
	@GetMapping("/contact_mechs")
	public ResponseEntity<List<Contact_Mech>> getAllContact_Mechs(){
		List<Contact_Mech>allContact_Mechs=contact_mechService.getAllContact_Mechs();
	    return new ResponseEntity<>(allContact_Mechs,HttpStatus.OK);
	}
	
	@PutMapping("/contact_mech")
	public ResponseEntity<String>updateContact_Mech(@RequestBody Contact_Mech contact_mech){
		String status=contact_mechService.upsert(contact_mech);
	    return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
	@DeleteMapping("/contact_mech/{contactmech_id}")
	public ResponseEntity<String>deleteContact_Mech(@PathVariable Integer contactmech_id)
	{
		String status=contact_mechService.deleteById(contactmech_id);
		return new ResponseEntity<>(status,HttpStatus.OK);
		}
}