package com.eLibrary.service;

import com.eLibrary.dto.UserDto;
import com.eLibrary.mapper.UserMapper;
import com.eLibrary.model.User;
import com.eLibrary.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Service {

    @Autowired
    UserRepository repository;

    @Autowired
    UserMapper mapper;

    public List<UserDto> getAll() {
        List<User> all = repository.findAll();

        return mapper.toDtos(all);
    }
}