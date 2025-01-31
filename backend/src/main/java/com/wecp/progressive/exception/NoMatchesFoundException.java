package com.wecp.progressive.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class  NoMatchesFoundException extends RuntimeException {
    public NoMatchesFoundException(String message){
        super(message);
    
}
}