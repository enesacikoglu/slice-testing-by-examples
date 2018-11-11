package com.coders.istanbul.withmockmvc.controller;

import com.coders.istanbul.withmockmvc.model.response.dto.UserDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping("{id}")
    public UserDto getUserById(@PathVariable Long id) {
        UserDto userDto = new UserDto();
        userDto.setId(id);
        userDto.setMail("enes.acikoglu@gmail.com");
        userDto.setUserName("enes.acikoglu");
        return userDto;
    }
}
