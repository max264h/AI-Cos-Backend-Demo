package com.example.magabankbackend.service;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;

import java.util.Optional;

public interface GoogleAuthService {

    Optional<GoogleIdToken.Payload> verifyToken(String idTokenString);
}
