package com.microservice.project1.controller;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.microservice.project1.model.Order;
import com.microservice.project1.proxy.ProductCatalogueProxy;

@RestController
public class OrderController {
	@GetMapping("order/{id}/{quanity}")
	public ResponseEntity<Order> doOrder(@PathVariable int id,@PathVariable int quanity){
		String URL = "http://localhost:8100/product/"+id;
		RestTemplate restTemplate = new RestTemplate();
		Order order = restTemplate.getForObject(URL,Order.class);
		return new ResponseEntity<Order>(order,HttpStatus.OK);
	}

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("orderWithLoadBalancing/{id}/{quanity}")
	public ResponseEntity<Order> doOrderWithLoadBalancing(@PathVariable int id,@PathVariable int quanity){
		String URL = "http://product-catalogue/product/"+id;
		Order order = restTemplate.getForObject(URL,Order.class);
		return new ResponseEntity<Order>(order,HttpStatus.OK);
	}	
	
	@Autowired
	private ProductCatalogueProxy proxy;
	
	@GetMapping("orderWithFeignClient/{id}/{quanity}")
	public ResponseEntity<Order> doOrderWithFeignClient(@PathVariable int id,@PathVariable int quanity){
        Order order = proxy.orderProduct(id);
		return new ResponseEntity<Order>(order,HttpStatus.OK);
	}	
}
