package com.eLibrary.domain.book;

import static org.assertj.core.api.Assertions.assertThat;

import com.eLibrary.domain.book.BookDto;
import com.eLibrary.domain.book.BookMapper;
import org.junit.jupiter.api.RepeatedTest;

class BookMapperTest {

    private final BookMapper mapper = new BookMapperImpl();

    @RepeatedTest(10000)
    public void testMapping() {
        // given
        var dto = BookDto.builder()
            .id(1L)
            .name("name")
            .publisher("publisher")
            .publicationYear(2023)
            .author("author")
            .noOfInStock(10)
            .build();

        // when
        var entity = mapper.toEntity(dto);

        // then
        assertThat(entity)
            .hasFieldOrPropertyWithValue("id", 1L)
            .hasFieldOrPropertyWithValue("name","name")
            .hasFieldOrPropertyWithValue("publisher", "publisher")
            .hasFieldOrPropertyWithValue("publicationYear", 2023)
            .hasFieldOrPropertyWithValue("author","author")
            .hasFieldOrPropertyWithValue("noOfInStock",10);
    }
}