package com.Hw.repo;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hw.binding.Customer;
	@Repository
	public interface CustomerRepository extends JpaRepository<Customer,Serializable> {

	}




