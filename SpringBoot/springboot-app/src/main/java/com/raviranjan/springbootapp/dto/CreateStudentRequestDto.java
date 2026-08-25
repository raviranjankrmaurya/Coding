package com.raviranjan.springbootapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CreateStudentRequestDto {

    @NotBlank(message = "name can't be null/blank or empty!")
    @Size(min = 3, max = 20, message = "name must be within 3 to 20 character long")
    private String name;

    @NotNull(message = "Age is required!")
    @Min(value = 12,message = "Student must be atleast 12 year old!")
    private int age;

    @NotBlank(message = "student email can't be blank")
    @Email(message = "Student email must be valid!")
    private String email;

    @NotNull(message = "rollno is required!")
    private int rollNo;

    @NotBlank(message = "Subject is required!")
    private String subject;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
}
