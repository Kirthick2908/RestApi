package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.loginModel;

public interface loginRepo extends JpaRepository<loginModel, Long>{
	loginModel findByUsername(String username);

	  boolean existsByUsername(String username);

	  boolean existsByEmail(String email);
}