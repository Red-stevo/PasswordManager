package com.bughunters.code.passwordmanagerwebapplication.response;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class EmailVerificationResponse {

    private String token;

    private String message;
}
