package com.muratkistan.ft.repository;

import com.muratkistan.ft.dtos.ProductDto;
import com.muratkistan.ft.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {


    @Query("From Product p where p.expirationDate <= :expirationDate ")
    List<Product> getAllExpiredProducts(LocalDate expirationDate);

    @Query("From Product p where p.expirationDate >	 :expirationDate or p.expirationDate=null  ")
    List<Product> getAllNotExpiredProducts(LocalDate expirationDate);
}
