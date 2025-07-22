package com.codigoquatro.userservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {


    @GetMapping("/hello")
    public String Hello() {
        return "Olá CodigoQuatro! API funcionando !";
    }


    
}
