package com.example.magabankbackend.service;

import com.example.magabankbackend.dtos.request.LoginRequest;
import com.example.magabankbackend.dtos.response.CommonResponse;

public interface UserService {
    CommonResponse authGoogleToken(LoginRequest request);
}
