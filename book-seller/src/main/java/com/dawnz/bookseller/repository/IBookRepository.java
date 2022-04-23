package com.dawnz.bookseller.repository;

import com.dawnz.bookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {

}
