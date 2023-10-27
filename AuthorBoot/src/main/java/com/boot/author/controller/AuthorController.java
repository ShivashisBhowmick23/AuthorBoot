package com.boot.author.controller;

import com.boot.author.dto.AuthorWithBooksDTO;
import com.boot.author.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/authors")
    public class AuthorController {
        @Autowired
        private AuthorService authorService;

        @GetMapping
        public List<AuthorWithBooksDTO> getAllAuthorsWithBooks() {
            return authorService.getAllAuthorsWithBooks();
        }
    }
