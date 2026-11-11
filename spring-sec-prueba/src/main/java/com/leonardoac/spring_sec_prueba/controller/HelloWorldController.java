package com.leonardoac.spring_sec_prueba.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("denyAll()")
public class HelloWorldController {

    @GetMapping("/holaseg")
    @PreAuthorize("hasAuthority('READ')")
    public String secHelloWorld() {
        return "Hello Sec World!";
    }

    @GetMapping("/holanoseg")
    @PreAuthorize("permitAll()")
    public String noSecHelloWorld() {
        return "Hello no Sec World!";
    }
}
