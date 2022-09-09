package com.muratkistan.ft.service.abstracts;

import com.muratkistan.ft.dtos.ProductCommentDto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface ProductCommentService {

    List<ProductCommentDto> getAllComments();
    ProductCommentDto addComments(ProductCommentDto productComment);


    List<ProductCommentDto>  getCommentByProductId(Long productId);
    List<ProductCommentDto>  getCommentByUserId(Long userId);
    List<ProductCommentDto> findAllByUserIdAndCommentDateBetween(Long userId, LocalDate startDate, LocalDate endDate);
    List<ProductCommentDto> findAllByProductIdAndCommentDateBetween(Long productId, LocalDate startDate, LocalDate endDate);
}
