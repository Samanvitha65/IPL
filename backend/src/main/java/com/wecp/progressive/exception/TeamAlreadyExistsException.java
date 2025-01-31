package com.wecp.progressive.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class TeamAlreadyExistsException extends RuntimeException {
    public TeamAlreadyExistsException(String message){
        super(message);
    }
}