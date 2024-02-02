package com.tech.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.product.dao.ProductDao;
import com.tech.product.entity.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao proddao;

	public String addProductList(List<Product> p) {
		return proddao.addProductList(p);
	}
	public List<Product> getList() {
		return proddao.getList();
	}
}
