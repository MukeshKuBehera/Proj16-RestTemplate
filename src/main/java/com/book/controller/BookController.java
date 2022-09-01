package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.dao.BookDao;
import com.book.entity.Book;

@RestController
@RequestMapping("/template/")
public class BookController {

	@Autowired
	private BookDao dao;
	
	@GetMapping("/")
	public String run() {
		return "Login Successfully...........!/nWelcome";
		
		
	}
	
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		return this.dao.addBook(book);
	}
	
	@GetMapping("/allBook")
	public List<Book> allBook(){
		return this.dao.getAllBook();
	}
	
	@PutMapping("/update")
	public Book update(@RequestBody Book book) {
		return this.dao.addBook(book);
	}
	
	
	@DeleteMapping("/delete")
	public String delete(@PathVariable int id) {
		this.dao.deleteBook(id);
		return "Deletion Successfully....!";
	}
	
	
}
