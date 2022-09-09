package com.muratkistan.ft.service.abstracts;

import com.muratkistan.ft.dtos.ProductDto;
import com.muratkistan.ft.entity.Product;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface ProductService {


    ProductDto addProduct(ProductDto productDto);
    List<ProductDto> getAllProducts();
    List<ProductDto> findAllWithExpirationDateBefore();
    List<ProductDto> findAllWithExpirationDateAfter(LocalDate expirationDate);
}
