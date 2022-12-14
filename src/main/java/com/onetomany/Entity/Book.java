package com.onetomany.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;

	@Column(name = "book_name")
	private String bookName;

	@OneToMany(cascade = CascadeType.ALL, fetch= FetchType.LAZY)
	@JoinColumn(name = "book_id",referencedColumnName="bookId")
	private List<Story> storyList = new ArrayList<>();
	
	
	

	public Book(int bookId, String bookName, List<Story> storyList) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.storyList = storyList;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public List<Story> getStoryList() {
		return storyList;
	}

	public void setStoryList(List<Story> storyList) {
		this.storyList = storyList;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", storyList=" + storyList + "]";
	}
	
	
	

}