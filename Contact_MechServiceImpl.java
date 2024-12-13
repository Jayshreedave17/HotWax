package com.Hw.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hw.binding.Contact_Mech;
import com.Hw.binding.Customer;
import com.Hw.repo.Contact_MechRepository;
import com.Hw.repo.CustomerRepository;

@Service
public class Contact_MechServiceImpl implements Contact_MechService{


	@Autowired
	private Contact_MechRepository contact_mechRepo;
	
	@Override
	public String upsert(Contact_Mech contact_mech) {
		// TODO Auto-generated method stub
		contact_mechRepo.save(contact_mech);
		return "success";
	}

	@Override
	public Contact_Mech getById(Integer contactMechId) {
		// TODO Auto-generated method stub
		Optional<Contact_Mech>findById =contact_mechRepo.findById(contactMechId);
		if(findById.isPresent())
		{
			return findById.get();
		}
		
		return null;
	}

	@Override
	public List<Contact_Mech> getAllContact_Mechs() {
		// TODO Auto-generated method stub
		return contact_mechRepo.findAll();
		
	}

	@Override
	public String deleteById(Integer contactMechId) {
		// TODO Auto-generated method stub
		if(contact_mechRepo.existsById(contactMechId))
		{
			contact_mechRepo.deleteById(contactMechId);
			return "Delete Success";
		}
		else
		{
			return "No Record found";
			
		}

	}

}
