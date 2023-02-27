package com.stl.Banking.Transaction.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "user" )
public class User {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
 
    private Long id;
 
    @Column(name = "first_name")
    @NotEmpty
	@Size(min =  4 , message = "name need to be atleast 4 characters")
    private String firstName;
 
    @Column(name = "last_name")
    @NotEmpty
	@Size(min =  4 , message = "name need to be atleast 4 characters")
    private String lastName;
    
   @Column(name = "username")
   @NotEmpty
   @Size(min =  4 , message = "name need to be atleast 4 characters")
    private String username;
 
    
	@Column(name = "email")
	@NotEmpty
	@Email
    private String email;
 
    @Column(name = "password")
    @NotEmpty
	@Size(min =  4 , message = "name need to be atleast 4 characters")
    private String password;
 
    @Column(name = "phone_number")
    @NotEmpty
	@NotBlank(message = "Please enter the phone number")
    private String phoneNumber;
 
    
    @Column(name = "address")
    @NotEmpty
    @NotBlank(message = "enter the address")
    private String address;

	public User(Long id, String firstName, String lastName ,String username,String email, String password, String phoneNumber,
			String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username= username;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName +", username = " + username +" , email=" + email
				+ ", password=" + password + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
 
    // Getters and setters
 
   
}
