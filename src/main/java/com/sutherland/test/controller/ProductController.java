package com.sutherland.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sutherland.test.entity.Product;
import com.sutherland.test.service.ProductServiceImpl;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/getByTypeAndPrice")
    public List<Product> getByTypeAndPrice(@RequestParam String type, @RequestParam double price) {
        return productService.getProductsByTypeAndPrice(type, price);
    }
}
