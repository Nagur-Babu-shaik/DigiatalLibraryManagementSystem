package com.nagur.BookManagementSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.nagur.BookManagementSystem.model.Book;
import com.nagur.BookManagementSystem.service.bookService;


//REST Controller for handling book-related API requests
@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private bookService service;
	
	
    // API to add a new book
	@PostMapping("/addBook")
    public String addBook(@RequestBody Book newBook) {
    	return service.addBook(newBook);
    }
	
    // API to retrieve all books
	@GetMapping("/view")
	public List<Book> viewAll() {	
		return service.viewAll();
	}

    // API to search for a book by ID or title
    @GetMapping("/search")
    public Optional<Book> searchBook(@RequestParam(required = false) int id, @RequestParam(required = false) String title) {
        return service.searchBook(id, title);
    }
    
    // API to update book details
    @PutMapping("/update/{id}")
    public String updateBookDetails(@PathVariable int id, @RequestBody Book updatedBook) {
    	return service.updateBookDetails(id,updatedBook);
    }
    
    // API to delete a book by ID
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
    	return service.deleteBook(id);
    }
    
    // API to exit the system (shutdown application)
    @PostMapping("/exit")
    public String exitSystem() {
    	System.exit(0);
    	return "Shutting Down Digital Library System";
    }
     

}
