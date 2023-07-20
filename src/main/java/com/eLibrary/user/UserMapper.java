package com.eLibrary.user;

import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
interface UserMapper {

    UserDto toDto(UserEntity userEntity);

    List<UserDto> toDtos(List<UserEntity> userEntity);

    UserEntity toEntity(UserDto userDto);
}