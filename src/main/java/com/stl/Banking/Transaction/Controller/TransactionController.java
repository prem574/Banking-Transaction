package com.stl.Banking.Transaction.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stl.Banking.Transaction.Entity.Transaction;
import com.stl.Banking.Transaction.Service.TransactionService;

@RestController
@RequestMapping("/transactions")
@CrossOrigin("*")
public class TransactionController {

@Autowired
private TransactionService transactionService;

@GetMapping
public ResponseEntity<List<Transaction>> getAllTransactions() {
List<Transaction> transactions = transactionService.getAllTransactions();
return ResponseEntity.ok(transactions);
}

@GetMapping("/{id}")
public ResponseEntity<ResponseEntity<Transaction>> getTransactionById(@PathVariable int id) {
ResponseEntity<Transaction> transaction = transactionService.getTransaction(id);
return ResponseEntity.ok(transaction);
}

//@PostMapping("/transfer")
//public ResponseEntity<ResponseEntity<String>> createTransaction(@RequestBody Transaction transaction) {
//ResponseEntity<String> newTransaction = transactionService.createTransaction(transaction);
//return ResponseEntity.status(HttpStatus.CREATED).body(newTransaction);
//}


@PostMapping("/transfer")
public ResponseEntity<ResponseEntity<String>> createTransaction(@RequestBody Transaction transaction) {	
ResponseEntity<String> newTransaction = transactionService.createTransaction(transaction);

return ResponseEntity.status(HttpStatus.CREATED).body(newTransaction);

}

@GetMapping("/users/{userId}/transactions")
public ResponseEntity<List< Transaction>> getAccountsByUserId(@PathVariable Long userId) {
    List< Transaction> transactions = transactionService.getTransactionByUserId(userId);
    return new ResponseEntity<>(transactions, HttpStatus.OK);
}



}