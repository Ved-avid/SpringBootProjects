package com.microservice.project1.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.microservice.project1.entity.Product;

@Service
public class ProductServuceImpl implements ProductService{
	
	//Why not creating the bean of these as we are creating for RestTemplate ? 
	@Autowired
	private Environment env;

	@Override
	public List<Product> getAllProduct() {
		String port = env.getProperty("local.server.port");
		
		Product p1 = new Product("Laptop",1,104999,port);
		Product p2 = new Product("Mobile",2,52000,port);
		Product p3 = new Product("GShock watch",3,16000,port);
		Product p4 = new Product("Airpods",4,17000,port);
		Product p5 = new Product("ASIC Shoes",5,15999,port);
		return Arrays.asList(p1,p2,p3,p4,p5);
	}

}
