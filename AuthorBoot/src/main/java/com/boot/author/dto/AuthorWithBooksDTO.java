package com.boot.author.dto;

import com.boot.author.model.Author;
import com.boot.author.model.Book;
import com.boot.author.model.BookPrice;
import lombok.Data;

import java.util.List;

@Data
public class AuthorWithBooksDTO {

    private int author_id;
    private String name;
    private List<Book> bookTitles;
    private BookPrice book_details;

    public AuthorWithBooksDTO(Author author, List<Book> books) {
         author_id = author.getAuthor_id();
         name = author.getName();
      bookTitles = books.stream()
                .toList();
    }
}
