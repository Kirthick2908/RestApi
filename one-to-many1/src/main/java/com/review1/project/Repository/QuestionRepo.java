package com.review1.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.review1.project.Model.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer> {

}