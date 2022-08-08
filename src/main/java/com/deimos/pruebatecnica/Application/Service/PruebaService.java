package com.deimos.pruebatecnica.Application.Service;

import com.deimos.pruebatecnica.Domain.Repository.PruebaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PruebaService {

    @Autowired
    PruebaRepository pruebaRepository;

    public Object getAll() {
        return pruebaRepository.getAll();
    }

    public Object getByName(String name) {
        return pruebaRepository.getByName(name);
    }

    public Object getUserStats() {
        return pruebaRepository.getStats();
    }
}
