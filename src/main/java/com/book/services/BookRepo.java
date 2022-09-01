package com.book.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {

	List<Book> findAll();

	
}
