package com.muratkistan.ft.controller;

import com.muratkistan.ft.dtos.ProductCommentDto;
import com.muratkistan.ft.dtos.UserDto;
import com.muratkistan.ft.service.abstracts.ProductCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/comments")
public class ProductCommentController {


    private  final ProductCommentService productCommentService;


    @PostMapping("/add")
    public ResponseEntity<ProductCommentDto> addUser(@RequestBody ProductCommentDto productCommentDto){
        return ResponseEntity.ok(productCommentService.addComments(productCommentDto));
    }

    @GetMapping("/getByProductId/{productId}")
    public ResponseEntity<List<ProductCommentDto>> getCommentByProductId(@PathVariable Long productId){
        return ResponseEntity.ok(productCommentService.getCommentByProductId(productId));

    }

    @GetMapping("/getByUserId/{userId}")
    public ResponseEntity<List<ProductCommentDto>> getCommentByUserId(@PathVariable Long userId){
        return ResponseEntity.ok(productCommentService.getCommentByUserId(userId));

    }

    @GetMapping("/getByUserIdWithDate/{userId}/{startDate}/{endDate}")
    public ResponseEntity<List<ProductCommentDto>> getCommentByUserIdWithDate(
            @PathVariable Long userId,
            @PathVariable LocalDate startDate,
            @PathVariable LocalDate endDate
    ){
        return ResponseEntity.ok(productCommentService.findAllByUserIdAndCommentDateBetween(userId,startDate,endDate));

    }





}
