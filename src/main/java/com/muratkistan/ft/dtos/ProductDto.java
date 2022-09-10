package com.muratkistan.ft.dtos;

import com.muratkistan.ft.entity.ProductComment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDate;
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

    private LocalDate expirationDate;

    private List<ProductComment> productComments;
}
