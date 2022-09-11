package com.muratkistan.ft.dtos;

import com.muratkistan.ft.entity.ProductComment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {

    private Long id;

    @NotNull
    private String name;

    @NotNull
    private double price;


    private LocalDate expirationDate;

    private List<ProductComment> productComments;
}
