package com.example.demo.error;

import org.springframework.http.HttpStatus;

public interface ErrorInterface {

    HttpStatus getHttpStatus();

    String getErrorMessage();

    enum ErrorEnum implements ErrorInterface {
        ID_NOT_FOUND("ID has no match in the Database", HttpStatus.BAD_REQUEST),
        INCORRECT_JSON_OBJECT("Input is in the wrong format for the database",HttpStatus.BAD_REQUEST);

        private final HttpStatus httpStatus;
        private final String errorMessage;

        ErrorEnum(String errorMessage, HttpStatus httpStatus) {
            this.httpStatus = httpStatus;
            this.errorMessage = errorMessage;

        }

        public HttpStatus getHttpStatus() {
            return httpStatus;
        }

        public String getErrorMessage() {
            return errorMessage;
        }
    }
}
