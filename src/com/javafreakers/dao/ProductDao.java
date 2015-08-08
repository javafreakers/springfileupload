package com.javafreakers.dao;

import org.springframework.stereotype.Component;

import com.javafreakers.model.Product;
@Component
abstract public interface ProductDao {
public boolean saveProduct(Product product);
}
