package com.Hw.service;

import java.util.List;
import com.Hw.binding.Contact_Mech;

public interface Contact_MechService {

public String upsert(Contact_Mech contact_mech);
	
	public Contact_Mech getById(Integer contactMechId);
	
	public List<Contact_Mech> getAllContact_Mechs();
	
	public String deleteById(Integer contactMechId);
	
	
	

}










