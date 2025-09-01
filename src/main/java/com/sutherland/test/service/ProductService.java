package com.sutherland.test.service;

import java.util.List;

import com.sutherland.test.entity.Product;

public interface ProductService {
	List<Product> getAllProducts();
	List<Product> getProductsByTypeAndPrice(String type, double price);

}
