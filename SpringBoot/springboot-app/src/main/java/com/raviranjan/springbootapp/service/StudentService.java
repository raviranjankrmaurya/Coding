package com.raviranjan.springbootapp.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.raviranjan.springbootapp.dto.CreateStudentRequestDto;
import com.raviranjan.springbootapp.dto.CreateStudentResponseDto;
import com.raviranjan.springbootapp.dto.UpdateStudentRequestDto;
import com.raviranjan.springbootapp.dto.UpdateStudentResponseDto;
import com.raviranjan.springbootapp.entity.Student;
import com.raviranjan.springbootapp.exception.ResourseNotFoundException;
import com.raviranjan.springbootapp.exception.DuplicateResourseException;
import com.raviranjan.springbootapp.repository.StudentRepository;

@Service
public class StudentService {

    private StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public CreateStudentResponseDto createStudent(CreateStudentRequestDto studentReqDto){

        Student student = mapToEntity(studentReqDto);

        if(existEmail(student)){
            throw new DuplicateResourseException("Student with email " + student.getEmail() + " already exists!");
        }
        Student studentRes = studentRepository.save(student);
        return mapToDto(studentRes);
        
    }
    public CreateStudentResponseDto getStudent(Long id){
        // Optional<Student> studentResp = studentRepository.findByIdAndDeletedIsFalse(id); // it for mapToDto(studentResp.get())
        Student studentResp = studentRepository.findByIdAndDeletedIsFalse(id).orElseThrow(()-> new ResourseNotFoundException("Student with id " + id + " Not Found!")); // lemda exprestion

        // if(studentResp.isPresent()){
        //     CreateStudentResponseDto cretRes =  mapToDto(studentResp.get());
        //     cretRes.setMessage("Fatch Student Seccessfully!");
        //     return cretRes;
        // }
        // return null;
        
        // if comming runtime exception through .get() function if Optional<Student> will be null. he directally go GloableExceptionHandler class.
        // return mapToDto(studentResp.get());
        return mapToDto(studentResp);
        
    }


    public List<CreateStudentResponseDto> getAllStudent(){
        List<Student> studentResp = studentRepository.findByDeletedIsFalse();
    
        return mapToListDto(studentResp);
    }

    public UpdateStudentResponseDto updateStudent(Long id, UpdateStudentRequestDto upstudent){
        Student existingStudent = studentRepository.findByIdAndDeletedIsFalse(id).orElseThrow( () -> new ResourseNotFoundException("Student with id " + id + " Not Found!"));
        

        existingStudent.setName(upstudent.getName());
        existingStudent.setAge(upstudent.getAge());
        // existingStudent.setEmail(upstudent.getEmail());
        existingStudent.setRollNo(upstudent.getRollNo());
        existingStudent.setSubject(upstudent.getSubject());
        // existingStudent.setDeleted(false);
        existingStudent.setUpdatedAt(LocalDateTime.now());

        Student upStuResDto =  studentRepository.save(existingStudent);

        return updateMapToDto(upStuResDto);


        
        
    }

    public void deleteStudent(Long id){
            // Boolean isStudent = studentRepository.existsById(id);
            Student studentToBeDeleted =  studentRepository.findById(id).orElseThrow(() -> new ResourseNotFoundException("Student with id " + id + " Not Found!"));
            // if(!isStudent) return false;
            // studentRepository.deleteById(id);

            studentRepository.delete(studentToBeDeleted);
            // return true;
        }

    public void deleteSoftly(Long id){
        // Optional<Student> existingStudent = studentRepository.findByIdAndDeletedIsFalse(id);
        // if(existingStudent.isEmpty()){
        //     return false;
        // }
        Student studentToBeDeleted =  studentRepository.findByIdAndDeletedIsFalse(id).orElseThrow(() -> new ResourseNotFoundException("Student with id " + id + " Not Found!"));
        studentRepository.delete(studentToBeDeleted);


        // Student saveToStudent = existingStudent.get();
        studentToBeDeleted.setDeleted(true);
        studentRepository.save(studentToBeDeleted);
        // return true;
    }


    // dto entity function
    private Student mapToEntity(CreateStudentRequestDto studentRequestDto){

        Student student = new Student();
        student.setName(studentRequestDto.getName());
        student.setAge(studentRequestDto.getAge());
        student.setEmail(studentRequestDto.getEmail());
        student.setRollNo(studentRequestDto.getRollNo());
        student.setSubject(studentRequestDto.getSubject());

        student.setCreateAt(LocalDateTime.now());
        student.setUpdatedAt(LocalDateTime.now());

        student.setDeleted(false);

        return student;
    }

    private CreateStudentResponseDto mapToDto(Student student){

        CreateStudentResponseDto stuResDto = new CreateStudentResponseDto();
        stuResDto.setId(student.getId());
        stuResDto.setName(student.getName());
        stuResDto.setEmail(student.getEmail());
        stuResDto.setRollNo(student.getRollNo());
        stuResDto.setSubject(student.getSubject());
        stuResDto.setAge(student.getAge());

        stuResDto.setCreateAt(student.getCreateAt());
        stuResDto.setUpdatedAt(student.getUpdatedAt());

        stuResDto.setMessage("Student Saved Seccessfully!");

        return stuResDto;
    }

    private UpdateStudentResponseDto updateMapToDto(Student student){

        UpdateStudentResponseDto upStuReqDto = new UpdateStudentResponseDto();

        upStuReqDto.setId(student.getId());
        upStuReqDto.setName(student.getName());
        upStuReqDto.setAge(student.getAge());
        upStuReqDto.setRollNo(student.getRollNo());
        upStuReqDto.setEmail(student.getEmail());
        upStuReqDto.setSubject(student.getSubject());
        upStuReqDto.setUpdatedAt(LocalDateTime.now());
        upStuReqDto.setMessage("Student Updated Seccessfully!");

        return upStuReqDto;
    }

    private List<CreateStudentResponseDto> mapToListDto(List<Student> students){
        List<CreateStudentResponseDto> cretRes = new ArrayList<>();
        for(Student student : students){
        CreateStudentResponseDto stuResDto = new CreateStudentResponseDto();
        stuResDto.setId(student.getId());
        stuResDto.setName(student.getName());
        stuResDto.setEmail(student.getEmail());
        stuResDto.setRollNo(student.getRollNo());
        stuResDto.setSubject(student.getSubject());
        stuResDto.setAge(student.getAge());

        stuResDto.setCreateAt(student.getCreateAt());
        stuResDto.setUpdatedAt(student.getUpdatedAt());
        cretRes.add(stuResDto);
        }
        return cretRes;
    }

    private Boolean existEmail(Student stu){
        return studentRepository.existsByEmail(stu.getEmail());
    }
    
}
