package com.nagur.BookManagementSystem.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nagur.BookManagementSystem.dao.bookRepository;
import com.nagur.BookManagementSystem.model.Book;

//Service Layer for handling business logic
@Service
public class bookService {

	@Autowired
	private bookRepository repo;
	
	
    // Adds a new book, ensuring unique ID
	public String addBook(Book newBook) {
		if(repo.existsById(newBook.getBookId())) {
			return "Book Id Must Be Unique";
		}
		 repo.save(newBook);
		 return "Book Added Successfully";
	}
	
    // Retrieves all books from the database
	public List<Book> viewAll(){
		return repo.findAll();
	}
	
    // Searches for a book by ID or title
	public Optional<Book> searchBook(int id, String title) {
        if (id != 0) {
            return repo.findById(id);
        } else if (title != null) {
            return repo.findByTitle(title);
        }
        return Optional.empty();
    }

    // Updates book details if book exists
	public String updateBookDetails(int id,Book updatedBook) {
		if(!repo.existsById(id)) {
			return "Book not Found";
		}
		repo.save(updatedBook);
		return "Book updated Successfully";
	}
	
    // Deletes a book by ID if it exists
	public String deleteBook(int id) {
		if(!repo.existsById(id)) {
			return "Book Is Not In The Library";
		}
		repo.deleteById(id);
		return "Book Deleted Successfully";
	}
	
	
}
