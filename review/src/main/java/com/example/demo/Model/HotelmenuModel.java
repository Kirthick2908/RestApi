package com.example.demo.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class HotelmenuModel {
	@Id
private int menuno;
private String dish;
private String price;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="dish_id")
private Hotelchild hchild;
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
public Hotelchild getHchild() {
	return hchild;
}
public void setHchild(Hotelchild hchild) {
	this.hchild = hchild;
}
}
