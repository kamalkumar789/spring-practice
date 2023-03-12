package com.example.cloudserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllerr {

    @Autowired
    private Configuration configuration;

    @GetMapping("/")
    private String getUsernameAndPassword(){
        return configuration.getUsername();
    }

    @PostMapping("/check")
    private String getUserNameAndPassword(){
        return configuration.getUsername();
    }
}
