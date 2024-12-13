package com.Hw.repo;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hw.binding.Order_Item;
	@Repository
	public interface Order_ItemRepository extends JpaRepository<Order_Item,Serializable> {

	}

