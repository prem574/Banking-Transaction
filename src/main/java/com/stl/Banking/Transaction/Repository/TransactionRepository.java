package com.stl.Banking.Transaction.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.stl.Banking.Transaction.Entity.Transaction;
import com.stl.Banking.Transaction.Entity.User;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

	List<Transaction> findByUser(Optional<User> user);
}

