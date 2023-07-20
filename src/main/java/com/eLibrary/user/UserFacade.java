package com.eLibrary.user;

import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserFacade {

    private final UserService service;

    public List<UserDto> getAll() {
        return service.getAll();
    }

    public UserDto save(UserDto userDto) {
        return service.save(userDto);
    }

    public void deleteById(Long id) {
        service.deleteById(id);
    }
}