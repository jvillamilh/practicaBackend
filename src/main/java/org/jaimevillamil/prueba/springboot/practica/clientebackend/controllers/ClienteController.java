package org.jaimevillamil.prueba.springboot.practica.clientebackend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {

    @GetMapping("/details")
    public String details() {
            return "datails";
        
    }

}
