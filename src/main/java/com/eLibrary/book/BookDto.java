package com.eLibrary.book;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonAutoDetect(fieldVisibility = ANY)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class BookDto {

    Long id;
    String name;
    String publisher; //dictionary?
    Integer publicationYear;
    String author;
    Long noOfInStock;
}