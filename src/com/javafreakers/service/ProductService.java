package com.javafreakers.service;

import org.springframework.stereotype.Component;

import com.javafreakers.model.Product;
@Component
public interface ProductService {
	public boolean saveProduct(Product product);
}
