package com.mejia.richard.zemoga.repository;

import com.mejia.richard.zemoga.model.Portafolio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PortafolioRepository extends JpaRepository<Portafolio, Integer> {
    List<Portafolio> listAllPortafolio() ;

    void savePortafolio(Portafolio portafolio);

    void deleteAll(Integer id);
}
