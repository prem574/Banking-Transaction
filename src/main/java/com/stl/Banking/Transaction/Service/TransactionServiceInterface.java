package com.stl.Banking.Transaction.Service;

import org.springframework.http.ResponseEntity;

import com.stl.Banking.Transaction.Entity.Transaction;

public interface TransactionServiceInterface {


ResponseEntity<String> createTransaction(Transaction transaction);

ResponseEntity<Transaction> getTransaction(int id);

}