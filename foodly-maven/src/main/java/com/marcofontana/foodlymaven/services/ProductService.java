package com.marcofontana.foodlymaven.services;

//import com.marcofontana.foodlymaven.converters.BaseConverter;
//import com.marcofontana.foodlymaven.entities.ProductEntity;
//import com.marcofontana.foodlymaven.repositories.ProductRepository;
import com.marcofontana.foodlymaven.converters.BaseConverter;
import com.marcofontana.foodlymaven.entities.ProductEntity;
import com.marcofontana.foodlymaven.repositories.ProductRepository;
import com.marcofontana.foodlymaven.view.dto.ProductDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final BaseConverter baseConverter;
    private final ProductRepository productRepository;

    public ProductDto createProduct(ProductDto productDto) {
        ProductEntity productEntity = new ProductEntity(baseConverter.convertToEntity(productDto, ProductEntity.class));
        productRepository.saveAndFlush(productEntity);

        return productDto;
    }

    public List<ProductDto> getProductDtoExample() {
        return baseConverter.convertListToDto(productRepository.findAll(), ProductDto.class);
    }
}
