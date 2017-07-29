package com.productdata.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.productdata.dao.IProductDAO;
import com.productdata.model.Product;

@Resource
public class ProductService implements IProductService {

	@Autowired 
	IProductDAO productDAO;

	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		return productDAO.addProduct(product);
	}
}
