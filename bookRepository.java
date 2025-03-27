package com.nagur.BookManagementSystem.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nagur.BookManagementSystem.model.Book;

//Repository Interface for Database Operations
@Repository
public interface bookRepository extends JpaRepository<Book, Integer>{

	 Optional<Book> findByTitle(String title);
}
