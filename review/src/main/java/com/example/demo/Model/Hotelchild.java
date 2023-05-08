package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hotelchild {
	@Id
	private int id;
	private String dishrating;
	private String dishvariety;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDishrating() {
		return dishrating;
	}
	public void setDishrating(String dishrating) {
		this.dishrating = dishrating;
	}
	public String getDishvariety() {
		return dishvariety;
	}
	public void setDishvariety(String dishvariety) {
		this.dishvariety = dishvariety;
	}

}
