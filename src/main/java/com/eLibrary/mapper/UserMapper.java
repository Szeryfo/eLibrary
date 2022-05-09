package com.eLibrary.mapper;

import com.eLibrary.dto.UserDto;
import com.eLibrary.model.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(UserEntity userEntity);

    List<UserDto> toDtos(List<UserEntity> userEntity);

    UserEntity toEntity(UserDto userDto);
}