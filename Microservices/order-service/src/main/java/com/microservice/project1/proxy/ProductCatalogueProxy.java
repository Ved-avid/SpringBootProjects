package com.microservice.project1.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.project1.model.Order;

@FeignClient(name="product-catalogue")
public interface ProductCatalogueProxy {
	
	
	@GetMapping("product/{pid}")
	Order orderProduct(@PathVariable int pid);

}
