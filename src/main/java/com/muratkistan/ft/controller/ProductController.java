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
    public ResponseEntity<ProductDto> addUser(@RequestBody ProductDto productDto){
        return ResponseEntity.ok(productService.addProduct(productDto));
    }

    @GetMapping("/getAllExpiredProducts")
    public ResponseEntity<List<ProductDto>> getAllUsers(){
        return ResponseEntity.ok(productService.findAllWithExpirationDateBefore());

    }
}
