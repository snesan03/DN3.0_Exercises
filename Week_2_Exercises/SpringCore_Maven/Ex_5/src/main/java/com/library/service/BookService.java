package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	BookRepository bookRepository;

	public BookRepository getBookRepository() {
		return bookRepository;
	}

	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public String toString() {
		return "BookService [bookRepository=" + bookRepository + "]";
	}
	
}
