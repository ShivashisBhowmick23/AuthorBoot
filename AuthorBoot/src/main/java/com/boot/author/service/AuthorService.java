package com.boot.author.service;

import com.boot.author.dto.AuthorWithBooksDTO;
import com.boot.author.model.Author;
import com.boot.author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<AuthorWithBooksDTO> getAllAuthorsWithBooks() {
        List<Author> authors = authorRepository.findAll();
        return authors.stream()
                .map(author -> new AuthorWithBooksDTO(author, author.getBooks()))
                .collect(Collectors.toList());
    }

}
