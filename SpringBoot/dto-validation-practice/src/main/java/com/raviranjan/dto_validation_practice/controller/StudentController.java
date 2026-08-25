package com.raviranjan.dto_validation_practice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raviranjan.dto_validation_practice.entity.Student;
import com.raviranjan.dto_validation_practice.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;

    }

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student studentReq){
        Student studentRes = studentService.createStudent(studentReq);
        return ResponseEntity.ok(studentRes);
    }
}
