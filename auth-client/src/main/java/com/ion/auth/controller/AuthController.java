package com.ion.auth.controller;


import com.ion.auth.model.payload.RefreshToken;
import com.ion.auth.model.payload.request.LoginRequest;
import com.ion.auth.model.payload.response.AuthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "api/v1/auth")
public class AuthController {


    @PostMapping("/login")
    public AuthResponse signin(@Valid @RequestBody LoginRequest loginRequest) {
        return AuthResponse.builder().build();
    }

    @PostMapping("/refresh")
    public AuthResponse refresh(@Valid @RequestBody RefreshToken refreshToken) {
        return AuthResponse.builder().build();
    }

    @PostMapping("/logout")
    public ResponseEntity logout(@Valid @RequestBody RefreshToken refreshToken) {
        return ResponseEntity.ok("logged out");
    }



}
