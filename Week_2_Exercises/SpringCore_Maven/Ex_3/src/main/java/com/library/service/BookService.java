package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;


@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;
	
	
	
	
	
	public BookRepository getBookRepository() {
		return bookRepository;
	}


	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
		System.out.println("Book repositiry is initialized");
	}
	public void addBook() {
        // Simulate adding a book
        System.out.println("Book added");
    }

    public void deleteBook() {
        // Simulate deleting a book
        System.out.println("Book deleted");
    }


	BookService(){
		System.out.println("Servicing the book");
	}


	@Override
	public String toString() {
		return "BookService [bookRepository=" + bookRepository + "]";
	}



}
