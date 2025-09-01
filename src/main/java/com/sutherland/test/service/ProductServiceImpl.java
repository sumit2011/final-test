package com.sutherland.test.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sutherland.test.entity.Product;
import com.sutherland.test.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository repo;

    private List<Product> products = List.of(
        new Product(101, "RedTape", "Shoes", 1500),
        new Product(102, "AllenSolley", "Shirts", 1000),
        new Product(103, "WoodLand", "Shoes", 2500),
        new Product(104, "Oxemberg", "Shirts", 900),
        new Product(105, "Arrow", "Shirts", 1100),
        new Product(106, "Bata", "Shoes", 899),
        new Product(107, "Raymond", "Blazers", 3000),
        new Product(108, "ParkAvenue", "Blazers", 2500),
        new Product(109, "PeterEngland", "Shirts", 1200),
        new Product(110, "LondonBridge", "Shirts", 700)
    );
    
    

    public List<Product> getAllProducts() {
    	return repo.findAll();
    }

    public List<Product> getProductsByTypeAndPrice(String type, double price) {

        return repo.findByProductTypeAndPrice(type,price);
    }
}
