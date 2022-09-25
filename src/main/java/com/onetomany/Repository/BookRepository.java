package com.onetomany.Repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onetomany.Entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book,Serializable> {
	public Book findByBookId(int bookId);
}