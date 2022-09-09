package com.muratkistan.ft.dtos;

import com.muratkistan.ft.entity.Product;
import com.muratkistan.ft.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductCommentDto {

    private Long id;

    private String comment;

    private Date commentDate;

    private User user;

    private Product product;
}
