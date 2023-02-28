// package com.stl.Banking.Transaction;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import java.time.LocalDateTime;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;

// import com.stl.Banking.Transaction.Entity.Account;
// import com.stl.Banking.Transaction.Entity.Transaction;
// import com.stl.Banking.Transaction.Entity.User;
// import com.stl.Banking.Transaction.Repository.AccountRepository;
// import com.stl.Banking.Transaction.Repository.TransactionRepository;

// @SpringBootTest
// class TransactionMicroservicesApplicationTests {

// 	@Autowired
// 	TransactionRepository transRepo;
// 	@Autowired
// 	AccountRepository accountrepo;
	
// 	@Test
// 	public void testcreate() {
	
// 	User user = new User(1l,"a","d","y","f","e","p","s");
// 	Account fromAccount = new Account(1l,"q",user,"a","d",(double)2000, LocalDateTime.now(),LocalDateTime.now());  
// 	accountrepo.save(fromAccount);
	
// 	Account enternalAccount = new Account(3l,"q",user,"a","d",(double)20000, LocalDateTime.now(),LocalDateTime.now());
// 	accountrepo.save(enternalAccount);
	
// 	Transaction transaction = new Transaction(2,user, LocalDateTime.now(), "Transfer from Checking to Savings", 200, fromAccount,
//             null, enternalAccount, "Success", "T456", fromAccount.getBalance(), fromAccount.getBalance() - 200);
//     transaction = transRepo.save(transaction);

// //    Transaction foundTransaction = transRepo.findById(transaction.getId()).get();
// //    assertEquals(transaction, foundTransaction);
// 	}
// } 
