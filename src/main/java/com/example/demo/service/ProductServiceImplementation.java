package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;
import com.example.demo.entity.Product;
@Service
public class ProductServiceImplementation implements ProductService{
	@Autowired
	ProductDao dao;
	@Override
	public String addProductData(Product product) {
		dao.save(product);
		return "Save Product Data Successfully";
	}
	@Override
	public List<Product> getProductData() {
		 return dao.findAll();
	}
	
}
