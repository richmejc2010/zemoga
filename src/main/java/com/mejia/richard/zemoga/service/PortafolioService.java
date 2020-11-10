package com.mejia.richard.zemoga.service;

import com.mejia.richard.zemoga.model.Portafolio;
import com.mejia.richard.zemoga.repository.PortafolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PortafolioService {
    @Autowired
    private PortafolioRepository portafolioRepository;

    public List<Portafolio> listAll() {
        return portafolioRepository.findAll();
    }

    public void savePortafolio(Portafolio portafolio) {
        portafolioRepository.save(portafolio);
    }

    public void delete(Integer id) {
        portafolioRepository.delete(id);
    }
}
