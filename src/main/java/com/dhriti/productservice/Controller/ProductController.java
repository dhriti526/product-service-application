package com.dhriti.productservice.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhriti.productservice.Dto.ProductRequest;

@RestController
@RequestMapping(value="/api/product")
public class ProductController {
	
	@PostMapping("")
	public void createProduct(@RequestBody ProductRequest productRequest)	{
		
	}

}
