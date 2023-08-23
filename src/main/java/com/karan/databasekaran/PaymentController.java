package com.karan.databasekaran;
import com.karan.databasekaran.Payment;
import com.karan.databasekaran.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @GetMapping("/{id}")
    public Optional<Payment> getPayment(@PathVariable Long id) {
        return paymentService.getPaymentById(id);
    }

    @PostMapping
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.createPayment(payment);
    }

    @PutMapping("/{id}")
    public Payment updatePayment(@PathVariable Long id, @RequestBody Payment payment) {
        payment.setId(id);
        return paymentService.updatePayment(payment);
    }
    @PutMapping("/{id}/approve")
    public Payment approvePayment(@PathVariable Long id) {
        return paymentService.approvePayment(id);
    }

    @PutMapping("/approve-all")
    public List<Payment> approveAllPayments() {
        return paymentService.approveAllPayments();
    }

    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable Long id) {
        paymentService.deletePayment(id);
    }
}
