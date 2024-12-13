package com.Hw.binding;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public class Order_Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderItemId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order_Header order;

    private int productId;
    private int quantity;
    private String status;

}
