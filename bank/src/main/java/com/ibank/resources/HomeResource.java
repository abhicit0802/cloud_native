package com.ibank.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/")
public class HomeResource {

    @GetMapping
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Hello, welcome to IBank", OK);
    }
}
