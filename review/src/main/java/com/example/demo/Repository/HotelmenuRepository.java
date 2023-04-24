package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.HotelmenuModel;

public interface HotelmenuRepository extends JpaRepository<HotelmenuModel, Integer> {

}
