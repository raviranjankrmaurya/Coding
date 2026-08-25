package com.raviranjan.springbootapp.exception;

public class ResourseNotFoundException extends RuntimeException{
    public ResourseNotFoundException(String message){
        super(message);
    }
}
