package com.gomezdevlopment.readmore.services;

import com.gomezdevlopment.readmore.models.Book;
import com.gomezdevlopment.readmore.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteBookById(id);
    }

    public List<Book> getUserBooks(String userId){
        return bookRepository.getUserBooks(userId);
    }

    public Book getBookById(Long id){
        return bookRepository.getBookById(id);
    }
}
