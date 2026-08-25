package com.raviranjan.springbootapp.exception;

public class DuplicateResourseException extends RuntimeException{

    public DuplicateResourseException(String message) {
        super(message);
    }

}