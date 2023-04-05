package com.dhriti.productservice.service;

import org.springframework.stereotype.Service;

import com.dhriti.productservice.Dto.ProductRequest;
import com.dhriti.productservice.Repository.ProductRepository;
import com.dhriti.productservice.model.Product;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	private ProductRepository productRepository;
	
	public void createProduct(ProductRequest productRequest)	{
//		Product product = Product.builder()
//				.name(productRequest.getName())
//				.description(productRequest.getDescription())
//				.price(productRequest.getName());
		
	}
}
