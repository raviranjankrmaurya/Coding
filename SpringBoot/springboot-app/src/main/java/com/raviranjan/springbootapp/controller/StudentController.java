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

import com.raviranjan.springbootapp.dto.CreateStudentRequestDto;
import com.raviranjan.springbootapp.dto.CreateStudentResponseDto;
import com.raviranjan.springbootapp.dto.UpdateStudentRequestDto;
import com.raviranjan.springbootapp.dto.UpdateStudentResponseDto;
import com.raviranjan.springbootapp.entity.Student;
import com.raviranjan.springbootapp.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<CreateStudentResponseDto> createStudent(@Valid @RequestBody CreateStudentRequestDto studentRequestDto){
        CreateStudentResponseDto createdStudent = studentService.createStudent(studentRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);

    }
    @GetMapping("/{id}")
    public ResponseEntity<CreateStudentResponseDto> getStudent(@PathVariable Long id){
        CreateStudentResponseDto getStudent = studentService.getStudent(id);
        // if(getStudent == null){
        //     // return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        //     return ResponseEntity.notFound().build();
        // }
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(getStudent);
    }


    @GetMapping
    public ResponseEntity<List<CreateStudentResponseDto>> getAllStudent(){
        List<CreateStudentResponseDto> studentsList = studentService.getAllStudent();
        if(studentsList.isEmpty()){
            // return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentsList);
    }


    @PutMapping("/{id}")
    public ResponseEntity<UpdateStudentResponseDto> updateStudent(@PathVariable Long id, @RequestBody UpdateStudentRequestDto updateStudentRequestDto){
        UpdateStudentResponseDto updatedStudent = studentService.updateStudent(id,updateStudentRequestDto);
        if(updatedStudent == null){
            // return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(updatedStudent);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        Boolean isDelete = studentService.deleteStudent(id);
        if(!isDelete){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Record deleted");
    }

    @PatchMapping("/delete-soft/{id}")
    public ResponseEntity<String> deleteSoft(@PathVariable Long id){
        Boolean isSoftDeleted = studentService.deleteSoftly(id);
        if(!isSoftDeleted){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Record Soft deleted!");
    }
    
}
