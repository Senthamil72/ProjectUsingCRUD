package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="OrderTable")
public class Ordermodel {
@Id
	private int OrderID;
	private int UserID;
	private int OrderDate;
	private int TotalAmount;
	private String Status;
	public int getOrderID() {
		return OrderID;
	}
	public void setOrderID(int orderID) {
		OrderID = orderID;
	}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public int getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(int orderDate) {
		OrderDate = orderDate;
	}
	public int getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		TotalAmount = totalAmount;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Ordermodel(int orderID, int userID, int orderDate, int totalAmount, String status) {
		super();
		OrderID = orderID;
		UserID = userID;
		OrderDate = orderDate;
		TotalAmount = totalAmount;
		Status = status;
	}
	public Ordermodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
