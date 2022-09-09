package com.muratkistan.ft.service.abstracts;

import com.muratkistan.ft.dtos.UserDto;

import java.util.List;

public interface UserService {

     UserDto addUser(UserDto userDto);
     List<UserDto> getAllUsers();
}
