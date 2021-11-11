package com.ion.solutions.profiles.controller;

import com.ion.solutions.profiles.model.UserProfile;
import com.ion.solutions.profiles.model.payload.request.SignupRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;


@RestController
@RequestMapping(value = "/api/v1/profiles")
public class ProfilesController {

    @PostMapping
    public ResponseEntity<UserProfile> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
        return  ResponseEntity
                .status(HttpStatus.CREATED)
                .body(UserProfile
                        .builder()
                        .id(UUID.randomUUID())
                        .email("test@email.com")
                        .firstName("John")
                        .lastName("Doe")
                        .build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserProfile> updateProfile(@RequestBody UserProfile newProfile, @PathVariable("id") String id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(newProfile);
    }

}
