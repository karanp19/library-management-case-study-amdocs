package com.karan.databasekaran;
import com.karan.databasekaran.Buyer;
import com.karan.databasekaran.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/buyers")
public class BuyerController {
    @Autowired
    private BuyerService buyerService;

    @GetMapping
    public List<Buyer> getAllBuyers() {
        return buyerService.getAllBuyers();
    }

    @GetMapping("/{id}")
    public Optional<Buyer> getBuyer(@PathVariable Long id) {
        return buyerService.getBuyerById(id);
    }

    @PostMapping
    public Buyer createBuyer(@RequestBody Buyer buyer) {
        return buyerService.createBuyer(buyer);
    }

    @PutMapping("/{id}")
    public Buyer updateBuyer(@PathVariable Long id, @RequestBody Buyer buyer) {
        buyer.setId(id);
        return buyerService.updateBuyer(buyer);
    }

    @DeleteMapping("/{id}")
    public void deleteBuyer(@PathVariable Long id) {
        buyerService.deleteBuyer(id);
    }
}
