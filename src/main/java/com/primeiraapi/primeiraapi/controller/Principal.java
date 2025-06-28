package com.primeiraapi.primeiraapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")


public class Principal {

    @GetMapping("/metodo1")
    public String metodo1(){
        return "Eu sou inévitavel";
    }
    
    @PutMapping("/metodo2")
    public String metodo2(){
        return "Eu sou BatMan!!!";
    }

}
