package com.muratkistan.ft.controller;

import com.muratkistan.ft.dtos.UserDto;
import com.muratkistan.ft.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {

    private  final UserServiceImpl userService;

    @PostMapping("/add")
    public ResponseEntity<UserDto> addUser( @RequestBody UserDto userdto){
        return ResponseEntity.ok(userService.addUser(userdto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<UserDto>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());

    }
}
