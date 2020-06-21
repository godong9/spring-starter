package com.gdgo.starter.web.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@ApiController
public class UserController {

    @GetMapping("/users/test")
    public String userApi() {
        return "test";
    }
}
