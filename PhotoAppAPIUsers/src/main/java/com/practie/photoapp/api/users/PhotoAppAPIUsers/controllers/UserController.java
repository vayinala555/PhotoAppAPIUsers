package com.practie.photoapp.api.users.PhotoAppAPIUsers.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/status")
    public String checkStatus() {
        return "service is in active state";
    }
}
