package com.codingdojo.book_club.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.book_club.models.Book;

public interface BookRepository extends CrudRepository<Book,Long>{
    List<Book> findAll();
}
