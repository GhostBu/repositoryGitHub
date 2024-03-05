package com.marcofontana.foodlymaven.controller;

import com.marcofontana.foodlymaven.services.ProductService;
import com.marcofontana.foodlymaven.view.dto.ProductDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    private ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto) {
        ResponseEntity<ProductDto> response = new ResponseEntity<>(productService.createProduct(productDto),
                HttpStatus.OK);
        return response;
    }

    @GetMapping
    private List<ProductDto> getProductDtoExample() {

        return productService.getProductDtoExample();
    }

}
