package com.maxprogramer.api.satelites.controllers;

import com.maxprogramer.api.satelites.services.SateliteService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/satelites")
public class SateliteController {
    @Autowired
    SateliteService sateliteService;

    @GetMapping("/")
    @Operation(summary = "Consult a satellite and add if it is not on the database and update if it is already on the database")
    public void verificarSatelite(String satelite) {

        sateliteService.importarSatelite(satelite);
    }

}
