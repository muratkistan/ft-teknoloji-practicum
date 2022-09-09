package com.muratkistan.ft.service.impl;

import com.muratkistan.ft.dtos.ProductCommentDto;
import com.muratkistan.ft.entity.ProductComment;
import com.muratkistan.ft.repository.ProductCommentRepository;
import com.muratkistan.ft.service.abstracts.ProductCommentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductCommentServiceImpl implements ProductCommentService {

    private final ProductCommentRepository productCommentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ProductCommentDto> getAllComments() {
        List<ProductComment> productComments = productCommentRepository.findAll();
        return productComments.stream()
                .map(productComment -> modelMapper.map(productComment,ProductCommentDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public ProductCommentDto addComments(ProductCommentDto productCommentDto) {
        ProductComment productComment = modelMapper.map(productCommentDto,ProductComment.class);
        return modelMapper.map(productCommentRepository.save(productComment),ProductCommentDto.class);
    }

    @Override
    public List<ProductCommentDto> getCommentByProductId(Long productId) {
        return productCommentRepository.findAllByProductId(productId).stream()
                .map(productComment -> modelMapper.map(productComment,ProductCommentDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductCommentDto> getCommentByUserId(Long userId) {
        return productCommentRepository.findAllByUserId(userId).stream()
                .map(productComment -> modelMapper.map(productComment,ProductCommentDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductCommentDto> findAllByUserIdAndCommentDateBetween(Long userId, LocalDate startDate, LocalDate endDate) {
        return productCommentRepository.findAllByCommentDateBetweenAndUserId(userId, startDate, endDate).stream()
                .map(productComment -> modelMapper.map(productComment,ProductCommentDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductCommentDto> findAllByProductIdAndCommentDateBetween(Long productId, LocalDate startDate, LocalDate endDate) {
        return productCommentRepository.findAllByProductIdAndCommentDateBetween(productId, startDate, endDate).stream()
                .map(productComment -> modelMapper.map(productComment,ProductCommentDto.class))
                .collect(Collectors.toList());
    }
}
