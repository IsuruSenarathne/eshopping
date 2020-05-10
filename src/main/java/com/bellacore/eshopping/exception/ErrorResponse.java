package com.bellacore.eshopping.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.time.ZonedDateTime;

@Data
public class ErrorResponse implements Serializable {
    private final String message;
    private final String details;

    public ErrorResponse(String message, String details) {
        this.message = message;
        this.details = details;
    }
}
