package com.muratkistan.ft.controller;

import com.muratkistan.ft.dtos.ProductDto;
import com.muratkistan.ft.dtos.UserDto;
import com.muratkistan.ft.service.abstracts.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto productDto){
        return ResponseEntity.ok(productService.addProduct(productDto));
    }

    @GetMapping("/getAllProducts")
    public ResponseEntity<List<ProductDto>> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());

    }

    @GetMapping("/getAllExpiredProducts")
    public ResponseEntity<List<ProductDto>> getAllExpiredProducts(){
        return ResponseEntity.ok(productService.getAllExpiredProducts());

    }

    @GetMapping("/getAllNotExpiredProducts")
    public ResponseEntity<List<ProductDto>> getAllNotExpiredProducts(){
        return ResponseEntity.ok(productService.getAllNotExpiredProducts());
    }
}
