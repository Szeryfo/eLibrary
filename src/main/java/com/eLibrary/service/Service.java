package com.eLibrary.service;

import com.eLibrary.dto.UserDto;
import com.eLibrary.mapper.UserMapper;
import com.eLibrary.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
        var save = repository.save(userEntity);

        return mapper.toDto(save);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}