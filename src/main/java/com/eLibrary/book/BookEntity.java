package com.eLibrary.book;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "book")
@Setter
@Getter
class BookEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;

    String name;
    String publisher; //dictionary?
    Integer publicationYear;
    String author;
    Long noOfInStock;

}
