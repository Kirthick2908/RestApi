package com.review2.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.review2.project.Model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel,String>{

}