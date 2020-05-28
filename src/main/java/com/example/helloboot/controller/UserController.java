package com.example.helloboot.controller;

import com.example.helloboot.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    @GetMapping("/")
    public String getUser(){
        User user= User.builder().name("민").age(300).build();
        log.info(">>>>> user={}", user);
        return user.toString();
    }

}
