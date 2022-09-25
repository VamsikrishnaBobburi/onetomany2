package com.onetomany.jpa;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetomany.Entity.Book;
import com.onetomany.Repository.BookRepository;



@Service("bookServiceImpl")
public abstract class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	public Book saveBook(Book book) {

		book = bookRepository.save(book);
		return book;

	}

	public Book findByBookId(int bookId) {
		Book book = bookRepository.findByBookId(bookId);
		return book;
	}
}