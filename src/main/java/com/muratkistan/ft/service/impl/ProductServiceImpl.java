package com.muratkistan.ft.service.impl;

import com.muratkistan.ft.dtos.ProductDto;
import com.muratkistan.ft.entity.Product;
import com.muratkistan.ft.repository.ProductRepository;
import com.muratkistan.ft.service.abstracts.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ProductServiceImpl  implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    @Override
    public ProductDto addProduct(ProductDto productDto) {
        Product product = modelMapper.map(productDto,Product.class);
        return modelMapper.map(productRepository.save(product),ProductDto.class);
    }

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(product -> modelMapper.map(product,ProductDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> findAllWithExpirationDateBefore() {
        return productRepository.findAllWithExpirationDateBefore(LocalDate.from(LocalDateTime.now()))
                .stream()
                .map(product -> modelMapper.map(product,ProductDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> findAllWithExpirationDateAfter(LocalDate expirationDate) {
        return productRepository.findAllWithExpirationDateAfter(expirationDate)
                .stream()
                .map(product -> modelMapper.map(product,ProductDto.class))
                .collect(Collectors.toList());
    }
}
