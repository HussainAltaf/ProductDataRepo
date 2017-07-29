package com.productdata.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productdata.model.Product;

@RestController
@RequestMapping(value = "/productdata")
public interface IProductController {
	@PostMapping("/product/add")
	public String addProduct(@RequestBody Product product);

	@GetMapping("/product/{id}")
	public Product getProductbyId(@PathVariable String id);
}
