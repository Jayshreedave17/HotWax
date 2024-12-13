package com.Hw.binding;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity

public class Contact_Mech {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

private int contactMechId;

@ManyToOne
@JoinColumn(name = "customer_id", nullable = false)
private Customer customer;

@Column(length = 100, nullable = false)
private String streetAddress;

@Column(length = 50, nullable = false)
private String city;

@Column(length = 50, nullable = false)
private String state;

@Column(length = 20, nullable = false)
private String postalCode;

@Column(length = 20)
private String phoneNumber;

@Column(length = 100)
private String email;
}
