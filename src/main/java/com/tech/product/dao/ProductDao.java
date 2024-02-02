package com.tech.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.product.entity.Product;
import com.tech.product.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository prodrepo;

	public String addProductList(List<Product> p) {
		 prodrepo.saveAll(p);
		 return "List Added Successfully";
	}
	public List<Product> getList() {
		return prodrepo.findAll();
	}
}
