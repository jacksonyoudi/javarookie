package com.example.rookie.controller;


import com.example.rookie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.rookie.mapper.UserMapper;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{id}")
    public String getUser(@PathVariable Integer id) {
        User user = this.userMapper.findById(id);
        return user.toString();
    }
}
