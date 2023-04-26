package com.dhriti.productservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.dhriti.productservice.Dto.ProductRequest;
import com.dhriti.productservice.Repository.ProductRepository;
import com.dhriti.productservice.mapper.ProductMapper;
import com.dhriti.productservice.model.Product;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
public class ProductService {
	
	private ProductMapper productMapper;

	private ProductRepository productRepository;
	
	public void createProduct(ProductRequest productRequest)	{
//		Product product = Product.builder()
//				.name(productRequest.getName())
//				.description(productRequest.getDescription())
//				.price(productRequest.getName());
//		Product product = new Product();
//		product.svc
		productRepository.save(productMapper.toEntity(productRequest));
//		Logger.info("");

	}
}
