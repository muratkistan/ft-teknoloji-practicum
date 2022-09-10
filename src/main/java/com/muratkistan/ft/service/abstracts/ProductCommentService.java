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
    List<ProductCommentDto> findAllByCommentDateBetweenAndUserId( LocalDate startDate, LocalDate endDate,Long userId);
    List<ProductCommentDto> findAllByCommentDateBetweenAndProductId( LocalDate startDate, LocalDate endDate,Long productId);
}
