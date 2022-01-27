package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dinnermenu123")
public class DinnerMenu 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	
	@Column(name="dinner_id")
	private int id;
	
	@Column(name="item_name")
	private String name;
	
	@Column(name="item_price")
	private double price;
	public DinnerMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public DinnerMenu(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
