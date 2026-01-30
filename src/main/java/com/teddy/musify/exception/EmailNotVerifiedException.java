package com.teddy.musify.exception;

public class EmailNotVerifiedException extends RuntimeException{
    public EmailNotVerifiedException(String message) {
        super(message);
    }
}

