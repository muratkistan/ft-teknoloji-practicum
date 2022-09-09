package com.muratkistan.ft.dtos;

import com.muratkistan.ft.entity.ProductComment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {

    private Long id;

    private String name;

    private double price;

    private Date expirationDate;

    private List<ProductComment> productComments;
}
