package com.example.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class CustomErrorResponse {
    private LocalDateTime timeStamp;
    private int statusCode;
    private String errorMessage;
}
