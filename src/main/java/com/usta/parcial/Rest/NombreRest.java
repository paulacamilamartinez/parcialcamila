package com.usta.parcial.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class NombreRest {


    @GetMapping("/nombre")
    private String Test() {
        return "hola mi nombre es "+"paula";
    }


}
