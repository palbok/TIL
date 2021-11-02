package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    @NonNull
    private final UserService userService;

    @RequestMapping(value = "",method = RequestMethod.POST)
    public void add(@RequestBody User user){
        userService.save(user);
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<User> list(){
        return userService.findAll();
    }


}
