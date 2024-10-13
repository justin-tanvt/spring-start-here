package com.example.controller;

import com.example.domain.ErrorDetails;
import com.example.domain.NotEnoughMoneyException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> notEnoughMoneyExceptionHandler(NotEnoughMoneyException x) {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Exception message: [" + x.getMessage() + "]");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}
