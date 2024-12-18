package com.microservice.project1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.project1.entity.Product;
import com.microservice.project1.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductApi {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable int id){
		List<Product> allProducts = productService.getAllProduct();
		Product product = allProducts.stream().filter(p->p.getProductID()==id).findFirst().get();
		System.out.print(product.toString());
		return new ResponseEntity<Product>(product,HttpStatus.OK);
	}

}
