package com.revature.library.config;

import org.springframework.context.annotation.Configuration;

import com.revature.library.model.Book;
import com.revature.library.repository.BookRepository;

import jakarta.annotation.PostConstruct;

@Configuration
public class DataSeeder {
    // seed the database with 5 book
    // use constructor injection to inject the BookRepository
    private final BookRepository bookRepository;

    public DataSeeder(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    @PostConstruct
    public void seed() {
        bookRepository.save(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234"));
        bookRepository.save(new Book("To Kill a Mockingbird", "Harper Lee", "333"));
        bookRepository.save(new Book("1984", "George Orwell", "12341234"));
        bookRepository.save(new Book("The Catcher in the Rye", "J.D. Salinger", "44"));
        bookRepository.save(new Book("The Hobbit", "J.R.R. Tolkien", "11"));

    }
    
    
    
}
