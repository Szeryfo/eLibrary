package com.eLibrary.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class UserService {

    @Autowired
    UserRepository repository;

    @Autowired
    UserMapper mapper;

    public List<UserDto> getAll() {
        var all = repository.findAll();

        return mapper.toDtos(all);
    }

    public UserDto save(UserDto dto) {
        var entity = mapper.toEntity(dto);
        var savedEntity = repository.save(entity);

        return mapper.toDto(savedEntity);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}