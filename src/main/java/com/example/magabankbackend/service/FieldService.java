package com.example.magabankbackend.service;

import com.example.magabankbackend.dtos.request.AddFieldRequest;
import com.example.magabankbackend.dtos.response.CommonResponse;

public interface FieldService {
    CommonResponse addField(AddFieldRequest addFieldRequest);

    CommonResponse getField();
}
