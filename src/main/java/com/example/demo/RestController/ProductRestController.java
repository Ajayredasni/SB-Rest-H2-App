package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductRestController {
	@Autowired
	ProductService productService;
	
	@PostMapping(value = "/addProductData" ,consumes = {"application/json"})
	public ResponseEntity<String> addProductData(@RequestBody Product product){
		String msg=productService.addProductData(product);
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	
	@GetMapping("/getProduct")
	public ResponseEntity<List<Product>> getProductData()
	{
		List<Product> product=productService.getProductData();
		return new ResponseEntity<List<Product>>(product,HttpStatus.OK);
	}
}
