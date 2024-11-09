package com.microservice.project1.model;

public class Order {
	private String productName;
	private int productID;
	private int price;
	private String portNo;	
	private int quantity;
	
	public Order(){
		
	}
	public Order(String productName, int productID, int price, String portNo, int quantity) {
		super();
		this.productName = productName;
		this.productID = productID;
		this.price = price;
		this.portNo = portNo;
		this.quantity = quantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPortNo() {
		return portNo;
	}
	public void setPortNo(String portNo) {
		this.portNo = portNo;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
