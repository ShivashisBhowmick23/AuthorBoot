package com.boot.author.repository;

import com.boot.author.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
//@Query("select ")
//    List<Book> getByAuthorId(int Id);
}
