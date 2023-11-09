package com.codingdojo.book_club.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.book_club.models.Book;
import com.codingdojo.book_club.repositories.BookRepository;

@Service
public class BookService {
    
    private final BookRepository bookRepository;

    // ?
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    // Create Book
    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    // Find All
    public List<Book> allBooks(){
        return bookRepository.findAll();
    }

    // Find One Book
    public Book findBook(Long id){
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()){
            return optionalBook.get();
        }
        return null;
    }

    // Update Book
    public Book updateBook(Book book){
        return bookRepository.save(book);
    }

    // Delete Book
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }


}
