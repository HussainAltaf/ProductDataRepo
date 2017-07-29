package com.productdata.service;

import javax.annotation.Resource;

import com.productdata.model.Product;

@Resource
public interface IProductService {
	public String addProduct(Product product);
}
