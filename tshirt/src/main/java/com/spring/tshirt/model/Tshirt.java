package com.spring.tshirt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tshirt")
public class Tshirt {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	@Column
	@Override
	public String toString() {
		return "Tshirt [id=" + id + ", brand=" + brand + ", size=" + size + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	private String brand;
	private String size;
	private float price;
	
}
