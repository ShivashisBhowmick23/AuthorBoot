package com.boot.author;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class AuthorBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorBootApplication.class, args);
	}

}
