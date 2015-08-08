package com.javafreakers.service.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javafreakers.dao.ProductDao;
import com.javafreakers.model.Product;
import com.javafreakers.service.ProductService;
@Component
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDao productDao;
	@Override
	public boolean saveProduct(Product product) {
		/* product expiration time 30 days after from current time 
		 * product manufacturing date is current date
		 */
		long productExpirationTime = 30*24*3600;
		product.setDomDate(new Date());
		product.setDoeDate(new Date(new Date().getTime()+productExpirationTime));
		return productDao.saveProduct(product);
	}
	
}
