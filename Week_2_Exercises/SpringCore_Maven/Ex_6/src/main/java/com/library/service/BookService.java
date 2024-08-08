package com.library.service;

import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;


@Service
public class BookService {
	BookRepository bookRepository;

	public BookRepository getBookRepository() {
		return bookRepository;
	}

	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public String toString() {
		return "BookService [bookRepository=" + bookRepository + "]";
	}
	
}
