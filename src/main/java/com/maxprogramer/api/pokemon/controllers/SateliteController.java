package com.maxprogramer.api.pokemon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/satelites")
public class SateliteController {

    @GetMapping("/")
    public String verificarSatelite(){
        return "satelites";
    }

}
