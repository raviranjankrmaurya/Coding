package com.raviranjan.dto_validation_practice.service;

import org.springframework.stereotype.Service;

import com.raviranjan.dto_validation_practice.entity.Student;
import com.raviranjan.dto_validation_practice.repository.StudentRepository;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;

    }
    public Student createStudent(Student studentReq){
        return studentRepository.save(studentReq);
        
    }
    
}
