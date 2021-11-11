package com.ion.solutions.profiles.controller;

import com.ion.solutions.profiles.model.UserProfile;
import com.ion.solutions.profiles.model.payload.request.SignupRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping(value = "/api/v1/profiles")
public class ProfilesController {

    @PostMapping("/signup")
    public ResponseEntity<UserProfile> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
        return  ResponseEntity.status(HttpStatus.CREATED).body(UserProfile.builder().build());
    }

}
