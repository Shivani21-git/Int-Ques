package com.hackerrank.restcontrolleradvice.exception;

import com.hackerrank.restcontrolleradvice.dto.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class FizzBuzzExceptionHandler extends ResponseEntityExceptionHandler {

  //TODO:: implement handler methods for FizzException, BuzzException and FizzBuzzException


    @ExceptionHandler(BuzzException.class)
    public final ResponseEntity<Object>
    handleBuzzException(BuzzException ex
    ) {


        return new ResponseEntity<>(new GlobalError(ex.getMessage(), ex.getErrorReason()),HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(FizzBuzzException.class)
    public final ResponseEntity<Object>
    handleFizzBuzzException(FizzBuzzException ex
    ) {


        return new ResponseEntity<>(new GlobalError(ex.getMessage(), ex.getErrorReason()),HttpStatus.INSUFFICIENT_STORAGE);
    }

}
