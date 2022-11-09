package com.example.demo.error;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class DemoProjectException extends RuntimeException {

    private HttpStatus httpStatus;

    public DemoProjectException(String message) {
        super(message);
    }

    public DemoProjectException(HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
