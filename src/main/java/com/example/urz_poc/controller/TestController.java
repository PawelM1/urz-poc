package com.example.urz_poc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("test")
public class TestController {

    @GetMapping
    public ResponseEntity<String> addNewExaminee() {
        return ResponseEntity.status(HttpStatus.OK).body("Hello");
    }
}
