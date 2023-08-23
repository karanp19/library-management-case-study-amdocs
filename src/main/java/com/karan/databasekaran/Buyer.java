package com.karan.databasekaran;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Table(name = "buyer")
@Entity
public class Buyer {
    // Getters and setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
