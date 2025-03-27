package com.nagur.BookManagementSystem.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//Entity Class representing the Book table
@Entity 
@Table(name="books")//Changing Table Name
//using Lombok Dependecy 
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookId;
	
	//making title value not null
	@Column(nullable = false)
	private String title;
	
	//making author value not null
	@Column(nullable = false)
	private String author;
	
	private String genre;
	
	  @Enumerated(EnumType.STRING) //storing enum variable as string in DB
	    @Column(nullable = false)
	    private AvailabilityStatus availabilityStatus;
	
    // Getters and Setters
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public AvailabilityStatus getAvailabilityStatus() {
		return availabilityStatus; 
		}
    public void setAvailabilityStatus(AvailabilityStatus availabilityStatus) { 
    	this.availabilityStatus = availabilityStatus; 
    	}

	
}
