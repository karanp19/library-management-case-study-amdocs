package com.karan.databasekaran;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "payment")
public class Payment {
    // Getters and setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String paymentMethod;
    private double amount;
    private PaymentStatus status = PaymentStatus.NONE; // Default status

    public enum PaymentStatus {
        APPROVED,
        REJECTED,
        NONE
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
