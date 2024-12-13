package com.Hw.repo;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hw.binding.Contact_Mech;
	@Repository
	public interface Contact_MechRepository extends JpaRepository<Contact_Mech,Serializable> {

	}

