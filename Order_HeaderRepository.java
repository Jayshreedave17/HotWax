package com.Hw.repo;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hw.binding.Order_Header;
	@Repository
	public interface Order_HeaderRepository extends JpaRepository<Order_Header,Serializable> {

	}

