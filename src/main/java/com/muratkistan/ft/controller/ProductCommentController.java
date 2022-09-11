package com.muratkistan.ft.controller;

import com.muratkistan.ft.dtos.ProductCommentDto;
import com.muratkistan.ft.dtos.UserDto;
import com.muratkistan.ft.service.abstracts.ProductCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/comments")
public class ProductCommentController {

    private  final ProductCommentService productCommentService;


    @PostMapping("/add")
    public ResponseEntity<ProductCommentDto> addUser(@Valid @RequestBody ProductCommentDto productCommentDto){
        return ResponseEntity.ok(productCommentService.addComments(productCommentDto));
    }


    @GetMapping("/getCommentByProductId/{productId}")
    public ResponseEntity<List<ProductCommentDto>> getCommentByProductId(@PathVariable Long productId){
        return ResponseEntity.ok(productCommentService.getCommentByProductId(productId));

    }

    @GetMapping("/getCommentByUserId/{userId}")
    public ResponseEntity<List<ProductCommentDto>> getCommentByUserId(@PathVariable Long userId){
        return ResponseEntity.ok(productCommentService.getCommentByUserId(userId));

    }

    @GetMapping("/getCommentByUserIdWithDate/{userId}/")
    public ResponseEntity<List<ProductCommentDto>> getCommentByUserIdWithDate(
            @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate,
            @PathVariable(name = "userId") Long userId
    ){
        return ResponseEntity.ok(productCommentService.findAllByCommentDateBetweenAndUserId(startDate,endDate,userId));

    }

    @GetMapping("/getCommentByProductIdWithDate/{productId}/")
    public ResponseEntity<List<ProductCommentDto>> getCommentByProductIdWithDate(
            @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate,
            @PathVariable(name = "productId") Long productId
    ){
        return ResponseEntity.ok(productCommentService.findAllByCommentDateBetweenAndProductId(startDate,endDate,productId));

    }

    @GetMapping("/getAllComments")
    public ResponseEntity<List<ProductCommentDto>> getAllComments(){
        return ResponseEntity.ok(productCommentService.getAllComments());

    }







}
