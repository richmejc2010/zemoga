package com.mejia.richard.zemoga.controller;

import com.mejia.richard.zemoga.model.Portafolio;
import com.mejia.richard.zemoga.service.PortafolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PortafolioController {
    @Autowired
    PortafolioService portafolioService;

    @RequestMapping(value = "/v1/api/portafolio/",
            method = RequestMethod.GET,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Portafolio> list() {
        System.out.println("portafolioService.listAllPortafolio(): "+portafolioService.listAll());
        return portafolioService.listAll();
    }

    @RequestMapping(value = "/v1/api/portafolio/{id}",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void add(@RequestBody Portafolio portafolio) {
        portafolioService.savePortafolio(portafolio);
    }

    @RequestMapping(value = "/v1/api/portafolio/{id}",
            method = RequestMethod.DELETE,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable("id") int portafolioID) {
        portafolioService.delete(portafolioID);
    }
}
