package com.raviranjan.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import com.raviranjan.springbootapp.entity.Student;

// @Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
  
}
