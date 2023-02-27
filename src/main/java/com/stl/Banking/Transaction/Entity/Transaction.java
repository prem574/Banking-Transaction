package com.stl.Banking.Transaction.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "transactions")
public class Transaction {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "ID")
private int id;

@ManyToOne(targetEntity=User.class)
@JoinColumn(name = "user_id",referencedColumnName="id")
private User user;

@Column(name = "date")
private LocalDateTime date;

@Column(name = "description")
private String description;

@Column(name = "amount")
//@NotNull
private double amount;

@ManyToOne
@JoinColumn(name = "source_account",referencedColumnName="id")
//@NotNull
//@NotBlank(message = "enter the  account id of sender")
private Account fromAccount;

@ManyToOne
@JoinColumn(name = "reciept_tpt_account",referencedColumnName="id")
//@NotNull
//@NotBlank(message = "enter the  account id of third party reciever")
private ThirdPartyPayee tptAccount;

@ManyToOne
@JoinColumn(name="reciept_account",referencedColumnName="id")
//@NotNull
//@NotBlank(message = "enter the  account id of third party reciever")
private Account enternalAccount;

@Column(name = "transaction_status")
private String transactionStatus;

@Column(name = "business_transaction_number")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private String businessTransactionNumber;

@Column(name = "old_balance")
private double oldBalance;

@Column(name = "new_balance")
private double newBalance;

public Transaction(int id, User user, LocalDateTime date, String description, double amount, Account fromAccount,
		ThirdPartyPayee tptAccount, Account enternalAccount, String transactionStatus, String businessTransactionNumber,
		double oldBalance, double newBalance) {
	super();
	this.id = id;
	this.user = user;
	this.date = LocalDateTime.now();
	this.description = description;
	this.amount = amount;
	this.fromAccount = fromAccount;
	this.tptAccount = tptAccount;
	this.enternalAccount = enternalAccount;
	this.transactionStatus = transactionStatus;
	this.businessTransactionNumber = businessTransactionNumber;
	this.oldBalance = oldBalance;
	this.newBalance = newBalance;
}

@Override
public String toString() {
	return "Transaction [id=" + id + ", user=" + user + ", date=" + date + ", description=" + description + ", amount="
			+ amount + ", fromAccount=" + fromAccount + ", tptAccount=" + tptAccount + ", enternalAccount="
			+ enternalAccount + ", transactionStatus=" + transactionStatus + ", businessTransactionNumber="
			+ businessTransactionNumber + ", oldBalance=" + oldBalance + ", newBalance=" + newBalance + "]";
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public LocalDateTime getDate() {
	return date;
}

public void setDate(LocalDateTime date) {
	this.date = LocalDateTime.now();
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public Account getFromAccount() {
	return fromAccount;
}

public void setFromAccount(Account fromAccount) {
	this.fromAccount = fromAccount;
}

public ThirdPartyPayee getTptAccount() {
	return tptAccount;
}

public void setTptAccount(ThirdPartyPayee tptAccount) {
	this.tptAccount = tptAccount;
}

public Account getEnternalAccount() {
	return enternalAccount;
}

public void setEnternalAccount(Account enternalAccount) {
	this.enternalAccount = enternalAccount;
}

public String getTransactionStatus() {
	return transactionStatus;
}

public void setTransactionStatus(String transactionStatus) {
	this.transactionStatus = transactionStatus;
}

public String getBusinessTransactionNumber() {
	return businessTransactionNumber;
}

public void setBusinessTransactionNumber(String businessTransactionNumber) {
	this.businessTransactionNumber = businessTransactionNumber;
}

public double getOldBalance() {
	return oldBalance;
}

public void setOldBalance(double oldBalance) {
	this.oldBalance = oldBalance;
}

public double getNewBalance() {
	return newBalance;
}

public void setNewBalance(double newBalance) {
	this.newBalance = newBalance;
}

public Transaction() {
	super();
	// TODO Auto-generated constructor stub
}
}