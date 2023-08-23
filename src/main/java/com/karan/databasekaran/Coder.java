package com.karan.databasekaran;
import jakarta.persistence.*;
import lombok.Getter;


@Entity
@Getter
@Table(name = "coder")
public class Coder {
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
