package com.deimos.pruebatecnica.Infrastructure.Exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.sql.Timestamp;

@Data
public class CustomExceptionModel {
    private final String message;
    private final HttpStatus httpStatus;
    private final Timestamp timestamp;
}
