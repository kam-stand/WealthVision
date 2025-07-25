package com.WealthVision.sprinboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AuthController {

    @GetMapping("")
    public ResponseEntity<Map<String, String>> index() {
        return ResponseEntity.ok(Map.of("message", "Hello from WealthVision Server"));
    }

}
