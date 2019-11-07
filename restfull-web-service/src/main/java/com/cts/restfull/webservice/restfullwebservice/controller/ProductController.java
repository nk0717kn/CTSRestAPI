package com.cts.restfull.webservice.restfullwebservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.restfull.webservice.restfullwebservice.bean.Product;
import com.cts.restfull.webservice.restfullwebservice.dao.ProductDaoService;

@RestController
public class ProductController {
	
	@Autowired
	public ProductDaoService productDaoService;
	
	@GetMapping("/test/name")
	public String getMyname() {
		
		return "Hello Natarajan";
	}
	
	
	@GetMapping("/products")
	public List<Product> getAllproducts(){
		 List<Product> products = productDaoService.findAll();
	     return products;
	}
	
	@GetMapping("/product/{id}")
	public Optional<Product> getProductById(@PathVariable int id) {
		Optional<Product> product = productDaoService.findById(id);
		return product;
	}
	
	
	@PostMapping("/product/add")
	public void addProduct(@RequestBody Product product) {
		productDaoService.save(product);
	}
	
	
	@DeleteMapping("/product/delete/{id}")
	public void deleteProductById(@PathVariable int id) {
		productDaoService.deleteById(id);
	}

	
	
	
	
}
