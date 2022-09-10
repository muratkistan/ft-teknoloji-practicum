package com.muratkistan.ft.service.impl;

import com.muratkistan.ft.dtos.UserDto;
import com.muratkistan.ft.entity.User;
import com.muratkistan.ft.repository.UserRepository;
import com.muratkistan.ft.service.abstracts.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public UserDto addUser(UserDto userDto){
        User user = modelMapper.map(userDto,User.class);
        return modelMapper.map(userRepository.save(user),UserDto.class);

    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(user -> modelMapper.map(user,UserDto.class))
                .collect(Collectors.toList());
    }

}
