package com.javafreakers.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.javafreakers.dao.ProductDao;
import com.javafreakers.model.Product;
@Component
public class ProductDaoImpl implements ProductDao{
	@Autowired
	SessionFactory sessionFactory;

	
	@Override
	@Transactional
	public boolean saveProduct(Product product) {
		try{
			/*Product product2 = (Product)*/
		Long identifier =(Long)	sessionFactory.getCurrentSession().save(product);
			if(identifier!=null){
				return true;
			}
			else{
				return false;
			}
		}catch(Exception exception){
			exception.printStackTrace();
			System.out.println("Exception in saving product");
			return false;
		}
		
	}
	
}
