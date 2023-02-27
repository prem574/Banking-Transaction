package com.stl.Banking.Transaction.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="general")
public class GeneralAccount {
	
	private String branch;
	private String ifsc;
	@Id
	private String accountNumber;
}
