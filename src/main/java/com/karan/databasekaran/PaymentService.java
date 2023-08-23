package com.karan.databasekaran;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Optional<Payment> getPaymentById(Long id) {
        return paymentRepository.findById(id);
    }

    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public Payment updatePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public Payment approvePayment(Long id) {
        Optional<Payment> optionalPayment = paymentRepository.findById(id);
        if (optionalPayment.isPresent()) {
            Payment payment = optionalPayment.get();
            payment.setStatus(Payment.PaymentStatus.APPROVED);
            return paymentRepository.save(payment);
        }
        return null; // Handle not found case
    }

    public List<Payment> approveAllPayments() {
        List<Payment> payments = paymentRepository.findAll();
        for (Payment payment : payments) {
            payment.setStatus(Payment.PaymentStatus.APPROVED);
        }
        return paymentRepository.saveAll(payments);
    }
    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }
}
