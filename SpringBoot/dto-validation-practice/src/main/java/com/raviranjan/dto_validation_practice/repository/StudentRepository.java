package com.raviranjan.dto_validation_practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raviranjan.dto_validation_practice.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
