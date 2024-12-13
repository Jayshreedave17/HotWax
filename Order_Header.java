package com.Hw.binding;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public class Order_Header {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int order_id;
	private Date order_date;
	@ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private int shippingContactMechId;
    private int billingContactMechId;
	


}
