package com.eLibrary.domain.book;

import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
interface BookMapper {

    BookDto toDto(BookEntity entity);

    List<BookDto> toDtos(List<BookEntity> entities);

    BookEntity toEntity(BookDto dto);
}