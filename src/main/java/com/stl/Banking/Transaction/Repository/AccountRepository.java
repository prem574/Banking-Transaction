package com.stl.Banking.Transaction.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stl.Banking.Transaction.Entity.Account;



@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	  
}