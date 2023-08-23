package com.example.demo.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
//import jakarta.persistence.Table;

@Entity
//@Table(name="ProdectTable")
public class Prodect {
	@Id
	private int ProductID;
	private String Name;
	private String Description;
	private int Price;
	private int PriceQuantity;
	private String ImageURL;
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getPriceQuantity() {
		return PriceQuantity;
	}
	public void setPriceQuantity(int priceQuantity) {
		PriceQuantity = priceQuantity;
	}
	public String getImageURL() {
		return ImageURL;
	}
	public void setImageURL(String imageURL) {
		ImageURL = imageURL;
	}
	public Prodect(int productID, String name, String description, int price, int priceQuantity,
			String imageURL) {
		super();
		ProductID = productID;
		Name = name;
		Description = description;
		Price = price;
		PriceQuantity = priceQuantity;
		ImageURL = imageURL;
	}
	public Prodect() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
