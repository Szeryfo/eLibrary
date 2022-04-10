package com.eLibrary.mapper;

import com.eLibrary.dto.UserDto;
import com.eLibrary.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    List<UserDto> toDtos(List<User> user);
}