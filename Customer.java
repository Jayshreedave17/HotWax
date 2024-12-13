package com.Hw.binding;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
	@Data
	@Entity
	@Table(name="Customer")
	public class Customer{

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int customerId;

	    private String first_name;
	    private String last_name;
		
	}


