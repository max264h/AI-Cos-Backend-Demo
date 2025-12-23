package com.example.magabankbackend.controller;

import com.example.magabankbackend.dtos.request.LoginRequest;
import com.example.magabankbackend.dtos.response.CommonResponse;
import com.example.magabankbackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;

    @PostMapping("/auth/google")
    private ResponseEntity<CommonResponse> authGoogleToken(@RequestBody LoginRequest request) {
        try {
            return ResponseEntity.ok().body(userService.authGoogleToken(request));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new CommonResponse(false, e.getMessage(), null));
        }
    }

}
