package com.hsbc.model;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hsbc.enums.AccountType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "Customer")
@Data
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountNumber;
	private AccountType accountType;
	
	@NotNull(message = "Firstname cannot be null")
	@Size(max = 35, message = "Firstname must have upto 35 characters")
	@Column(nullable = false)
	private String firstName;
	
	@NotNull(message = "Lastname cannot be null")
	@Size(max = 25, message = "Lastname must have upto 25 characters")
	@Column(nullable = false)
	private String lastName;
	
	@NotNull(message = "Father name cannot be null")
	@Column(nullable = true)
	private String fatherName;
	
	@NotNull(message = "Mother name cannot be null")
	@Column(nullable = true)
	private String motherName;
	
	@NotNull(message = "Email address cannot be null")
	@Column(nullable = false)
	private String emailAddress;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Timestamp birthDate;
	
	@Size(max = 10, message = "PAN number must have upto 10 character")
	private String pan;
	private String aadhar;
	private String gender;
	private String amount;
	private String maritalStatus;
	private String contact;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private String createdAt;
	
}
