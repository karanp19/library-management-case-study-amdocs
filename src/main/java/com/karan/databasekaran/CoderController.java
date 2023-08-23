package com.karan.databasekaran;
import com.karan.databasekaran.Coder;
import com.karan.databasekaran.CoderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/coders")
public class CoderController {
    @Autowired
    private CoderService coderService;

    @GetMapping
    public List<Coder> getAllCoders() {
        return coderService.getAllCoders();
    }

    @GetMapping("/{id}")
    public Optional<Coder> getCoder(@PathVariable Long id) {
        return coderService.getCoderById(id);
    }

    @PostMapping
    public Coder createCoder(@RequestBody Coder coder) {
        return coderService.createCoder(coder);
    }

    @PutMapping("/{id}")
    public Coder updateCoder(@PathVariable Long id, @RequestBody Coder coder) {
        coder.setId(id);
        return coderService.updateCoder(coder);
    }

    @DeleteMapping("/{id}")
    public void deleteCoder(@PathVariable Long id) {
        coderService.deleteCoder(id);
    }
}
