package com.mejia.richard.zemoga.controller;

import com.mejia.richard.zemoga.model.Portafolio;
import com.mejia.richard.zemoga.service.PortafolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/portafolio")
public class PortafolioController {
    @Autowired
    PortafolioService portafolioService;

    @GetMapping("")
    public List<Portafolio> list() {
        System.out.println("portafolioService.listAllPortafolio(): "+portafolioService.listAll());
        return portafolioService.listAll();
    }

    @PostMapping("/")
    public void add(@RequestBody Portafolio portafolio) {
        portafolioService.savePortafolio(portafolio);
    }
}
