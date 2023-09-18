package com.eLibrary.domain.user;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
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