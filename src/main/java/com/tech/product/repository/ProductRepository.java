package com.tech.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	

}
