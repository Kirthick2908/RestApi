package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HotelmenuModel {
	@Id
private int menuno;
private String dish;
private String price;
public int getMenuno() {
	return menuno;
}
public void setMenuno(int menuno) {
	this.menuno = menuno;
}
public String getDish() {
	return dish;
}
public void setDish(String dish) {
	this.dish = dish;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
}
