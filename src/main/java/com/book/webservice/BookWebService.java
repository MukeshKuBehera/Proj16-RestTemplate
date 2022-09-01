package com.book.webservice;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.book.entity.Book;

public class BookWebService {

	@Autowired
	RestTemplate restTemplate;

	// getting all book
	@RequestMapping(value = "/template/allBook")
	public String getProductList() {
		HttpHeaders headers = new HttpHeaders();
		 headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		return restTemplate.exchange("http://localhost:8080/allBook", HttpMethod.GET, entity, String.class).getBody();
	}

	// add book
	@RequestMapping(value = "/template/addBook", method = RequestMethod.POST)
	public String createProducts(@RequestBody Book book) {
		HttpHeaders headers = new HttpHeaders();
		// headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Book> entity = new HttpEntity<Book>(book, headers);

		return restTemplate.exchange("http://localhost:8080/addBook", HttpMethod.POST, entity, String.class).getBody();
	}
	// update Book

	@RequestMapping(value = "/template/update", method = RequestMethod.PUT)
	public String updateProduct(@RequestBody Book book) {
		HttpHeaders headers = new HttpHeaders();
		// headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Book> entity = new HttpEntity<Book>(book, headers);

		return restTemplate.exchange("http://localhost:8080/update", HttpMethod.PUT, entity, String.class).getBody();
	}

	// delete book

	@RequestMapping(value = "/template/delete/{id}", method = RequestMethod.DELETE)
	public String deleteProduct(@PathVariable("id") String id) {
		HttpHeaders headers = new HttpHeaders();
		// headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Book> entity = new HttpEntity<Book>(headers);

		return restTemplate.exchange("http://localhost:8080/book/" + id, HttpMethod.DELETE, entity, String.class)
				.getBody();
	}

}
