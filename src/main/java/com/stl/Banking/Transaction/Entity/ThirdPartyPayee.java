package com.stl.Banking.Transaction.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "third_party_payees")
public class ThirdPartyPayee  {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "user_id",referencedColumnName="id")
  private User user;

  @Column(name = "payee_name")
  private String payeeName;

  @Column(name = "payee_account_number")
  private String payeeAccountNumber;

  @Column(name = "ifsc")
  private String ifsc;

  @Column(name = "branch")
  private String branch;

  @Column(name = "cif_no")
  private String cifNo;

public ThirdPartyPayee(Long id, String payeeName, User user,String payeeAccountNumber, String ifsc, String branch, String cifNo) {
	super();
	this.id = id;
	this.user = user;
	this.payeeName = payeeName;
	this.payeeAccountNumber = payeeAccountNumber;
	this.ifsc = ifsc;
	this.branch = branch;
	this.cifNo = cifNo;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public ThirdPartyPayee() {
	super();
	// TODO Auto-generated constructor stub
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getPayeeName() {
	return payeeName;
}

public void setPayeeName(String payeeName) {
	this.payeeName = payeeName;
}

public String getPayeeAccountNumber() {
	return payeeAccountNumber;
}

public void setPayeeAccountNumber(String payeeAccountNumber) {
	this.payeeAccountNumber = payeeAccountNumber;
}

public String getIfsc() {
	return ifsc;
}

public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}

public String getBranch() {
	return branch;
}

public void setBranch(String branch) {
	this.branch = branch;
}

public String getCifNo() {
	return cifNo;
}

public void setCifNo(String cifNo) {
	this.cifNo = cifNo;
}

@Override
public String toString() {
	return "ThirdPartyPayee [id=" + id + ",user"+user+", payeeName=" + payeeName + ", payeeAccountNumber=" + payeeAccountNumber
			+ ", ifsc=" + ifsc + ", branch=" + branch + ", cifNo=" + cifNo + "]";
}


  
  // Getters and Setters
}
