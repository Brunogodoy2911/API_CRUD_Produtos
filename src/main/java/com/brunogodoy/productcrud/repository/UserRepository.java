package com.brunogodoy.productcrud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brunogodoy.productcrud.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
  Optional<User> findByUsername(String username);
  
}
