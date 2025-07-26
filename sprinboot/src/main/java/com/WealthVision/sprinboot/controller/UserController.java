package com.WealthVision.sprinboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @GetMapping("")
    public ResponseEntity<Map<String, Object>> userInfo(@AuthenticationPrincipal OAuth2User principal) {
        return ResponseEntity.ok(Map.of("info", principal.getAttributes()));
    }


}
