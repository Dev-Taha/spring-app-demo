package com.springdemo.springdemo.Repository;

import com.springdemo.springdemo.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Optional - spring already injected with JpaRepository
public interface StudentRepository
        extends JpaRepository<Student,Integer> {
    Student findByEmail(String email);
    void deleteByEmail(String email);
}
