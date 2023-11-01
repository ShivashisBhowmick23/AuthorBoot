package com.boot.author.repository;

import com.boot.author.model.BookPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookPriceRepository extends JpaRepository<BookPrice, Integer> {
}
