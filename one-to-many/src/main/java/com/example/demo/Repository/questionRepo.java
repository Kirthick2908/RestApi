package com.review1.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.review1.project.Model.question;

public interface questionRepo extends JpaRepository<question, Integer> {

}
