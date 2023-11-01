package com.boot.author.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class BookPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int bookid;
    float bookprice;
    String bookdescription;

    @OneToOne
    @JoinColumn(name = "id")
    Book book;

}
