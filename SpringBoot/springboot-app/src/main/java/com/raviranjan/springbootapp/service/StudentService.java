package com.raviranjan.springbootapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PatchMapping;

import com.raviranjan.springbootapp.entity.Student;
import com.raviranjan.springbootapp.repository.StudentRepository;

@Service
public class StudentService {

    private StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq){

        return studentRepository.save(studentReq);
        
    }
    public Student getStudent(Long id){
        Optional<Student> studentResp = studentRepository.findById(id);
        if(studentResp.isPresent()){
            return studentResp.get();
        }
        return null;
        
    }


    public List<Student> getAllStudent(){
        List<Student> studentResp = studentRepository.findAll();
    
        return studentResp;
    }

    public Student updateStudent(Long id, Student upstudent){
        Optional<Student> existingStudent = studentRepository.findById(id);
        if(existingStudent.isEmpty()){
            return null;
        }
        Student studentToSave = existingStudent.get();
        studentToSave.setName(upstudent.getName());
        studentToSave.setAge(upstudent.getAge());
        studentToSave.setEmail(upstudent.getEmail());
        studentToSave.setRollNo(upstudent.getRollNo());
        studentToSave.setSubject(upstudent.getSubject());

        return studentRepository.save(studentToSave);


        
        
    }

    public Boolean deleteStudent(Long id){
            Boolean isStudent =  studentRepository.existsById(id);
            if(!isStudent) return false;
            studentRepository.deleteById(id);
            return true;
        }
    
}
