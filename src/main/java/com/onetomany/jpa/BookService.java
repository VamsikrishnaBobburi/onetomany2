package com.onetomany.jpa;

import org.springframework.stereotype.Component;

import com.onetomany.Entity.Book;

@Component
public interface BookService {
	public Book saveBook(Book book);
	public Book findByBookId(int bookId);
}