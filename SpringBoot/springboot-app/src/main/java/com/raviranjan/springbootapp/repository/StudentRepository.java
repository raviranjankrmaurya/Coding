package com.raviranjan.springbootapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import com.raviranjan.springbootapp.entity.Student;

// @Repository
// beacuse interface not create beans
public interface StudentRepository extends JpaRepository<Student, Long> {
  Optional<Student> findByIdAndDeletedIsFalse(Long id);
  //   findBy + fieldName + condition
  List<Student> findByDeletedIsFalse();

  Boolean existsByEmail(String str);
}
