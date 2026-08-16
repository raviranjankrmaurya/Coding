package com.raviranjan.springbootapp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raviranjan.springbootapp.entity.Student;
import com.raviranjan.springbootapp.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student createdStudent = studentService.createStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);

    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        Student getStudent = studentService.getStudent(id);
        if(getStudent == null){
            // return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(getStudent);
    }


    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> studentsList = studentService.getAllStudent();
        if(studentsList.isEmpty()){
            // return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentsList);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student){
        Student updatedStudent = studentService.updateStudent(id,student);
        if(updatedStudent == null){
            // return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(updatedStudent);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        Boolean isDelete = studentService.deleteStudent(id);
        if(!isDelete){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Record deleted");
    }
    
}
