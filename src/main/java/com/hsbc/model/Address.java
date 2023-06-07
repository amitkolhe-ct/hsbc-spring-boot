package com.hsbc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "Address")
@Data
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	private String street1;
	private String street2;
	
	@NotNull(message = "City cannot be null")
	@Column(nullable = false)
	private String city;
	
	@NotNull(message = "State cannot be null")
	@Column(nullable = false)
	private String state;
	
	@NotNull(message = "Country cannot be null")
	@Column(nullable = false)
	private String country;
	
	@NotNull(message = "Zip code cannot be null")
	@Column(nullable = false)
	@Size(max = 6, message = "Zip code must have upto 6 digite")
	private String zipCode;
	
}
