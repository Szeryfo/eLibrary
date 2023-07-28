package com.eLibrary.book;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
class BookController {

    BookFacade facade;

    @GetMapping
    public List<BookDto> getAll() {
        return facade.getAll();
    }

    @PostMapping
    public BookDto save(@RequestBody BookDto userDto) {
        return facade.save(userDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        facade.deleteById(id);
    }

}
