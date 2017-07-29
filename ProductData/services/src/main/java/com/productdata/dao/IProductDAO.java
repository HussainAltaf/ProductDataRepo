package com.productdata.dao;

import javax.annotation.Resource;

import com.productdata.model.Product;

@Resource
public interface IProductDAO {
	public String addProduct(Product product);
}
