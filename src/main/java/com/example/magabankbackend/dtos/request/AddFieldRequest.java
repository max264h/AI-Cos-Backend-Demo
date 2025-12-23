package com.example.magabankbackend.dtos.request;

import java.time.LocalDateTime;

public record AddFieldRequest(
        String fieldName,
        String fieldAddress,
        LocalDateTime fieldContractEndTime
) {
}
