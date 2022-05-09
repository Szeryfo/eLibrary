package com.eLibrary.service;

import com.eLibrary.dto.UserDto;
import com.eLibrary.mapper.UserMapper;
import com.eLibrary.model.UserEntity;
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

        var all = repository.findAll();
        return mapper.toDtos(all);
    }

    public UserDto save(UserDto userDto) {

        var userEntity = mapper.toEntity(userDto);
        UserEntity save = repository.save(userEntity);
        return mapper.toDto(save);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}