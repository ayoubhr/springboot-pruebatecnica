package com.deimos.pruebatecnica.Infrastructure.Exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomException extends RuntimeException {
    public CustomException() {
        super();
    }

    public CustomException(
            String message
    ) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
