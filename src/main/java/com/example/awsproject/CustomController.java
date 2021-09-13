package com.example.awsproject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

    @GetMapping(value = "/home/{text}")

    public ResponseEntity<String> create(@PathVariable String text ){
        text = "you write " + text;
        return ResponseEntity.ok(text);
    }
}
