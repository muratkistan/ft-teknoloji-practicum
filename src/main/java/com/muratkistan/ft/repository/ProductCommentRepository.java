package com.muratkistan.ft.repository;

import com.muratkistan.ft.dtos.ProductCommentDto;
import com.muratkistan.ft.entity.ProductComment;
import org.hibernate.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface ProductCommentRepository  extends JpaRepository<ProductComment,Long> {
    List<ProductComment> findAllByUserId(Long userId);

    List<ProductComment> findAllByProductId(Long productId);

    List<ProductComment> findAllByCommentDateBetweenAndUserId(Long userId, LocalDate startDate, LocalDate endDate);


    List<ProductComment> findAllByProductIdAndCommentDateBetween(Long productId, LocalDate startDate, LocalDate endDate);
}
