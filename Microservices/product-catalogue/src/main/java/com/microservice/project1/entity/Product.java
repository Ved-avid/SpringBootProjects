package com.microservice.project1.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
	private String productName;
	private int productID;
	private int price;
	@JsonProperty("portNo")
	private String portNo;
	
	public Product() {
		
	}
	public Product(String productName, int productID, int price, String portNo) {
		super();
		this.productName = productName;
		this.productID = productID;
		this.price = price;
		this.portNo = portNo;
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
	public String getPort() {
		return portNo;
	}
	public void setPort(String port) {
		this.portNo= port;
	}	

}
