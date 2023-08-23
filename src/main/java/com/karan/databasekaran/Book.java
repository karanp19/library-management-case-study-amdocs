package com.karan.databasekaran;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "book")
public class Book {
    // Getters and setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
