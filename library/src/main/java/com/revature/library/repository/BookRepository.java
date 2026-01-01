package com.revature.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.library.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
}
