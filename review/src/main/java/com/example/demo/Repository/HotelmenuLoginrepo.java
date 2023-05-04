package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.HotelmenuLoginmod;

public interface HotelmenuLoginrepo extends JpaRepository<HotelmenuLoginmod ,Integer>{
	HotelmenuLoginmod findByusrname(String usrname);
	

}
