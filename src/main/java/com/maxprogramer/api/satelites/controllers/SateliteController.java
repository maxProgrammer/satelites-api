package com.maxprogramer.api.satelites.controllers;

import com.maxprogramer.api.satelites.dto.SateliteDto;
import com.maxprogramer.api.satelites.services.SateliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/satelites")
public class SateliteController {

    @Autowired
    SateliteService sateliteService;


    @GetMapping("/")
    public SateliteDto verificarSatelite(){
        SateliteDto sateliteDto = sateliteService.buscaSatelite();
        return sateliteDto;

    }

}
