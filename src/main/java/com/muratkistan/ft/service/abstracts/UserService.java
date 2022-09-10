package com.muratkistan.ft.service.abstracts;

import com.muratkistan.ft.dtos.UserDto;
import com.muratkistan.ft.entity.User;

import java.util.List;

public interface UserService {

     UserDto addUser(UserDto userDto);
     List<UserDto> getAllUsers();

}
