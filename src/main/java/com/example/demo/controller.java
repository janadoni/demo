package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controller {
    @GetMapping("/get")
    public ResponseEntity<?> get(){
        return new ResponseEntity<>("Hello new Deployment project", HttpStatus.OK);
    }

}
