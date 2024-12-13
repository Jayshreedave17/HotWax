package com.Hw.repo;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hw.binding.Contact_Mech;
import com.Hw.binding.Product;
	@Repository
	public interface ProductRepository extends JpaRepository<Product,Serializable> {

	}

