package com.eLibrary.controller;

import com.eLibrary.dto.UserDto;
import com.eLibrary.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    Service service;

    @GetMapping
    public List<UserDto> getAll() {
        return service.getAll();
    }
}