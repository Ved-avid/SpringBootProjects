package com.ved_avid.ecommerce.dao;

import com.ved_avid.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
