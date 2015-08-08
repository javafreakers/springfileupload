package com.javafreakers.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.javafreakers.model.FileUpload;
import com.javafreakers.model.Product;
import com.javafreakers.service.ProductService;


@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	@RequestMapping("productform.html")
	public String productForm(ModelMap map){
		map.addAttribute("productDetails");
		return "addproduct";
	}

	@RequestMapping("saveproduct.html")
	public String saveProduct(Product product,FileUpload fileUpload,HttpServletRequest request){
		System.out.println("hello There");
		MultipartFile file = fileUpload.getFile();
		try {
			file.transferTo(new File(request.getRealPath("/")+"/documentsfile/"+file.getOriginalFilename()));
			product.setDocumentLinkStr("/documentsfile/"+file.getOriginalFilename());
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isprodctsaved = productService.saveProduct(product);
		if(isprodctsaved){
			return "addproduct";
		}else{
			return "";
		}

	}
}
