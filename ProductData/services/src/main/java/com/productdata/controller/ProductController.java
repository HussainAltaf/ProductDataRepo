package com.productdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productdata.entity.Product;
import com.productdata.service.ProductService;

@RestController
@RequestMapping(value = "/productdata")
public class ProductController {
	
	@Autowired
	ProductService productService;

	@PostMapping("/product/add")
	public String addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

	@GetMapping("/product/{id}")
	public Product getProductbyId(@PathVariable Integer id) {
		return productService.getProductbyId(id);
	}

	@GetMapping("/products/{name}")
	public Product getProductbyName(@PathVariable String name) {
		return productService.getProductbyName(name);
	}

	@GetMapping("/products")
	public List<Product> getAllProduct() {
		return productService.getAllProduct();
	}

}
