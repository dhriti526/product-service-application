package com.dhriti.productservice.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.dhriti.productservice.Dto.ProductRequest;
import com.dhriti.productservice.model.Product;

@Mapper(componentModel = "Spring")
@Component
public interface ProductMapper {
	
	Product toEntity(ProductRequest ProductRequest);

}
