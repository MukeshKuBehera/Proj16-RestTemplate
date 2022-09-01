package com.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Project07BookByUsingOneToOneMappingRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project07BookByUsingOneToOneMappingRestApiApplication.class, args);
	}

	 @Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
}
