package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {
	public String addProductData(Product product);
	public List<Product> getProductData();
}