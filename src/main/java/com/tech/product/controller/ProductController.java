package com.tech.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.product.entity.Product;
import com.tech.product.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	@Autowired
	ProductService prodser;
@PostMapping(value="/insertList")
public String addProductList(@RequestBody List<Product> p) {
	return prodser.addProductList(p);
}
@GetMapping(value="/getList")
public List<Product> getList() {
	return prodser.getList();
}
}
