package com.eLibrary.user;

import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
interface UserMapper {

    UserDto toDto(UserEntity entity);

    List<UserDto> toDtos(List<UserEntity> entities);

    UserEntity toEntity(UserDto dto);
}