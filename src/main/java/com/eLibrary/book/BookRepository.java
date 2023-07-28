package com.eLibrary.book;

import org.springframework.data.jpa.repository.JpaRepository;

interface BookRepository extends JpaRepository<BookEntity, Long> {

}