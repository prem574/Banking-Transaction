package com.stl.Banking.Transaction.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stl.Banking.Transaction.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

 User findByUsername(String userName);

  //Optional<User> findByUsername(String username);
}

