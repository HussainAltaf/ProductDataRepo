package com.productdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productdata.entity.Product;
import com.productdata.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productrepository;

	public String addProduct(Product product) {
		productrepository.save(product);
		return "Product added successfully";
	}
	
	public Product getProductbyId(Integer id){
		return productrepository.findOne(id);
	}
	
	public Product getProductbyName(String name){
		return productrepository.findByName(name);
	}
	
	public List<Product> getAllProduct(){
		return productrepository.findAll();
	}
	
}
