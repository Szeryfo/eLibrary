package com.eLibrary.book;

import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BookFacade {

    private final BookService service;

    public List<BookDto> getAll() {
        return service.getAll();
    }

    public BookDto save(BookDto userDto) {
        return service.save(userDto);
    }

    public void deleteById(Long id) {
        service.deleteById(id);
    }
}
