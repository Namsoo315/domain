package com.example.jwt_test.global.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MessageResponse<T>{
    private T data;
    private String message;

    public MessageResponse(String message) { this.message = message;}
}
