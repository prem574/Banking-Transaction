package com.stl.Banking.Transaction.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.stl.Banking.Transaction.Entity.Account;
import com.stl.Banking.Transaction.Entity.Transaction;
import com.stl.Banking.Transaction.Entity.User;
import com.stl.Banking.Transaction.Exception.ResourceNotFoundException;
import com.stl.Banking.Transaction.Repository.AccountRepository;
import com.stl.Banking.Transaction.Repository.TransactionRepository;
import com.stl.Banking.Transaction.Repository.UserRepository;

@Service
public class TransactionService implements  TransactionServiceInterface {

 

@Autowired
private TransactionRepository transactionRepository;
@Autowired
private AccountRepository accountRepository;
@Autowired
private UserRepository userRepository;

public List<Transaction> getAllTransactions() {
return transactionRepository.findAll();
}



@Override
public ResponseEntity<String> createTransaction(Transaction transaction) {
	//Account fromAccount = transaction.getFromAccount().getId();
	
	Account  fromAccount  = accountRepository.findById(transaction.getFromAccount().getId()).get();
	//fromAccount.setBalance(account.getBalance()) ;
	
	if(fromAccount.getBalance()<transaction.getAmount()) {
		return ResponseEntity.badRequest().body("Insufficient balance");
	}
	transaction.setDate(null);
	
	transaction.setOldBalance(fromAccount.getBalance());
	fromAccount.setBalance((double)(fromAccount.getBalance()- transaction.getAmount()));
	
	accountRepository.save(fromAccount);
	
	transaction.setNewBalance(fromAccount.getBalance());
	
	if(transaction.getEnternalAccount()!=null) {
		Account InternalAccount = accountRepository.findById(transaction.getEnternalAccount().getId()).get();
		InternalAccount.setBalance(InternalAccount.getBalance() + transaction.getAmount());
        accountRepository.save(InternalAccount);
	}
//	ThirdPartyPayee toAccount = transaction.getToAccount();
//	toAccount.setBalance(toAccount.getBalance() + transaction.getAmount());
//	accountRepository.save(toAccount);

	transactionRepository.save(transaction);
	return ResponseEntity.ok().body("transaction successful");


}

@Override
public ResponseEntity<Transaction> getTransaction(int id) {
	Transaction transaction = transactionRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Doctor not exist with id: "+ id));
	return ResponseEntity.ok(transaction);
}



public List<Transaction> getTransactionByUserId(Long userId) {
	 Optional<User> user = userRepository.findById(userId);
     List<Transaction> transaction = transactionRepository.findByUser(user);
     return transaction;
}





}