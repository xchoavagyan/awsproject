package com.example.awsproject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

    @GetMapping(value = "/home")
    public ResponseEntity<String> create(){
        return ResponseEntity.ok("Maybe by ssh is disconnected");
    }
}
