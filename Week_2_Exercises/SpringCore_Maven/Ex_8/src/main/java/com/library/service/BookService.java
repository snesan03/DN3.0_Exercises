package com.library.service;

import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;


@Service
public class BookService {
	BookRepository bookRepository;

	public BookRepository getBookRepository() {
		System.out.println("get");
		return bookRepository;
		
	}

	public void setBookRepository(BookRepository bookRepository) {
		System.out.println("set");
		this.bookRepository = bookRepository;
	}

	public BookService(BookRepository bookRepository) {
		super();
		System.out.println("con");
		this.bookRepository = bookRepository;
	}

	@Override
	public String toString() {
		System.out.println("str");
		return "BookService [bookRepository=" + bookRepository + "]";
	}
	
}
