package com.eLibrary.book;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

class BookService {

    @Autowired
    BookRepository repository;

    @Autowired
    BookMapper mapper;

    public List<BookDto> getAll() {
        var all = repository.findAll();

        return mapper.toDtos(all);
    }

    public BookDto save(BookDto dto) {
        var entity = mapper.toEntity(dto);
        var savedEntity = repository.save(entity);

        return mapper.toDto(savedEntity);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
