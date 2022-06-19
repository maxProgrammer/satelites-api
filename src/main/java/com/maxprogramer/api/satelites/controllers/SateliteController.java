package com.maxprogramer.api.satelites.controllers;

import com.maxprogramer.api.satelites.model.SateliteModel;
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
    @Operation(summary = "Consult a Satelite from API and if it there is not exist on database it will be storage in database.")
    public void verificarSatelite() {
        sateliteService.importarSatelite();
    }

}
