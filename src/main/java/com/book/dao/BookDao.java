package com.book.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.entity.Book;
import com.book.services.BookRepo;
@Component
public class BookDao {
	
	@Autowired
	private BookRepo bookRepo;

	//adding book
	public Book addBook(Book book) {
		
		return bookRepo.save(book);
		
	}
	//get all the book
	public List<Book> getAllBook(){
		List<Book> allBook=bookRepo.findAll();
		return allBook;
	}
	
	//update book 
	public void update(Book book,int id) {
		bookRepo.save(book);
	}
	
	//delete book
	
	public String deleteBook(int id) {
		this.bookRepo.deleteAll();
		return "deletion sucessfull";
	}
}
