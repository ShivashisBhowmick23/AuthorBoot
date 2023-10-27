package com.boot.author.dto;

import com.boot.author.model.Author;
import com.boot.author.model.Book;
import lombok.Data;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;
@Data
public class AuthorWithBooksDTO {

    private Long author_id;
    private String name;
    private List<String> bookTitles;

    public AuthorWithBooksDTO(Author author, List<Book> books) {
        Long author_id = author.getAuthor_id();
        String name = author.getName();
        List<String> bookTitles = books.stream()
                .map(Book::getTitle)
                .toList();
    }
}
