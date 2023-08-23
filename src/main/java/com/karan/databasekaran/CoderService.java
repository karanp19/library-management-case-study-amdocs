package com.karan.databasekaran;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoderService {
    @Autowired
    private CoderRepository coderRepository;

    public List<Coder> getAllCoders() {
        return coderRepository.findAll();
    }

    public Optional<Coder> getCoderById(Long id) {
        return coderRepository.findById(id);
    }

    public Coder createCoder(Coder coder) {
        return coderRepository.save(coder);
    }

    public Coder updateCoder(Coder coder) {
        return coderRepository.save(coder);
    }

    public void deleteCoder(Long id) {
        coderRepository.deleteById(id);
    }
}
